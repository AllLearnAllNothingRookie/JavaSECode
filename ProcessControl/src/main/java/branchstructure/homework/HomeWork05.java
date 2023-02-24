package branchstructure.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:29
 * 输出1-100之间不能被5整除的数，每5个一行
 */
public class HomeWork05 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1;i <= 100 ;i ++){
            if (i % 5 != 0){
                System.out.print(i + "\t");
                if (count % 5 == 0){
                    System.out.println();
                }
                count ++ ;
            }

        }
    }
}
