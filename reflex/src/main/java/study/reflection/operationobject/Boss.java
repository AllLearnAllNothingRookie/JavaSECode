package study.reflection.operationobject;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/20 13:56
 */
public class Boss {
    public int age;
    private String name;

    public Boss() {
    }
    private static  String say(int n,String s,char c){
        return  n + " " + s + " " + c;
    }
    public void hi(String s){
        System.out.println("hi " + s);
    }
}
