package branchstructure.dowhilestructure.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/10/6 12:29
 * @version 1.0
 */
public class DoWhile01 {
    public static void main(String[] args) {
        //循环变量初始化
        int i = 1;
        do {
            //循环体
            System.out.println(i);
            //循环变量迭代
            i ++;
        // 循环判断条件
        }while (i <= 10);
        System.out.println("退出do……while循环继续执行");
    }
}
