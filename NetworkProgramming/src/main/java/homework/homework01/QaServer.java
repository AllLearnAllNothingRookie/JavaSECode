package homework.homework01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 16:37
 * 使用字符流的方式，编写一个客户端和一个服务端程序
 * 客户端发送"name"，服务端接收后返回，返回自己的名字
 * 客户端发送"hobby",服务端接收后返回，自己的爱好
 * 如果不是上面的两个问题则返回：你说啥呢？？？
 */
public class QaServer {
    public static void main(String[] args) throws IOException {
        // 1.创建服务端，端口号为 9999
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端创建成功，等待客户端连接.....");
        // 2.等待客户端连接
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接成功");
        //获取输入字节流对象,并将输入流对象转换为字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = null;
        String str = "";
        System.out.println("客户端的问题:");
        while ((line = br.readLine()) != null){
            str = str + line;
        }
        System.out.println(str);
        System.out.println("服务端回应:");
        String returnData = "";
        if ("name".equals(str)){
            returnData = "AlanRookie";
        }else if ("hobby".equals(str)){
            returnData = "编程,听音乐,玩游戏";
        }else {
            returnData = "你说啥呢？？？";
        }
        System.out.println(returnData);
        //给客户端返回数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write(returnData);
        bw.flush();
        //写入结束标志
        socket.shutdownOutput();
        //关闭资源
        bw.close();
        br.close();
        serverSocket.close();
        System.out.println("执行结束，程序关闭");
    }
}
