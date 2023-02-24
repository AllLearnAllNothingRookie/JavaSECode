package homework.homework01;

import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/29 14:18
 */
public class EcmDef {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个参数(逗号分割):");
        String str = input.next();
        //将参数解析为字符串数组
        String[] nums = str.split(",");
        //将字符串数组解析为整数
        try{
            if (nums.length != 2){
                throw new IndexOutOfBoundsException();
            }
            int num1 = Integer.parseInt(nums[0]);
            int num2 = Integer.parseInt(nums[1]);
            double res = cal(num1, num2);
            System.out.println("" + res);
        }catch (NumberFormatException e){
            System.out.println("输入的数字各式不正确");
        }catch (IndexOutOfBoundsException e){
            System.out.println("参数个数不对");
        }catch (ArithmeticException e){
            System.out.println("被除数不能为0");
        }
    }
    public static double cal(int n1,int n2){
        return  n1 / n2;
    }
}
