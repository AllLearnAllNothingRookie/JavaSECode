package study.exceptionhandling.trycatchfinallyhandle;


/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 16:43
 * todo： try-catch方式处理异常说明:
 *    1.Java提供try和catch块来处理异常，try块用于包含可能出错的代码，catch用于处理
 *     try中发生的异常。可以给根据需要在程序中有多个数量的try……catch块
 *     基本语法:
 *     try{
 *         //可能出错的代码
 *         //将异常生产对应的异常对象，传递给catch块
 *     }catch(异常){
 *         //对异常的处理
 *     }
 *     //如果没有finally语法是可任意通过的
 *   细节:
 *      1.如果异常发生了，则发生异常的代码后面的代码不会执行，直接进入到catch块
 *      2.如果异常没有发生，则顺序执行try中的的代码，不会进入到catch中
 *      3.如果希望不管是否发生异常，都执行某段代码(如关闭连接，释放资源)，则使用finally
 *          try{
 *            //可能发生异常的代码
 *           }catch(异常){
 *          //对异常的处理
 *          }finally{
 *             //关闭连接，释放资源等
 *          }
 *      4.可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，要求父类异常在后
 *       子类异常在前，比比(Exception在后NullPointerException在前)，如果发生异常
 *       ，只会匹配一个catch
 *      5.可以进行try-finally配合使用，这种写法相当于没有捕获异常，因此程序会直接崩掉
 *          引用场景就是执行一段代码，不管是否发生异常，丢必须执行某个业务漏极
 *          try{
 *              //可能发生异常的代码
 *          }finally{
 *              //代码
 *          }
 * todo:小结
 *      1.如果没有出现异常，则执行try块中所有语句，不执行catch块中语句，如果有
 *      finally，最后还要执行finally中的语句
 *      2.如果出现异常，则try中异常发生后，try块中剩下的语句不再执行，将执行catch中的语句。
 *      如果有finally，最后还需执行finally中的语句
 */
public class TryCatch {
    public static void main(String[] args) {
        String str = "1234e";
        /**
         * todo:1.如果异常发生了，则发生异常的代码后面的代码不会执行，直接进入到catch块
         *      2.如果异常没有发生，则顺序执行try中的的代码，不会进入到catch中
         *      3.如果希望不管是否发生异常，都执行某段代码(如关闭连接，释放资源)，则使用finally
         */
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息为:" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续执行");

        /**
         * todo:4.可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，要求父类异常在后
         *         子类异常在前，比比(Exception在后NullPointerException在前)，如果发生异常
         *         ，只会匹配一个catch
         */
        try {
            Object obj = new Object();
            //obj = null;
            System.out.println(obj.equals("s"));
            int num1 = 10;
            int num2 = 0;
            int res = num1 / num2;
        }catch (NullPointerException e){
            System.out.println("空指针异常");
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("算术异常");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        /**
         * todo:可以进行try-finally配合使用，这种写法相当于没有捕获异常，因此程序会直接崩掉
         */
        try {
            Object string = "1231";
            Integer integer = (Integer) string;
        }finally {
            System.out.println("没有catch语句");
        }
        System.out.println("程序执行");
    }
}
