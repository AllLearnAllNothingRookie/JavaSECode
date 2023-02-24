package study.udp;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 14:50
 * todo: UDP网络通信编程
 *      1.DatagramSocket类和DatagramPacket实现了基于UDP协议的网络程序
 *      2.UDP数据报通过数据报套接字DatagramSocket发送和接收，系统不保证UDP数据报
 *        一定能够安全送到目的地，也不能确定什么时候可以抵达
 *      3.DatagramPacket对象封装了UDP数据报，在数据报中包含了发送端的IP地址和端口号
 *        以及接收端的IP地址和端口号
 *      4.UDP协议中每个数据报都给出了完整的地址信息，因此无须简历发送方和接收方的连接
 *todo: 基本流程
 *      1.核心的两个类/对象 DatagramSocket 和 DatagramPacket
 *      2.建立发送端和接收端
 *      3.发送数据前，建立数据包，DatagramPacket 对象
 *      4.调用DatagramSocket的发送、接收方法
 *      5.关闭 DatagramSocket
 *todo:UDP说明
 *      1.没有明确的服务端和客户端，演变为发送端和接收端
 *      2.接收和发送数据是通过DatagramSocket对象完成
 *      3.将数据封装到 DatagramPacket 对象中发送
 *      4.当接收到 DatagramPacket 对象，需要进行拆包，取出数据
 *      5.DatagramSocket 可以指定在那个端口接收数据
 */
public class UdpStudy {

}