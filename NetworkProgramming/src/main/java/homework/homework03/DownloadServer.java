package homework.homework03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/16 10:33
 * 编写一个客户端和服务端
 * 客户端可以输入一个文件名，客户端收到文件名后给客户端返回这个文件，如果服务端没有这个文件，
 * 则返回一个默认文件
 * 客户端收到这个文件后保存到本地
 */
public class DownloadServer {
    public static void main(String[] args) throws IOException {
        //编写服务端在8888端口监听
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等到客户端连接....");
        //等到客户端连接，若连接成功则返回一个Socket对象
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接成功....");
        //接收从客户端发送的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        String fileName = line;
        File file = new File("D:\\video\\" + line + ".wmv");
        //如果文件不存则返回默认的文件
        if (!file.exists()){
            file = new File("D:\\video\\mysql基本增删改查.wmv");
            fileName = "mysql基本增删改查";
        }
        System.out.println("返回文件的名称：" + fileName);
        //将文件名返回给客户端
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(fileName);
        //标志结束位置 -- 以换行结束
        bw.newLine();
        //刷新流
        bw.flush();
        OutputStream outputStream = socket.getOutputStream();
        //将文件从磁盘读取到程序中
        byte [] data = new byte[1024];
        int len = -1;
        System.out.println("上传文件....");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        while ((len = bis.read(data)) != -1){
            outputStream.write(data,0,len);
            outputStream.flush();
        }
        //写入结束符号
        socket.shutdownOutput();
        System.out.println("文件上传成功");
        //关闭资源
        bis.close();
        outputStream.close();
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();

    }
}
