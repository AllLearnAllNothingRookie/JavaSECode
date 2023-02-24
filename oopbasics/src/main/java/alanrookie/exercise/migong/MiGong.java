package alanrookie.exercise.migong;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/2 21:50
 */
public class MiGong {
    public static void main(String[] args) {
        // 用一个二维数组代表迷宫
        // 1：表示墙 0 表示路   2：表示出路   3：表示走过但走不通的路
        int [][] miGong = new int[8][7];
        //初始化迷宫的的墙
        for (int i = 0;i < 7;i ++){
            miGong[0][i] = 1;
            miGong[7][i] = 1;
        }
        for (int i = 0;i < 8;i ++){
            miGong[i][0] = 1;
            miGong[i][6] = 1;
        }
        //构建迷宫里的墙
        miGong[2][2] = 1;
        miGong[3][1] = 1;
        miGong[3][2] = 1;
        /*miGong[1][2] = 1;
        miGong[2][2] = 1;
        miGong[3][2] = 1;
        miGong[4][2] = 1;
        miGong[5][2] = 1;
        miGong[6][2] = 1;
        */
        // 打印地图
        for (int i = 0;i < miGong.length;i ++){
            for (int j = 0;j < miGong[i].length;j ++){
                System.out.print(miGong[i][j] + "\t");
            }
            System.out.println();
        }
        //找路
        findRoad(miGong,1,1);
        System.out.println("----------------------------------------------");
        //打印出路
        for (int i = 0;i < miGong.length;i ++){
            for (int j = 0;j < miGong[i].length;j ++){
                System.out.print(miGong[i][j] + "\t");
            }
            System.out.println();
        }
    }
    /**
     * 找路算法
     *
     * @param miGong
     */
    public static  boolean findRoad(int [][] miGong,int i ,int j){
        //当走到(6,5)时即走出迷宫
        //(0,0)为起点
        if(miGong[6][5] == 2){
            return true;
        }else {
            if (miGong[i][j] == 0){
                miGong[i][j] = 2;
                //找路 下 -> 右 -> 上 -> 左
                if (findRoad(miGong,i +1,j)){
                    return true;
                }else if (findRoad(miGong,i,j + 1)){
                    return true;
                }else if (findRoad(miGong,i - 1,j)){
                    return true;
                }else if (findRoad(miGong,i,j -1)){
                    return true;
                }else {
                    miGong[i][j] = 3;
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
