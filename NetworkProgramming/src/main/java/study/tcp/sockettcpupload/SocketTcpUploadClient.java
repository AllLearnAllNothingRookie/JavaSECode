package study.tcp.sockettcpupload;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
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
 * todo:客户端思路
 *      1.从磁盘上将图片读取到程序中----保存为字节数组
 *      2.将字节数组通过socket的输出流进行网络传输
 *      3.通过socket的输入流获取客户端返回的信息
 *    可以边读边些也可以一次读完再写(文件较大时可能会内存溢出)
 */
public class SocketTcpUploadClient {
    public static void main(String[] args) throws IOException {
        //I.从磁盘上将图片读取到程序中----保存为字节数组
        //II.将字节数组通过socket的输出流进行网络传输
        //III.通过socket的输入流获取客户端返回的信息
        //1.创建客户端连接服务端，得到Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //2.从磁盘上将图片读取到程序中----保存为字节数组
        OutputStream outputStream = socket.getOutputStream();
        //2.1创建读取磁盘文件的输入流，读取一部分数据写入网络一部分
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\j280\\2021.12.22\\视频\\黄晓东_J280_20211222_day033_06_mysql基本增删改查.wmv"));
        byte[] data = new byte[1024];
        int len = -1;
        //2.1从磁盘读取数据到程序保存到字节数组中
        while ((len = bis.read(data)) != -1){
            outputStream.write(data);
            outputStream.flush();
        }
        //输出流结束标识符
        socket.shutdownOutput();
        //接收客户端返回的信息
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(data)) != -1){
            System.out.println(new String(data,0,len));
        }
        //关闭资源
        inputStream.close();
        outputStream.close();
        bis.close();
        socket.close();
    }
}
