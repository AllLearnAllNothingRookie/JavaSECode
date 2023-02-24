/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/4 22:05
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i ++){
            for(int j = 1;j <= 5;j ++){
                System.out.print( i );
                if(i == j){
                   return;
                }
            }
            System.out.println();
        }
        System.out.println("hello");
    }
}
