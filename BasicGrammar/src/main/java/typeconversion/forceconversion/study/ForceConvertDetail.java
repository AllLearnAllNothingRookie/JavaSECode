package typeconversion.forceconversion.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/2 19:54
 * @Version 1.0
 * 强制类型转换细节
 */
public class ForceConvertDetail {
    public static void main(String[] args) {
        //1. 当进行数据的大小从大到小转换时就需要使用强制类型转换
        //2. 强转符号子针对最近的操作数有效，往往需要采用小括号提升优先级
        //错误 该表达式强转符只对10有效，对其他的操作数无效
        //int num = (int) 10 * 3.5 + 6 * 1.5;
        int num = (int) (10 * 3.5 + 6 * 1.5);
        // 44
        System.out.println(num);
        //3. char类型可以保存int的常量值，但是不能保存int的变量值，需要强转
        char c = 100;
        int m = 100;
        // 错误  int -> char
        // char c1 = m;
        char c2 = (char)m;
        System.out.println(c2);
        //4. byte和short类型在进行计算时，当作int类型处理
    }
}
