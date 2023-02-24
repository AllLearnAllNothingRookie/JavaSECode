package branchstructure.mulforstructure;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 19:44
 * 九九乘法表
 */
public class MulForExercise {
    public static void main(String[] args) {
        for (int i = 1 ;i <= 9;i ++){
            for (int j = 1;j <= i;j ++){
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }
}
