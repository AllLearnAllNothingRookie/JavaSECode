package homework.homework03;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/16 10:33
 * 编写一个客户端和服务端
 * 客户端可以输入一个文件名，客户端收到文件名后给客户端返回这个文件，如果服务端没有这个文件，
 * 则返回一个默认文件
 * 客户端收到这个文件后保存到本地
 */
public class DownloadClient {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket = new Socket(InetAddress.getByName("192.168.75.1"),8888);
        //从控制台输入信息
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要下载的视频名称:");
        String name = input.next();
        //将输入的信息发送给服务端
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(name.getBytes());
        //写入结束标志
        socket.shutdownOutput();
        //接收服务器返回的文件名
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String fileName = br.readLine();
        System.out.println("返回的文件名为:" + fileName);
        //将文件写入磁盘的流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\downloadVideo\\" + fileName  + ".wmv"));
        //从服务端下载资源
        InputStream inputStream = socket.getInputStream();
        byte [] data = new byte[1024];
        int len = -1;
        System.out.println("开始下载文件......");
        while ((len = inputStream.read(data)) != -1){
            //将读取到的数据写入到磁盘中
            bos.write(data,0,len);
            //刷新流
            bos.flush();
        }
        System.out.println("下载视频完成");
        //关闭资源
        inputStream.close();
        bos.close();
        br.close();
        outputStream.close();
        socket.close();
    }
}
