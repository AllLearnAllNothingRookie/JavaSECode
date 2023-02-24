package study.polymorphic.study.objectanalysis.finalize;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/30 15:11
 *  todo:当垃圾回收器确定不存在该对象的更多引用时,由对象的垃圾回收器调用此方法
 *      1.当对象被回收时,系统自动调用该对象的finalize方法,子类可以重写该方法
 *          做一些释放资源的操作
 *      2.什么时候被回收:当某个对象没有任何引用时,则JVM就认为这个对象是一个垃圾
 *          对象,就会在垃圾回收机制来销毁该对象,在销毁该对象之前,会先调用finalize方法
 *      3.垃圾回收机制的调用,是由系统来决定,也可以通过System.gc()主动的触发垃圾回收机制
 */
public class Finalize {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        //这是car对象就是一个垃圾，垃圾回收器就会销毁这个对象
        //销毁对象前会调用finalize方法，可以在该方法中些一些业务逻辑代码(如释放资源:数据库链接
        // ,打开文件)
        bmw = null;
        //通过System.gc()主动的触发垃圾回收机制，但是可能不会触发垃圾回收器
        System.gc();
        System.out.println("程序结束了");
    }
}
