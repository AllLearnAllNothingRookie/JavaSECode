package homework.homework03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/12 14:03
 * 使用HashMap保存员工的姓名和工资
 */
public class Homework03 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("jack",5674);
        map.put("tom",5500);
        map.put("jerry",6500);
        map.put("smith",8000);
        //修改jack的工资为7800
        System.out.println(map);
        map.put("jack",7800);
        System.out.println(map);
        //给所有员工工资加1000
        Set<String> keys = map.keySet();
        for (String key : keys) {
            map.put(key,map.get(key) + 1000);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print("员工姓名:" + entry.getKey());
            System.out.println("\t员工工资:" + entry.getValue());
        }
        //遍历所有员工
        System.out.println("=======遍历所有员工=======");
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("=======遍历所有工资=======");
        //遍历所有工资
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
