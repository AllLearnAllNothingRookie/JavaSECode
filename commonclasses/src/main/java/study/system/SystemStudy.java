package study.system;

import java.util.Arrays;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 21:07
 */
public class SystemStudy {
    public static void main(String[] args) {
        //退出当前程序
        System.out.println("ok1");
        // 参数表示程序退出的状态
        // 0 :表示正常退出
        //System.exit(0);
        System.out.println("ok2");

        // arraycopy:复制数组元素
        int [] src = {1,2,3};
        int [] desc = new int[3];
        /**
         *src      the source array.  源数组
         *srcPos   starting position in the source array.  从源数组那个索引位置开始拷贝
         *dest     the destination array. 目标数组
         *destPos  starting position in the destination data. 把原数组的数组拷贝到目标数组的哪个索引处
         * length   the number of array elements to be copied.拷贝元素的个数
         */
        System.arraycopy(src,1,desc,0,2);
        System.out.println(Arrays.toString(desc));

        //返回当前时间距1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());

        //运行垃圾回收器
        System.gc();
    }
}
