package study.tcp.chatroom;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 15:26
 */
public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println(111);
        while (true){
            System.out.println(1.5);
            Socket socket = serverSocket.accept();
            System.out.println(222);
            MessageHandlerThread messageHandlerThread = new MessageHandlerThread(socket);
            messageHandlerThread.start();
        }
    }
}
