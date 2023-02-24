package branchstructure.jumpstructure.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/6 21:21
 * break细节
 */
public class BreakDetail {
    public static void main(String[] args) {
        label1:
        //外层循环
        for (int i =0;i < 4;i ++){
            label2:
            //内层循环
            for (int j = 0;j < 10;j ++){
                if (j ==2){
                    break label1;
                    //等价于 break;
                   // break label2;
                }
                System.out.println("j = " + j);
            }
        }
    }
}
