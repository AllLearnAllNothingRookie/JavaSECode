package homework.homework01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/22 13:21
 */
public class Dao<T> {
    private Map<String,T> map;

    public Dao(Map<String, T> map) {
        this.map = map;
    }

    /**
     * 保存T类型的对象到map成员变量中
     * @param id
     * @param entry
     */
    public void save(String id,T entry){
        map.put(id,entry);
    }

    /**
     * 从map中获取id对应的对象
     * @param id
     * @return
     */
    public T get(String id){
        return  map.get(id);
    }

    /**
     * 替换map中Key为id的内容，改为entry
     * @param id
     * @param entry
     */
    public void update(String id,T entry){
        map.put(id,entry);
    }

    /**
     * 返回map中所有存放的T对象
     * @return
     */
    public List<T> list(){
        Collection<T> values = map.values();
        List<T> list = new ArrayList<>();
        for (T value : values) {
            list.add(value);
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
