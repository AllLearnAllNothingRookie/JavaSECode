package study.tcp.multiplecommunications;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 13:05
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //1.准备一个ServerSocket
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("等待连接....");

        int count = 0;
        while (true){
            //2.监听客户端的连接
            Socket socket = serverSocket.accept();
            System.out.println("第" + (++ count) + "个客户端连接成功");
            ClientHandlerThread handlerThread = new ClientHandlerThread(socket);
            handlerThread.start();
        }
        //这里没有关闭serverSocket，永远监听
    }
}
