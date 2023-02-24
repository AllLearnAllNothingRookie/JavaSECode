package homework.homework02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/16 9:41
 * 编写一个接收端A和发送端B
 * 接收端在8888端口等的接收数据
 * 发送端向接收端发送数据： "四大名著是那些?"
 * 接收端回复四大名著，否则返回what?
 */
public class ReceiverA {
    public static void main(String[] args) throws IOException {
        //编写接收端，在8888端口进行监听
        DatagramSocket socket = new DatagramSocket(8888);
        System.out.println("等待连接");
        //存放数据的数组
        byte[] receiverData  = new byte[64 * 1024];
        //用户接收数据报的对象
        DatagramPacket packet = new DatagramPacket(receiverData,receiverData.length);
        //接收来着发送端发送的数据报
        socket.receive(packet);
        System.out.println("连接成功");
        //对数据报进行解析
        //返回接收数据报的长度
        int length = packet.getLength();
        //返回数据报接收的数据
        byte[] data = packet.getData();
        String str = new String(data,0,length);
        System.out.println("客户端问题:");
        System.out.println(str);
        String sendData = "";
        if ("四大名著是那些?".equals(str)){
            sendData = "《三国演义》、《水浒传》、《西游记》、《红楼梦》";
        }else {
            sendData = "waht?";
        }
        System.out.println("回复:");
        System.out.println(sendData);
        byte[] bytes = sendData.getBytes();
        //组装要发送的数据报
        DatagramPacket sendPacket = new DatagramPacket(bytes,bytes.length, InetAddress.getByName("192.168.75.1"),8889);
        //发送数据报
        socket.send(sendPacket);
        //关闭资源
        socket.close();
    }
}
