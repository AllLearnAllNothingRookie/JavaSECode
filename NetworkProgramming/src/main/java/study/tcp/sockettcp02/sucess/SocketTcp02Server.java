package study.tcp.sockettcp02.sucess;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/14 10:39
 * 编写一个服务器端和一个客户端
 * 服务器端在9999端口监听
 * 客户端连接到服务器端，发送"Hello,Server"，并接收服务器端回发的 "Hello,Client"然后退出
 * 服务器端接收客户端发送的消息，输出并发送"Hello,Client" 然后退出
 */
public class SocketTcp02Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        //   要求：在本机没有其他服务在监听 9999端口
        //     ServerSocket可以通过 accept()返回多个 Socket[多个客户端来连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.当没有客户端连接9999端口时，程序会阻塞等待连接
        //如果有客户端连接就会返回一个Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接成功");
        InputStream inputStream = socket.getInputStream();
        //3.通过socket.getInputStream()读取，客户端写入到数据通道的数据，并显示
        byte[] data = new byte[1024];
        int len = -1;
        while ((len = inputStream.read(data)) != -1){
            System.out.println(new String(data,0,len));
        }
        //4.向客户端发送消息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello,Client".getBytes());
        outputStream.flush();
        //todo:写入结束标记
        //写入结束标志
        socket.shutdownOutput();
        outputStream.close();
        //6.关闭连接
        outputStream.close();
        inputStream.close();
        socket.close();

    }
}
