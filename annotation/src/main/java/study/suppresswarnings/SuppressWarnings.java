package study.suppresswarnings;

import java.util.ArrayList;
import java.util.List;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 10:28
 * todo: @SuppressWarnings:抑制编译器警告
 *  1.当不希望看到警告是可以是使用@SuppressWarnings注解来抑制警告信息
 *  2.@SuppressWarnings({"all"}) :在括号里填入不想要看到的警告信息，
 *     all:抑制所有警告
 *     boxing:抑制与封装/拆装作业相关的警告
 *     cast:抑制与强制转型作业相关的警告
 *     dep-ann:抑制与淘汰注释相关的警告
 *     deprecation:抑制与淘汰的相关警告
 *     fallthrough:抑制与switch陈述式中遗漏break相关的警告
 *     finally:抑制与未传回finally区块相关的警告
 *     hiding:抑制与隐藏变数的区域变数相关的警告
 *     incomplete-switch:抑制与switch陈述式(enum case)中遗漏项目相关的警告
 *     javadoc:抑制与javadoc相关的警告
 *     nls:抑制与非nls字串文字相关的警告
 *     null:抑制与空值分析相关的警告
 *     rawtypes:抑制与使用raw类型相关的警告
 *     resource:抑制与使用Closeable类型的资源相关的警告
 *     restriction:抑制与使用不建议或禁止参照相关的警告
 *     serial:抑制与可序列化的类别遗漏serialVersionUID栏位相关的警告
 *     static-access:抑制与静态存取不正确相关的警告
 *     static-method:抑制与可能宣告为static的方法相关的警告
 *     super:抑制与置换方法相关但不含super呼叫的警告
 *     synthetic-access:抑制与内部类别的存取未最佳化相关的警告
 *     sync-override:抑制因为置换同步方法而遗漏同步化的警告
 *     unchecked:抑制与未检查的作业相关的警告
 *     unqualified-field-access:抑制与栏位存取不合格相关的警告
 *     unused:抑制与未用的程式码及停用的程式码相关的警告
 *  3.源码
 *      @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
 *      @Retention(RetentionPolicy.SOURCE)
 *      public @interface SuppressWarnings {
 *          String[]value();
 *      }
 *  4.@SuppressWarnings的抑制范围和声明的位置有关，如声明在类上则范围为本类中，声明在方法上则范围为该方法，声明在变量上
 *      则该变量的警告被抑制
 *  5.@SuppressWarnings注解类有一个数组可以传入多个要抑制属性
 */
public class SuppressWarnings {
    //当不希望看到警告是可以是使用@SuppressWarnings注解来抑制警告信息
    @java.lang.SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("rookie");
        int i ;
        System.out.println(list.get(1));
    }
}
