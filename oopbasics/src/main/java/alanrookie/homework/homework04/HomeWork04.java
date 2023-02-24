package alanrookie.homework.homework04;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 19:01
 * 实现数组的复制功能copyArr,输入一个就数组返回一个新数组，元素和旧数组一样
 */
public class HomeWork04 {
    public static void main(String[] args) {
        HomeWork04 homeWork04 = new HomeWork04();
        int[] arr = {1,3,4,5,63,2,2,43,2};
        // 测试代码健壮性
        //arr = new int[]{};
        int[] newArr = homeWork04.copyArr(arr);
        System.out.println("旧数组:");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("\n新数组:");
        for (int i : newArr) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //测试输入null
        newArr = homeWork04.copyArr(null);
        System.out.println(newArr);
    }

    /**
     * 实现拷贝数组
     * @param arr  旧数组
     * @return    拷贝后的新数组
     */
    public int[] copyArr(int[] arr){
        if (arr == null){
            return null;
        }
        int[] newArray = new int[arr.length];
        for (int i = 0;i < arr.length;i ++){
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
