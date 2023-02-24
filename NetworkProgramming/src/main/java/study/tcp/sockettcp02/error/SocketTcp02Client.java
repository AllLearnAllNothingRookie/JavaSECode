package study.tcp.sockettcp02.error;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/14 10:39
 * 编写一个服务器端和一个客户端
 * 服务器端在9999端口监听
 * 客户端连接到服务器端，发送"Hello,Server"，并接收服务器端回发的 "Hello,Client"然后退出
 * 服务器端接收客户端发送的消息，输出并发送"Hello,Client" 然后退出
 * todo: 错误原因。发送数据后无结束标志
 */
public class SocketTcp02Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip,端口)
        //连接本机的9999端口，如果连接成功返回Socket对象
        Socket socket = new  Socket(InetAddress.getLocalHost(), 9999);
        //2.连接上后，生产Socket，通过socket.getOutputStream()
        //得到跟Socket关联的数据通道
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道
        outputStream.write("Hello.Server".getBytes());
        outputStream.flush();
        //4.接收服务器发送的消息
        InputStream inputStream = socket.getInputStream();
        byte [] data = new byte[1024];
        int len;
        while ((len = inputStream.read(data))  != -1){
            System.out.println(new String(data,0,len));
        }
        //5.关闭连接
        inputStream.close();
        outputStream.close();
        socket.close();

    }
}
