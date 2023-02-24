package study.importexception;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 14:04
 * todo: 异常
 *      Java语言中，将程序执行中发生的不正常情况称为"异常"(开发过程中的语法错误和逻辑
 *      错误不是异常)
 *      执行过程中所发生的异常事件可以分为两类:
 *      1.Error(错误)：Java虚拟机无法解决的严重问题。如JVM系统内部错误、资源耗尽等严重
 *           情况。比如:StackOverflowError[栈溢出]和OOM(out of memory),Error
 *           是严重错误，程序会崩溃。
 *      2.Exception：其它因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的
 *        代码进行处理。例如空指针访问，试图读取不存在的文件，网络连接中断等等，Exception
 *        分为两大类：运行时异常[程序运行时发生的异常]和编译时异常[编程时，编译器检查出的异常]
 *    异常小结:
 *     1.异常分为两大类，运行时异常和编译时异常
 *     2.运行时异常，编译器不要求强制处置的异常，一般是指编程时的逻辑错误，是程序员
 *       应该避免其出现的异常，java.lang.RuntimeException类及它的子类都是运行时
 *       异常
 *     3.对于运行时异常，可以不做处理，因为这类异常很普遍，若全处理会对程序的可读性和
 *       运行效率产生影响
 *     4.编译时异常，是编译器要求必须处置的异常。
 */
public class ImportException {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // num1 / num2 ==>  10 /0
        //当程序运行的此处时，程序就会抛出异常 ArithmeticException: / by zero
        //当抛出异常时程序终止，下面的程序不会执行
        //Java提供了异常处理机制来解决该问题
        /**
         * 处理方法：用try-catch语句块选中肯出现异常的语句。
         *  如果在程序运行后出现了异常，程序可以继续执行
         */
        try {
            int res = num1 / num2;
        }catch (Exception e){
            //打印异常信息
            //e.printStackTrace();
            System.out.println("出现异常的原因:" + e.getMessage());
            System.out.println("此处处理出现的异常");
        }
        System.out.println("程序继续运行……");
    }
}
