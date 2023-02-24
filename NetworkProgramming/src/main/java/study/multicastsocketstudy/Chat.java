package study.multicastsocketstudy;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 17:16
 */
public class Chat {
    private volatile static  boolean exit = false;
    private static Scanner input = new Scanner(System.in);
    private static String username;

    public static void main(String[] args) throws IOException {
        //指定多点广播ip
        InetAddress ip = InetAddress.getByName("230.0.0.1");
        //创建多点广播套接字将其绑定到特定端口
        MulticastSocket socket = new MulticastSocket(9999);
        //加入多点广播组
        socket.joinGroup(ip);
        //禁止多点广播数据包的本地回送
        socket.setLoopbackMode(false);

        System.out.println("请输入用户名:");
        username = input.nextLine();
        //创建并启动收发消息线程
        SendThread sendThread = new SendThread(socket,ip);
        ReceiverThread receiverThread = new ReceiverThread(socket);
        sendThread.start();
        receiverThread.start();
        //发送消息线程结束了才能端口连接
        try {
            sendThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //离开多点广播组
        socket.leaveGroup(ip);
        socket.close();
        input.close();

    }
    //发送消息线程
    static  class SendThread extends Thread{
        private MulticastSocket socket;
        private InetAddress ip;

        public SendThread(MulticastSocket socket, InetAddress ip) {
            this.socket = socket;
            this.ip = ip;
        }

        @Override
        public void run() {
            try {
                while (!exit){
                    System.out.println("输入广播消息:");
                    String message = input.nextLine();
                    if ("bye".equals(message)){
                        exit = true;
                        break;
                    }
                    byte[] data = (username + ":" + message).getBytes();
                    DatagramPacket dp = new DatagramPacket(data,data.length,ip,9999);
                    socket.send(dp);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //接收消息线程
    static class  ReceiverThread extends Thread{
        private MulticastSocket socket;

        public ReceiverThread(MulticastSocket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
           try{
               while (!exit){
                   byte[] bytes = new  byte[1024];
                   DatagramPacket dp =new DatagramPacket(bytes,bytes.length);
                   socket.receive(dp);
                   String str = new String(bytes, 0, dp.getLength());
                   System.out.println(str);
               }
           } catch (IOException e) {
               exit = false;
           }
        }
    }
}
