package study.exceptionhandling;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 15:18
 * todo: 异常处理
 *      异常处理就是当发生异常时，对异常处理的方式
 *     异常处理的方式:
 *     1. try-catch-finally
 *          程序员在代码中捕获发生的异常，自行处理
 *          语法格式:
 *           try{
 *               可能发生异常的代码
 *           }catch(可能的异常类  异常对象){
 *               //捕获到异常
 *               //当异常发生时，系统就捕获到的和异常和catch中的异常进行比较
 *               //如果是该异常或其子类，则进入对于的catch语句块中
 *               //如果没有发生异常，catch代码块不执行
 *           }finally{
 *               //不管try代码块是否有异常发生，始终要执行finally
 *               //通常将释放资源的代码放在这里
 *           }
 *     2.throws
 *          将发生的异常抛出，交给调用者(方法)来处理，最顶级的处理就是JVM
 */
public class ExceptionHandling {
}
