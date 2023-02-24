package homework.homework01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/15 16:35
 * 使用字符流的方式，编写一个客户端和一个服务端程序
 * 客户端发送"name"，服务端接收后返回，返回自己的名字
 * 客户端发送"hobby",服务端接收后返回，自己的爱好
 * 如果不是上面的两个问题则返回：你说啥呢？？？
 */
public class QaCilent {
    public static void main(String[] args) throws IOException {
        //创建客户端
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //向服务端发送信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        System.out.println("请输入要询问的问题:");
        Scanner input = new Scanner(System.in);
        String info = input.nextLine();
        //向服务端发送信息
        bw.write(info);
        bw.flush();
        //写入结束标志
        socket.shutdownOutput();
        //读取客户端返回的信息
        System.out.println("服务端回答:");
        String str= null;
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        //关闭资源
        br.close();
        bw.close();
        socket.close();
        System.out.println("程序结束，系统退出");
    }
}
