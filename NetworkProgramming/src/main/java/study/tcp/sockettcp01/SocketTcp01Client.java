package study.tcp.sockettcp01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
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
public class SocketTcp01Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip,端口)
        //连接本机的9999端口，如果连接成功返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("连接服务器成功");
        //2.连接上后，生产Socket，通过socket.getOutputStream()
        //得到跟Socket关联的数据通道
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        String str = "Hello,World!";
        byte[] bytes = str.getBytes();
        outputStream.write(bytes);
        outputStream.flush();
        System.out.println("发送成功");
        //4.关闭连接
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
