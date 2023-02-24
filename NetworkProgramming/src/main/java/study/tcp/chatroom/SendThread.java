package study.tcp.chatroom;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 16:15
 */
public class SendThread extends Thread{
    private ObjectOutputStream oos;
    private String username;

    public SendThread(ObjectOutputStream oos, String username) {
        this.oos = oos;
        this.username = username;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true){
                System.out.println("请输入消息内容：");
                String content = scanner.nextLine();
                Message message ;
                if ("bye".equals(content)){
                    message = new Message(Code.LOGOUT,username,content);
                    oos.writeObject(message);
                    scanner.close();
                    break;
                }else {
                    message = new Message(Code.CHAT,username,content);
                    oos.writeObject(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
