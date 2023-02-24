package unidimensionalarray.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 21:17
 * 创建一个char类型的数组分别放置A-Z使用循环访问都有元素
 */
public class ArrayExercise01 {
    public static void main(String[] args) {
        char [] capital = new char[26];
        //将大写字母保存到数组中
        for (int i = 0;i < capital.length;i ++){
            capital[i] = (char) ('A' + i);
        }
        //打印大写字母
        for (int i = 0;i < capital.length;i ++){
            System.out.println(capital[i]);
        }
    }
}
