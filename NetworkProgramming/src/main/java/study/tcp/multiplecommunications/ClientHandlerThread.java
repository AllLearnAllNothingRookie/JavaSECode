package study.tcp.multiplecommunications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 13:05
 */
public class ClientHandlerThread extends Thread{
    private Socket socket;

    public ClientHandlerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //1.获取输入流，用来接收该客户端发送给服务端的数据
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //2.获取输出流，用来发送数据给该客户端
            PrintStream printStream = new PrintStream(socket.getOutputStream());
            String str;
            //3.接收数据
            while ((str = bufferedReader.readLine()) != null){
                //4.反转
                StringBuffer stringBuffer = new StringBuffer(str);
                stringBuffer.reverse();

                //5.返回给客户端
                printStream.println(stringBuffer);
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                //6.断开连接
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
