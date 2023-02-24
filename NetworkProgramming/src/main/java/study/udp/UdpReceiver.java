package study.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 15:33
 * 编写一个发送端和一个接收端
 * 接收端在9999端口等的接收数据(receive)
 * 发送端向接收端发送 数据
 * 接收端接收到发送端发送的数据，回复接收端数据，再退出
 * 发送端接收回复的数据，再退出
 */
public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        //1.创建一个DatagramSocket 对象，在9999端口接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket 对象，准备接收数据
        // UDP数据报最大为 64K
        byte [] data = new byte[64 * 1024];
        DatagramPacket datagramPacket = new DatagramPacket(data,data.length);
        //3.调用接收方法接收数据
        //将通过网络传输的 DatagramPacket 对象，填充到接收端的 DatagramPacket中
        // 当数据报发送到 9999 端口时，就会接收的数据
        // 如果没有数据报发送到 9999端口时，程序就会阻塞
        datagramSocket.receive(datagramPacket);
        System.out.println("接收到传递的数据");
        //4.将DatagramPacket进行拆包取出数据，并显示
        // 返回实际接收到的数据长度
        int length = datagramPacket.getLength();
        //接收到的数据
        byte[] magData = datagramPacket.getData();
        String str = new String(magData, 0, length);
        System.out.println(str);

        //5.向接收端返回数据
        byte[] bytes = "好的，一起学习Java".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.75.1"),9998);
        datagramSocket.send(packet);
        System.out.println("发送返回数据成功");
        //6.关闭资源
        datagramSocket.close();
    }
}
