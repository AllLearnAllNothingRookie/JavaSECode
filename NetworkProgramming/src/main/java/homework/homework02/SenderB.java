package homework.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/16 9:41
 * 编写一个接收端A和发送端B
 * 接收端在8888端口等的接收数据
 * 发送端向接收端发送数据： "四大名著是那些?"
 * 接收端回复四大名著，否则返回what?
 *
 */
public class SenderB {
    public static void main(String[] args) throws IOException {
        //创建发送端 在8889端口监听
        DatagramSocket socket = new DatagramSocket(8889);
        //从键盘录入要发送的数据
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要询问的内容");
        String str = input.next();
        byte[] bytes = str.getBytes();
        //组装发送报数据
        DatagramPacket packet = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.75.1"),8888);
        //通过网络发送数据报
        socket.send(packet);
        //接收接收端返回的数据
        byte[] data = new byte[1024 * 64];
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length);
        //获取返回的数据
        socket.receive(datagramPacket);
        //对返回的数据进行解析
        int length = datagramPacket.getLength();
        byte[] packetData = datagramPacket.getData();
        System.out.println("系统回答:");
        System.out.println(new String(packetData,0,length));
        //关闭资源
        socket.close();
    }
}
