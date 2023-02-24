package project.smallchangesys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/1 10:08
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        // 类型 消费金额 时间  余额
        //可以将数据保存在数组里也可以放在对象里也能使用字符串进行拼接
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Object[][] wallet = {{"初始","0",sdf.format(new Date()),0.0}};
        int init = -1;
        Scanner input = new Scanner(System.in);
        flag:while (true){
            System.out.println("---------------零钱通菜单---------------");
            System.out.println("1.零钱通明细");
            System.out.println("2.收益入账");
            System.out.println("3.消费");
            System.out.println("4.退出");
            System.out.print("请选择(1-4):");
            int choose = input.nextInt();
            switch (choose){
                case  1 :
                    System.out.println("---------------明细---------------");
                    //明细
                    for (int i = 0;i < wallet.length;i ++){
                        System.out.print(wallet[i][0] + "\t\t");
                        System.out.print(wallet[i][1] + "\t\t");
                        System.out.print(wallet[i][2] +"\t\t");
                        System.out.print("余额:" + wallet[i][3] +"\n");
                    }
                    break;
                case 2:
                    //收益入帐
                    // 类型 消费金额 时间  余额
                    Object[]  take = new Object[4];
                    take[0] = "收益入账";
                    System.out.print("请输入收益金额:");
                    double money = input.nextDouble();
                    if (money <= 0){
                        System.out.println("钱不能小于等于0");
                        break;
                    }
                    take[1] = "+" + money;
                    take[2] = sdf.format(new Date());
                    take[3] = money + (double)wallet[wallet.length - 1][3];
                    if (init != -1){
                        Object[][] newWallet = new Object[wallet.length + 1][4];
                        for (int i = 0; i < wallet.length;i ++){
                            newWallet[i] = wallet[i];
                        }
                        newWallet[wallet.length] = take;
                        wallet = newWallet;
                    }else {
                        wallet[0] = take;
                        init = 1;
                    }
                    break;
                case 3:
                    //消费
                    Object[]  subTake = new Object[4];
                    System.out.print("请输入店名:");
                    String name = input.next();
                    subTake[0] = name;
                    System.out.print("请输入收益金额:");
                    double subMoney = input.nextDouble();
                    if (subMoney <=0 || (double)wallet[wallet.length - 1][3] < subMoney){
                        System.out.println("余额不足");
                        break;
                    }
                    subTake[1] = "-" + subMoney;
                    subTake[2] = sdf.format(new Date());
                    subTake[3] = (double)wallet[wallet.length - 1][3] - subMoney ;
                    Object[][] subNewWallet = new Object[wallet.length + 1][4];
                    for (int i = 0; i < wallet.length;i ++){
                        subNewWallet[i] = wallet[i];
                    }
                    subNewWallet[wallet.length] = subTake;
                    wallet = subNewWallet;
                    break;
                case 4:
                    //退出
                    System.out.print("您确定要退出吗(Y/N):");
                    char exit = input.next().charAt(0);
                    if (exit == 'Y' || exit == 'y'){
                        break flag;
                    }
                    break;
                default:
                    System.out.println("选择错误！");
            }
        }
        System.out.println("退出系统");
    }
}
