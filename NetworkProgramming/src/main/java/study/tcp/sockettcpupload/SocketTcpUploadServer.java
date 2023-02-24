package study.tcp.sockettcpupload;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 9:57
 * 编写一个服务端和客户端
 * 服务端在8888端口监听
 * 客户端连接服务端，并发送一张图片到服务端
 * 服务端收到客户端发送的图片，并保存到本地，发送"收到图片"给客户端
 * 客户端收到服务端发送的"收到图片"再退出
 * todo:服务端思路
 *      1.通过socket输入流将网络中的图片数据保存到程序中  --- 保存为字节数据
 *      2.通过IO流的输出流将字节数组保存的本地磁盘中
 *      3.通过socket的输出流将回复的数据发送给客户端
 */
public class SocketTcpUploadServer {
    public static void main(String[] args) throws IOException {
        //I.通过socket输入流将网络中的图片数据保存到程序中  --- 保存为字节数据
        //II.通过IO流的输出流将字节数组保存的本地磁盘中
        //III.通过socket的输出流将回复的数据发送给客户端

        //1.服务端在本地监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端已经启动，等待连接....");
        //2.等待客户端连接
        Socket socket = serverSocket.accept();
        System.out.println("客户端连接成功");
        //3.边读边写，从网络读取一部分文件，写入到磁盘中
        InputStream inputStream = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = -1;
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\mysql基本增删改查.wmv"));
        while ((len = inputStream.read(data)) != -1){
            bos.write(data,0,len);
            bos.flush();
        }
        //向客户端发送信息
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("收到图片".getBytes());
        outputStream.flush();
        socket.getOutputStream();
        //关闭资源
        outputStream.close();
        bos.close();
        inputStream.close();
        socket.close();
    }
}
