package study.string;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/1/2 14:22
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        //增
        sb.append(',');
        sb.append("rookie");
        sb.append(",").append(100).append(true).append(10.8);
        //hello,rookie,100true10.8
        System.out.println(sb);
        //删
        //删除索引为 [start,end)处的字符
        sb.delete(11,14);
        //hello,rooki00true10.8
        System.out.println(sb);
        //改 使用tom替换[9,11)处的字符
        sb.replace(9,11,"tom");
        System.out.println(sb);
        //查找指定字串在字符串中第一次出现的位置，如果找不到则返回-1
        int jack = sb.indexOf("tom");
        System.out.println(jack);
        //插入: 在指定索引处插入字符串,原来索引处的字符自动后移
        sb.insert(9,"jack");
        //hello,roojacktom00true10.8
        System.out.println(sb);
        //返回字符串的长度
        int length = sb.length();
        System.out.println(length);
    }
}
