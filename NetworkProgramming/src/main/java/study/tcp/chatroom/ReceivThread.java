package study.tcp.chatroom;

import java.io.ObjectInputStream;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 16:23
 */
public class ReceivThread extends Thread {
    private ObjectInputStream ois;
    private volatile  boolean flag = true;

    public ReceivThread(ObjectInputStream ois) {
        this.ois = ois;
    }

    @Override
    public void run() {
        try {
            while (flag){
                Message message = (Message) ois.readObject();
                System.out.println(message.getUsername() + ":" + message.getContent());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("请重新登录");
        }
    }
    public void setFlag(boolean flag){
        this.flag =flag;
    }
}
