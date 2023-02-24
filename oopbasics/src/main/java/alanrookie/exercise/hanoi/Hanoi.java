package alanrookie.exercise.hanoi;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 12:23
 * 递归解决汉诺塔问题
 */
public class Hanoi {
    public static void main(String[] args) {
        move(5,'a','b','c');
    }

    /**
     * 移动汉诺塔
     * @param n  圆盘个数
     * @param a  A塔   初始塔
     * @param b  B塔   移动时借助的塔
     * @param c  C塔   目标塔
     */
    public static void move(int n,char a,char b,char c){
        //只有一个塔 A -> C
        if (n == 1){
            System.out.println(a + "->" + c);
        }else{
            //如果右多个盘可以当作两个盘，最下面的和上面的所有盘
            //先移动上面的所有盘到b，借助c
            move(n -1,a,c,b);
            // 把最下面的盘移动到
            System.out.println(a + "->" + c);
            //把b塔所有的盘移动到c，借助a
            move(n-1,b,a,c);
        }
    }
}
