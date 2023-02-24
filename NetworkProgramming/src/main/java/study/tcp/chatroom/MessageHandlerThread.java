package study.tcp.chatroom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 15:29
 */
public class MessageHandlerThread extends Thread{
    public static Set<ObjectOutputStream> online = Collections.synchronizedSet(new HashSet<>());
    private Socket socket;
    private String username;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public MessageHandlerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        Message message = null;
        try {
                ois = new ObjectInputStream(socket.getInputStream());
                oos = new ObjectOutputStream(socket.getOutputStream());
                //接收数据
               while (true) {
                   message = (Message) ois.readObject();
                   //如果是登录则验证用户名和密码
                   if (message.getCode() == Code.LOGIN) {
                       username = message.getUsername();
                       String password = message.getContent();
                       if (UserMessage.login(username, password)) {
                           message.setCode(Code.SUCCESS);
                           oos.writeObject(message);
                           //并将该用户添加到在线人员名单中
                           online.add(oos);
                           message.setCode(Code.CHAT);
                           message.setContent("上线了");
                           //通知其他人 XXX上线了
                           sendToOther(message);
                       } else {
                           message.setCode(Code.FALL);
                           oos.writeObject(message);
                       }
                   } else if (message.getCode() == Code.CHAT) {
                       //如果是聊天则把消息转发给其他在线客户端
                       sendToOther(message);
                   } else if (message.getCode() == Code.LOGOUT) {
                       //通知其他人 XXX 下线了
                       message.setContent("下线了");
                       sendToOther(message);
                       break;
                   }
               }
           } catch (Exception e) {
               //通知其他人 XXX 掉线了
                if (message != null && username != null){
                    message.setCode(Code.LOGOUT);
                    message.setContent("掉线了");
                    sendToOther(message);
                }
            } finally {
            //从在线人员中一次并断开当前客户端
            online.remove(oos);
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 通知他人
     * @param message
     */
    private void sendToOther(Message message){
        ArrayList<ObjectOutputStream> offlne = new ArrayList<>();
        for (ObjectOutputStream on : online) {
            if (!on.equals(oos)){
                try {
                    on.writeObject(message);
                } catch (IOException e) {
                    offlne.add(on);
                }
            }
        }
        for (ObjectOutputStream off: offlne) {
            online.remove(off);
        }
    }
}
