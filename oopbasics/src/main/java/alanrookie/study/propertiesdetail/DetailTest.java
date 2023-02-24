package alanrookie.study.propertiesdetail;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/10/22 21:39
 * 属性细节测试
 */
public class DetailTest {
    public static void main(String[] args) {
        // 创建 PropertiesDetail对象
        // detail: 对象名(对象引用)
        // new PropertiesDetail() : 创建对象空间(数据)才是真正的对象
        PropertiesDetail detail = new PropertiesDetail();
        /**
         * 属性如果不赋值，有默认值，规则和数组一致
         */
        System.out.println(detail.name);
        System.out.println(detail.age);
        System.out.println(detail.price);
        System.out.println("byte默认值:" + detail.byteValue);
        System.out.println("short默认值:" + detail.shortValue);
        System.out.println("int默认值:" + detail.intValue);
        System.out.println("long默认值:" + detail.longValue);
        System.out.println("float默认值:" + detail.floatValue);
        System.out.println("double默认值:" + detail.doubleValue);
        System.out.println("char默认值:" + detail.charValue);
        System.out.println("boolean默认值:" + detail.booleanValue);
        System.out.println("引用默认值:" + detail.str);
    }
}
