package study.mapstudy;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.PSource;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/9 16:29
 * todo:Map接口说明 JDK8版本
 *   1. Map和Collection并列存在。用于保存具有映射关系的数据:Key - Value
 *   2. Map中的key和value可以是任何引用数据类型的数据，会封装到HashMap$Node对象中
 *   3. Map中key不允许重复
 *   4. Map中value可以重复
 *   5. Map中的key可以为null，value也可以为null，注意key为null只能有一个，value为null
 *      可以多个
 *   6. 常用String类作为Map的kay
 *   7. key和value之间存在单向一对一关系，即通过指定的key总能找到对应的value
 *   8. Map中当有相同的key时相当于对value进行替换
 *   9. Map存放数据的key-value是放在Node中的，因为Node实现了Entry接口，所以也就是一对
 *      key-value就是一个Entry。
 * todo:Map接口的遍历方式
 *   1.取出所有的key，通过key遍历所有的value  ---- 核心方法map.keySet()
 *       1.通过增强for循环遍历keySet得到所有的value
 *       2.通过迭代器遍历keySet得到所有的value
 *   2.把所有的values取出  ---- 核心方法  map.values();
 *      1.通过增强for循环遍历Collection
 *      2.通过迭代器遍历Collection
 *      此方法只能获取value不能获取kay
 *   3.通过EntrySet来获取  Kay - value  --- 核心方法 map.entrySet()
 *     1.使用增强for循环获取entry对象
 *     2.使用增迭代器获取entry对象
 *   使用第三种方法是可能需要将entrySet里的元素转换为 Map.Entry类型，然后使用
 *    Map.Entry里提供的getKey() 和 getValue()方法获取key和value键值对
 *
 */
public class MapStudy {
    public static void main(String[] args) {
        //1. Map和Collection并列存在。用于保存具有映射关系的数据:Key - Value
        //2. Map中的key和value可以是任何引用数据类型的数据，会封装到HashMap$Node对象中
        Map map = new HashMap();
        map.put("1","rookie");
        map.put("2","tom");
        //当有相同的key时相当于对value进行替换
        map.put("2",33);
        map.put("3","李四");
        //Map中的key可以为null，value也可以为null，注意key为null只能有一个，value为null
        // 可以多个
        map.put(null,null);
        map.put("4",null);
        map.put("5",null);
        //对原有的key进行替换
        map.put(null,"空");
        map.put("6","jack");
        System.out.println(map);
        //通过key得到value
        System.out.println(map.get("1"));
        Map maps = new HashMap();
        //Map接口常用方法
        //1.put：添加
        maps.put("1","tom");
        maps.put("2","john");
        maps.put("3","rose");
        maps.put("4","jack");
        maps.put(null,"jack");
        System.out.println(maps);
        //2.remove: 根据键删除映射关系
        //删除后返回被删除的键值对的值
        System.out.println(maps.remove("3"));
        System.out.println(maps);
        //3.get: 根据键获取值
        System.out.println(maps.get("1"));
        //4.size: 获取元素个数
        System.out.println(maps.size());
        //5.isEmpty：判断是否为空
        System.out.println(maps.isEmpty());
        //6.clear： 清除
        //maps.clear();
        System.out.println(maps.isEmpty());
        // 7. containsKey: 查找键是否存在
        System.out.println(maps.containsKey("2"));
        System.out.println("======取出所有的key，通过key遍历所有的value  ---- 核心方法 keySet----");
        //todo:Map遍历
        // 1.取出所有的key，通过key遍历所有的value  ---- 核心方法 keySet
        Set keySet = maps.keySet();
        System.out.println("====通过增强for循环遍历keySet====");
        // 1.通过增强for循环遍历keySet
        for (Object key : keySet) {
            System.out.println(maps.get(key));
        }
        System.out.println("====通过迭代器遍历keySet====");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(maps.get(key));
        }
        System.out.println("======把所有的values取出=====");
        //todo: 2.把所有的values取出
        Collection values = maps.values();
        System.out.println("====通过增强for循环遍历Collection====");
        // 1.通过增强for循环遍历Collection
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("====通过迭代器遍历Collection====");
        // 2.通过迭代器遍历Collection
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }
     //todo:通过EntrySet来获取  Kay - value
        Set set = maps.entrySet();
        //增强for循环
        System.out.println("====增强for循环====");
        for (Object entry : set) {
            //将entry转换为Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //2.使用迭代器
        System.out.println("======使用迭代器======");
        Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
