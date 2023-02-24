package branchstructure.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:19
 * 输入100 -999 之间的水仙花数
 */
public class HomeWork04 {
    public static void main(String[] args) {
        // 第一种
        for (int i = 100;i < 1000 ;i ++){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i){
                System.out.println(i);
            }
        }
        System.out.println("--------------------------------------------");
        //第二种
        //百位
        for (int i = 1;i <= 9;i ++){
            // 十位
            for (int j = 0;j <= 9;j ++){
                //个位
                for (int x = 0 ;x <= 9;x ++){
                    if (i * i * i + j * j * j + x * x * x == (i*100 + j * 10 + x)){
                        System.out.println((i*100 + j * 10 + x));
                    }
                }
            }
        }
    }
}
