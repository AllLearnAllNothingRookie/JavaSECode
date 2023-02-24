package study.tcp.chatroom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 15:51
 */
public class ChatClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Socket socket = new Socket("127.0.0.1",9999);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        System.out.println(1);
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        System.out.println(2);
        System.out.println(3);
        //用户登录
        Scanner scanner = new Scanner(System.in);
        String username = "";
        while (true){
            //输入登录信息
            System.out.println("用户名：");
            username = scanner.nextLine();
            System.out.println("密码:");
            String password = scanner.nextLine();
            Message msg = new Message(Code.LOGIN,username,password);
            //发送登录信息
            oos.writeObject(msg);
            //接收登录信息
            msg = (Message) ois.readObject();
            if (msg.getCode() == Code.SUCCESS){
                System.out.println("登录成功");
                break;
            }else if (msg.getCode() == Code.FALL){
                System.out.println("用户名或密码错误，登录失败，请重新登录");
            }
        }
        //启动接收和发送消息的线程
        SendThread sendThread = new SendThread(oos,username);
        ReceivThread receivThread = new ReceivThread(ois);
        sendThread.start();
        receivThread.start();

        sendThread.join();
        receivThread.setFlag(false);
        receivThread.join();
        scanner.close();
        socket.close();
    }
}
