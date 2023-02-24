package alanrookie.exercise.methodexercise01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/30 20:52
 */
public class MethodExercise01 {
    /**
     * 判断一个数是奇数还是偶数
     * @param num  要判断的数
     * @return   偶数返回真，奇数返回假
     */
    public boolean isEvenNumbers(int num){
        //写法1
      /*  if (num % 2 == 0){
            return true;
        }
        return false;*/
        //写法2
       // return num % 2 == 0 ? true : false;
        //写法3
        return num % 2 == 0 ;
    }

    /**
     * 根据行、类、字符打印对应行和列的字符
     * @param row   行
     * @param col   列
     * @param ch    要打印的字符
     */
    public void printChar(int row,int col,char ch){
        for (int i = 0;i < row;i ++){
            for (int j = 0;j < col;j ++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
