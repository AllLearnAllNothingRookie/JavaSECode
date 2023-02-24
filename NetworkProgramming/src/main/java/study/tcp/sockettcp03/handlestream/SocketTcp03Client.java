package study.tcp.sockettcp03.handlestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/14 14:58
 * 使用字符流进行读写操作
 * 编写一个服务器端和一个客户端
 * 服务器端在9999端口监听
 * 客户端连接到服务器端，发送"Hello,Server"，并接收服务器端回发的 "Hello,Client"然后退出
 * 服务器端接收客户端发送的消息，输出并发送"Hello,Client" 然后退出
 *
 */
public class SocketTcp03Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务端(ip,端口)
        //连接本机的9999端口，如果连接成功返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        //2.连接上后，生产Socket，通过socket.getOutputStream()
        //得到跟Socket关联的数据通道
        OutputStream outputStream = socket.getOutputStream();
        //3.使用转换流将字节流转换为字符流[可以是节点流也可以是包装流(处理流)]
        OutputStreamWriter osw = new OutputStreamWriter(outputStream);
        //将节点流包装为处理流
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write("Hello,Server!");
        //使用newLine表示输入结束，要求对方读写时使用redaLine()读写
        bw.newLine();
        bw.flush();
        //4.关闭输出，表示写入数据完成
        // socket.shutdownOutput();
        //5.接收服务器发送的消息
        InputStream inputStream = socket.getInputStream();
        //6.使用转换流将字节流转换为字符流[可以是节点流也可以是包装流(处理流)]
        InputStreamReader isr = new InputStreamReader(inputStream);
        //将节点流包装为包装流
        BufferedReader br = new BufferedReader(isr);
        //读取一行，读取到第一个换行就表示结束
        String str = br.readLine();
        System.out.println(str);
        //7.关闭连接 -- 后打开的先关闭
        br.close();
        isr.close();
        inputStream.close();
        bw.close();
        osw.close();
        outputStream.close();
        socket.close();
    }
}
