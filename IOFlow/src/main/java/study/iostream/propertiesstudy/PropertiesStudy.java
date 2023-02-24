package study.iostream.propertiesstudy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/9 9:50
 * todo:Properties
 *      Properties的父类是Hashtable
 *      专门处理读写配置文件的集合类
 *          要求配置文件的格式：
 *            键=值
 *            键=值
 *       注意：键值对不需要有空格，值不需要使用引号，默认类型为String
 *todo:Properties的常见方法
 *      1.void load(InputStream inStream)：从输入字节流读取属性列表（键和元素对）。
 *            加载配置文件的键值对到Properties对象
 *      2.void list(PrintStream out)：将此属性列表打印到指定的输出流。
 *        void list(PrintWriter out)：将此属性列表打印到指定的输出流。
 *        将数据显示到指定设备
 *      3.String getProperty(String key)：使用此属性列表中指定的键搜索属性。
 *      4.Object setProperty(String key, String value) ：设置键值对到Properties对象
 *      5.store(OutputStream out, String comments)：将此属性列表（键和元素对）写入此 Properties表中，以适合于使用 load(InputStream)方法加载到 Properties表中的格式输出流。
 *        store(Writer writer, String comments) ：将此属性列表（键和元素对）写入此 Properties表中，以适合使用 load(Reader)方法的格式输出到输出字符流。
 *        将Properties中的键值对存储到配置文件，在idea中保存信息到配置文件，如果含有中文，用字节流输出会存储为Unicode码
 */
public class PropertiesStudy {
    //读取配置文件
    public static void main(String[] args) throws IOException {
        //传统方法读取
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\code\\project\\JavaSECode\\IOFlow\\src\\main\\resources\\mysql.properties"));
        String line = null;
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");
           // System.out.println(split[0] + "值为" + split[1]);
            //获取指定值
            if ("ip".equals(split[0])){
                System.out.println(split[0] + "值为" + split[1]);
            }
        }

        //todo:使用Properties读取配置文件
        Properties properties = new Properties();
        //加载指定的配置文件
        properties.load(new FileReader("D:\\code\\project\\JavaSECode\\IOFlow\\src\\main\\resources\\mysql.properties"));
        //将键值对显示到控制台
        properties.list(System.out);
        //根据key获取对于的值
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名为:" + user + ",密码为:" + pwd);

        //todo:使用Properties类创建配置文件和修改配置文件
        properties = new Properties();
        //创建文件
        //Properties的父类是Hashtable
        //如果该文件没有该key就是创建
        //如果该文件有该key就是修改
        properties.setProperty("charset","utf8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","abc");
        //将Properties中的key-value存储到文件中
        //properties.store(new FileWriter("D:\\code\\project\\JavaSECode\\IOFlow\\src\\main\\resources\\mysql2.properties"),null);
        properties.store(new FileOutputStream("D:\\code\\project\\JavaSECode\\IOFlow\\src\\main\\resources\\mysql2.properties"),"我是注释信息info");
        System.out.println("保存配置文件成功");

    }
}
