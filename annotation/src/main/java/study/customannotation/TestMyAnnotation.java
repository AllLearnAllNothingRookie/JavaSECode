package study.customannotation;

import com.sun.istack.internal.Interned;
import com.sun.istack.internal.NotNull;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.Inherited;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 9:44
 */
public class TestMyAnnotation implements @MyAnnotation InterC {
    /**
     * 因为注解的value方法有默认返回值，这里就省略了指定返回值
     * ①
     */
    @MyAnnotation
    public void method(){
        System.out.println("hello annotation : method");
    }

    /**
     * 标准的为注解抽象方法指定返回值格式
     * ②
     */
    @MyAnnotation(value = "Java")
    public void way(){
        System.out.println("hello annotation : way");
    }

    /**
     * 因为注解的方法名是value，这里省略 "value = "
     * ③
     */
    @MyAnnotation("CPP")
    public void fun(){
        System.out.println("hello annotation : fun");
    }

    public static void main(String[] args) {
        new @MyAnnotation Object();
        Object str = "111";
        String  myString = (@MyAnnotation String) str;
    }
    void monitorTemperature() throws @MyAnnotation IOException {
        File file = new File("");
        // 文件可能不存在
        FileWriter  fw= new FileWriter(file);
        // 写到一半可能失败
        fw.write("fhuerfjebfjhubjhj");
        //底层关闭资源时可能向上抛出异常
        fw.close();
    }
}
