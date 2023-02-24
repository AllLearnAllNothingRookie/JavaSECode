package study.tcp.chatroom;

import java.io.Serializable;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/18 15:04
 */
public class Message implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 状态
     */
    private int code;
    /**
     * 用户
     */
    private String username;
    /**
     * 存储信息
     */
    private String content;

    public Message(int code, String username, String content) {
        this.code = code;
        this.username = username;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
