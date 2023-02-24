package unidimensionalarray.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/14 20:17
 * 数组查找 -- 顺序查找
 */
public class SeqSearch {
    public static void main(String[] args) {
        String [] names = {"张三","李四","王五","张亮"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的姓名:");
        String name = input.next();
        int index = -1;
        // 方法1 ： 引入一个变量
        for (int i = 0;i < names.length;i ++){
            if (name.equals(names[i])){
                System.out.println("找到了");
                System.out.println("下标为:" + i);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("没找到");
        }
        // 方法2： 使用return语句
        for (int i = 0;i < names.length;i ++){
            if (name.equals(names[i])){
                System.out.println("找到了");
                System.out.println("下标为:" + i);
                return;
            }
        }
        System.out.println("没有找到");
    }
}
