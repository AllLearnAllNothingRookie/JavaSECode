package study.mapstudy.propertiesstudy;

import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/11 14:48
 * todo: Properties
 *      1.Properties类继承自HashTable并且实现了Map接口，也是使用一种键值对形式来保存数据
 *      2.它的特点和HashTable类型类似
 *      3.Properties还可以用于xxx.properties文件中，加载数据到Properties类对象中，
 *        并进行读写和修改
 *      4.xxx.properties文件通常作为配置文件
 *      Java读取Properties配置文件
 *         相关文章https://www.cnblogs.com/xudong-bupt/p/3758136.html
 *      5.Properties类继承自HashTable
 *      6.Properties通过key-value存放数据，key和value不能为空，如果为空则抛出空指针异常
 *      7.如果有相同的键则进行值的替换
 */
public class PropertiesStudy {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",99);
        properties.put("tom",98);
        //java.lang.NullPointerException
        //properties.put(null,98);
        //java.lang.NullPointerException
        //properties.put("jack",null);
        //java.lang.NullPointerException
        properties.put("lic",97);
        properties.put("lic",86);
        System.out.println(properties);
        //todo:通过key获取对应的值
        //1.get方法
        Object tom = properties.get("tom");
        System.out.println(tom);
        //2.getProperty方法
        String john = properties.getProperty("john");
        System.out.println(john);
        //删除元素
        properties.remove("lic");
        System.out.println(properties);
        //修改
        properties.put("john","最好");
        System.out.println(properties);

        Properties properties1 = System.getProperties();
        String property = properties1.getProperty("file.encoding");
        System.out.println(property);

    }
}