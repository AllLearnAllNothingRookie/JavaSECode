package branchstructure.homework;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/8 21:33
 * 输出小写的 a-z 以及大写的Z-A
 */
public class HomeWork06 {
    public static void main(String[] args) {
        // a - z
        for (char ch = 'a';ch <= 'z';ch ++){
            System.out.print(ch + "\t");
        }
        System.out.println();
        // Z - A
        for (char ch = 'Z';ch >= 'A'; ch --){
            System.out.print(ch + "\t");
        }
    }
}
