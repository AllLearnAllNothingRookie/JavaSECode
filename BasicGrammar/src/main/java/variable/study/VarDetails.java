package variable.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/5 22:10
 * @Version 1.0
 */
public class VarDetails {
    /**
     * 变量细节
     */
    public static void main(String[] args) {
        // 变量必须先声明在使用
        //  System.out.println(a);
        int a = 50;
        System.out.println(a);
        // 变量的值可以在同一类型范围内不断变化，不能为变量赋值为其他类得值
        a = 88;
        System.out.println(a);
        //int a = 30; 变量在同一个作用域不能重名
    }
}
