package study.tcp.chatroom;

import java.util.HashMap;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 15:22
 */
public class UserMessage {
    public static HashMap<String,String> allUsers = new HashMap<>();
    static {
        allUsers.put("gangge","123");
        allUsers.put("xiaobai","456");
        allUsers.put("gujie","789");
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public static boolean login(String username,String password){
        if (allUsers.get(username) != null && allUsers.get(username).equals(password)){
            return true;
        }
        return false;
    }
}
