package study.tcp.sockettcp03.handlestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/14 14:57
 * 使用字符流进行读写操作
 * 编写一个服务器端和一个客户端
 * 服务器端在9999端口监听
 * 客户端连接到服务器端，发送"Hello,Server"，并接收服务器端回发的 "Hello,Client"然后退出
 * 服务器端接收客户端发送的消息，输出并发送"Hello,Client" 然后退出
 *
 */
public class SocketTcp03Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的9999端口监听，等待连接
        //   要求：在本机没有其他服务在监听 9999端口
        //     ServerSocket可以通过 accept()返回多个 Socket[多个客户端来连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        //2.当没有客户端连接9999端口时，程序会阻塞等待连接
        //如果有客户端连接就会返回一个Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("客户端已经连接");
        //3.通过socket.getInputStream()读取
        InputStream inputStream = socket.getInputStream();
        //4.使用转换流将字节流转换为字符流[可以是节点流也可以是包装流(处理流)]，客户端写入到数据通道的数据，并显示
        InputStreamReader isr = new InputStreamReader(inputStream);
        //将节点流包装为包装流
        BufferedReader br = new BufferedReader(isr);
        //读取一行，读取到第一个换行就表示结束
        String str = br.readLine();
        System.out.println(str);
        //5.向客户端发送消息
        OutputStream outputStream = socket.getOutputStream();
        //6.使用转换流将字节流转换为字符流[可以是节点流也可以是包装流(处理流)]
        OutputStreamWriter osw = new OutputStreamWriter(outputStream);
        //将节点流包装为处理流
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Hello,Server!");
        //使用newLine表示输入结束，要求对方读写时使用redaLine()读写
        bw.newLine();
        bw.flush();
        //todo:写入结束标记
        //写入结束标志
        //socket.shutdownOutput();
        //7.关闭连接  
        bw.close();
        osw.close();
        outputStream.close();
        br.close();
        isr.close();
        inputStream.close();
        socket.close();

    }
}
