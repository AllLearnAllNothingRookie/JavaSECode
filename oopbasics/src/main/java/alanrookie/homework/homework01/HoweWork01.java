package alanrookie.homework.homework01;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 18:32
 *   定义一个方法max实现求某个double数组的最大值并返回
 */
public class HoweWork01 {
    public static void main(String[] args) {
        HoweWork01 howeWork01 = new HoweWork01();
        double [] arr = {1.3,23.9,45.4,32,56,78.9,3.9,34.2,13,45.9};
        Double max = howeWork01.max(arr);
        System.out.println(max);
        //测试代码的健壮性
        max = howeWork01.max(null);
        System.out.println(max);
        if(max == null){
            System.out.println("传入的数组不能时null或空");
        }
        double[] array = {};
        max = howeWork01.max(array);
        System.out.println(max);
        if(max == null){
            System.out.println("传入的数组不能时null或空");
        }

    }

    /**
     * 查找数组的做大值
     * @param arr  数组
     * @return 返回数组中的最大值
     */
    public Double max(double [] arr){
        //要考虑代码的健壮性
        if (arr == null){
            //这里可以抛出一个异常
            System.out.println("数组为null");
            return  null;
        }
        if (arr.length == 0){
            //这里可以抛出一个异常
            System.out.println("数组里没有元素");
            return  null;
        }
        double maxNumber = arr[0];
        for (int i = 1;i < arr.length;i ++){
            if (maxNumber < arr[i]){
                maxNumber = arr[i];
            }
        }
        return  maxNumber;
    }
}
