package branchstructure.jumpstructure.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 22:14
 */
public class Continue01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4){
            i ++;
            if (i == 2 ){
                continue;
            }
            System.out.println(i);
        }
    }
}
