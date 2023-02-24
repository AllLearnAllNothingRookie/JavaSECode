// package的作用似乎声明当前类所在的包，需要放到类的最上面，一个类中最多只有一句package
package study.packagestudy.study.pkg;

//导入一个类
//import指令位置放置package的下面，在类定义的前面，可有有多句且没有顺序的要求
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/19 21:26
 *      package细节:
 *          package的作用似乎声明当前类所在的包，需要放到类的最上面，一个类中最多只有
 *              一句package
 *          import指令位置放置package的下面，在类定义的前面，可有有多句且没有顺序的要求
 */
public class PackageDetail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {1,3,2,4,23,45,-1,7,5};
        Arrays.sort(array);
    }
}
