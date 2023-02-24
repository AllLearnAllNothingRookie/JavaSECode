package branchstructure.switchstructure.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 22:03
 * @Version 1.0
 */
public class Switch02 {
    /**
     * switch细节
     */
    public static void main(String[] args) {
        /**
         * 1. 表达式的数据类型，应和case后的常量类型一致，或者是可以自动转成可以相互比较的类型
         */
        char c = 'a';
        switch (c){
            case  'a':
                System.out.println("ok1");
                break;
            case 98 :
                //char 可以自动类转转换为int
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
        /**
         * 2.switch(表达式)中表达式的返回值必须是(byte、short、int、enum[枚举]、String)
         */
        /**
         * 3.case子句中的值必须时常量或者是常量表达式，不能是变量
         */
        int i =10;
        switch (i){
            case  1 :
                //常量
                System.out.println(1);
                break;
            case  3 + 7 :
                //常量表达式
                System.out.println(10);
                break;
            default:
                System.out.println(2);
        }
        /**
         * 4.default子句是可选的，当没有匹配的case时，执行default
         * 如果没有default子句，没有匹配任何值，就没有任何输出
         */
        char c2 = 'd';
        switch (c2){
            case 'a':
                System.out.println("a");
                break;
            case 'b':
                System.out.println("c");
                break;
            case  'd':
                System.out.println("d");
                //case后没有default语句
        }
        /**
         * 5.break语句用来宅执行完一个case分支后使程序跳出switch语句块；
         * 如果没有写break，程序会顺序执行到switch结尾，除非执行到break的位置 结束(称为case穿透)
         */
        int num = 2;
        switch (num){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
            case 5:
                System.out.println(5);
            case 6:
                System.out.println(6);
            default:
                System.out.println(0);

        }
    }
}
