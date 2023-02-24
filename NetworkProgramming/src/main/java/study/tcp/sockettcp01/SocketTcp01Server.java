package study.tcp.sockettcp01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/14 9:46
 * 编写一个服务器端和一个客户端
 * 服务器端在9999端口监听
 * 客户端连接到服务器端，发送"Hello,Server"，然后退出
 * 服务器端接收客户端发送的消息，输出并退出
 */
public class SocketTcp01Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        //   要求：在本机没有其他服务在监听 9999端口
        //     ServerSocket可以通过 accept()返回多个 Socket[多个客户端来连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接....");
        //2.当没有客户端连接9999端口时，程序会阻塞等待连接
        //如果有客户端连接就会返回一个Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("客户端已经连接");
        //3.通过socket.getInputStream()读取，客户端写入到数据通道的数据，并显示
        System.out.println("来自客户端的消息:");
        InputStream inputStream = socket.getInputStream();
        byte [] data = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(data)) != -1){
            System.out.println(new String(data,0,len));
        }
        //4.关闭连接
         inputStream.close();
        socket.close();
    }
}
