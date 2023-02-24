package branchstructure.forstructure.study;

/**
 * @Author AllLearnAllNothingRookie
 * @Date 2022/10/5 16:46
 * @Version 1.0
 * for循环细节
 */
public class ForDetail {
    public static void main(String[] args) {
        /**
         * (1). 循环条件返回的是一个布尔值的表达式
         */
        /**
         * (2). for(;循环判断条件;) 中的初始化和变量迭代可以写到其他地方，但两边
         * 的分号不能省略
         */
        //循环变量初始化
        int i = 1;
        //循环条件判断
        for(;i <= 10;){
            //循环体
            System.out.println(i);
            //循环变量迭代
            i ++;
        }
        System.out.println("循环执行完成后i的值:" + i);
        System.out.println("其他语句");
        // 补充 for(;;)表示死循环
        int j = 0;
       /* for (;;){
            System.out.println(j ++);
        }*/
        /**
         * (3). 循环初始化值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开
         *  循环变量迭代也可以有多条变量迭代语句，中间应逗号隔开
         */
        int count = 3;
        for (int x =0,y = 0;x <= count;x ++,y +=2){
            System.out.println("x = " + x + " y = " + y);
        }
    }
}
