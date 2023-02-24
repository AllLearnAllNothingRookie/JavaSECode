package study.string;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/1 15:16
 */
public class StringExercise {
    public static void main(String[] args) {
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.println(test.str + "and");
        System.out.println(test.ch);
    }
}
class  Test{
    String str = new String("hsp");
    final  char[]  ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str = "java";
        ch[0] = 'h';
    }
}
