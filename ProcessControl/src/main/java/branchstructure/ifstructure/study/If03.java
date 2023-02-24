package branchstructure.ifstructure.study;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/21 19:26
 * @Version 1.0
 */
public class If03 {
    /**
     * 如果成绩大于8.0进入决赛，否则淘汰，并且根据性别提示加入男子组还是女子组
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩:");
        double score = input.nextDouble();
       if (score >= 0 && score <= 10){
           if (score >= 8.0){
               System.out.println("请输入性别:");
               char sex = input.next().charAt(0);
               if (sex == 'm' || sex =='M' || sex == '男' || sex == 'w' || sex == 'W' || sex == '女'){
                   if (sex == 'm' || sex =='M' || sex == '男'){
                       System.out.println("加入男子组");
                   }else {
                       System.out.println("加入女子组");
                   }
               }else {
                   System.out.println("性别输入错误");
               }
           }else {
               System.out.println("很遗憾你被淘汰了");
           }
       }else {
           System.out.println("成绩只能在0-10之间");
       }
    }
}
