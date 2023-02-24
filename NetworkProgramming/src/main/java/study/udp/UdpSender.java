package study.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 15:34
 * 编写一个发送端和一个接收端
 * 接收端在9999端口等的接收数据(receive)
 * 发送端向接收端发送 数据
 * 接收端接收到发送端发送的数据，回复接收端数据，再退出
 * 发送端接收回复的数据，再退出
 */
public class UdpSender {
    public static void main(String[] args) throws IOException {
        //1.创建DatagramSocket对象，准备发送和接收数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        //2.将需要发送的数据封装到DatagramPacket中
        byte[] bytes = "Hello,明后一起学习Java".getBytes();
        //发送数据封装格式： 数据[字节数组],长度,目标主机,端口号
        DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.75.1"),9999);
        //3.发送数据
        datagramSocket.send(datagramPacket);
        System.out.println("数据发送成功");

        //4.接收发送端返回的数据
        byte [] data = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(data,data.length);
        datagramSocket.receive(packet);
        System.out.println("接收到返回的数据");
        //5.解析返回的数
        int length = packet.getLength();
        byte[] receiveData = packet.getData();
        System.out.println(new String(receiveData,0,length));
        //6.关闭资源
        datagramSocket.close();

    }
}
