package study.classloaderstudy;

import java.io.IOException;
import java.util.Properties;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/21 11:02
 */
public class LoaderPropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            properties.load(ClassLoader.getSystemResourceAsStream("jdbc.properties"));
            System.out.println(properties);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
