package alanrookie.homework.homework02;

import alanrookie.study.scopedetail.ScopeDetail;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:38
 * 定义一个方法find，实现查找某个字符串数组中的元素查找,并返回索引，如果没找到则返回-1
 */
public class HomeWork02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要查找的元素:");
        String str = input.next();
        String [] arr = {"rookie","tom","cat","jack","sdw"};
        HomeWork02 homeWork02 = new HomeWork02();
        int index = homeWork02.find(arr, str);
        if (index != -1){
            System.out.println(str + "对应的下标为:" + index);
        }else {
            System.out.println("没有找到");
        }
        //测试代码的健壮性
        index = homeWork02.find(null,str);
        if (index != -1){
            System.out.println(str + "对应的下标为:" + index);
        }else {
            System.out.println("没有找到");
        }
        //测试代码的健壮性
        index = homeWork02.find(new String[]{},str);
        if (index != -1){
            System.out.println(str + "对应的下标为:" + index);
        }else {
            System.out.println("没有找到");
        }
    }

    /**
     * 查找字符串数组中的指定元素
     * @param arr  要查找的数组
     * @param findStr  要查找的字符串
     * @return  返回一个索引，-1表示没找到
     */
    public int find(String [] arr,String findStr){
        if (arr != null && findStr != null){
            for (int i = 0;i < arr.length;i ++){
                if (findStr.equals(arr[i])){
                    return i;
                }
            }
        }
        return  -1;
    }
}
