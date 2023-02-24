package study.tcp.multiplefileupload;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 13:49
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //服务器在 8888端口号监听数据
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true){
            Socket socket = serverSocket.accept();
            FileUploadThread fileUploadThread = new FileUploadThread(socket);
            fileUploadThread.start();
        }
    }
}
