package operator.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/3 20:15
 * @Version 1.0
 */
public class TernaryOperatorDetail {
    /**
     * 三元运算符细节
     *
     * @param args
     */
    public static void main(String[] args) {
        // 1. 表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换)
        int a = 3;
        int b = 8;
        int c = a > b ? a : b;
        // 错误 double -> int  类型不匹配
        //int d = a > b ? 1.8 : 2.5;
        // 正确  int -> double  可以字段类型转换
        double e = a > b ? a : b;

        // 2. 三元运算符可以转变为if - else 语句
        int d = a > b ? a ++ : --b;
        //转化为if - else
        int f;
        if (a > b){
           f =  a ++;
        }else {
            f = --b;
        }
    }
}
