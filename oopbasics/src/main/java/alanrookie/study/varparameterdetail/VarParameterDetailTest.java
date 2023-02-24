package alanrookie.study.varparameterdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/9 22:01
 */
public class VarParameterDetailTest {
    public static void main(String[] args) {
        VarParameterDetail varParameterDetail = new VarParameterDetail();
        /**
         *  1.可变参数的实参可以是0个或者任意多个
         */
        // 0个参数
        varParameterDetail.msg();
        //多个参数
        varParameterDetail.msg(1);
        System.out.println("\n----------------------------");
        varParameterDetail.msg(1,3,4,5);
        System.out.println("\n----------------------------");
        /**
         * 2.可变参数的实参可以是数组
         */
        varParameterDetail.msg(new int[]{1,3,5,6,3,7});
        System.out.println("\n----------------------------");
        varParameterDetail.func(2,45.9,32.0,6,7,8,5,3);
        System.out.println("\n----------------------------");
        //6.可变参数可以和数组类型的参数出现在同一个形参列表中，但是可以参数只能出现在最后
        varParameterDetail.method(new int[]{10,20,30,40},new double[]{1.9,1.8,1.7,1.6});
    }
}
