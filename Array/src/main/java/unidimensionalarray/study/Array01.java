package unidimensionalarray.study;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/11 20:11
 * 数组的引出
 */
public class Array01 {
    public static void main(String[] args) {
        /**
         * 有六只鸡体重分别为3Kg,5kg.1kg.2.4kg.2kg.5kg
         * 求出总体重和平均体重
         */
        //传统方法解决
        double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 5;
        double sum = hen1 + hen2 + hen3 + hen4 + hen3 + hen6;
        double avg = sum / 6;
        System.out.println("总体重为:" + sum);
        System.out.println("平均体重为:" + avg);
        //数组解决
        // double []:表示double类型的数组 数组名叫hens
        // {1,3,52.4,2,5} 表示数组力的元素一次表示数组的第几个元素
        double [] hens = {1,3,5,2.4,2,5};
        double sumWeight = 0;
        //可以通过 数组名[下标]的到数组元素
        //下标是从0开始的
        // 可以通过数组名.length来得到数组的长度
        System.out.println("使用数组解决");
        for (int i = 0;i < hens.length; i++){
            System.out.println("第" + i + "个元素的值为:" + hens[i]);
            sumWeight += hens[i];
        }
        double avgWeight = sumWeight / hens.length;
        System.out.println("总体重为:" + sumWeight);
        System.out.println("平均体重为:" + avgWeight);
    }
}
