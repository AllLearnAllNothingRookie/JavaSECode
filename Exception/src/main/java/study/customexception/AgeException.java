package study.customexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 14:02
 * 自定义异常
 */
public class AgeException extends RuntimeException{
    /**
     * 构造器
     * @param message
     */
    public AgeException(String message) {
        super(message);
    }
}
