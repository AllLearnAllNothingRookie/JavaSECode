package changechar.study;

/**
 * @author AllLearnAllNothingRookie
 * @date 2022/8/4 21:19
 * @Version 1.0
 * 演示转义字符
 */
public class ChangeChar {
    public static void main(String[] args) {
        //  \t  :一个制表位，实现对齐功能
        // 北京	上海	成都
        System.out.println("北京\t上海\t成都");
        //  \n  :换行符
        /*
            jack
            smith
            mary
         */
        System.out.println("jack\nsmith\nmary");
        //  \\  :一个\  \\\\: 两个 \ (\\)
        //c:\windows\System32\cmd.exe
        System.out.println("c:\\windows\\System32\\cmd.exe");
        //c:\\windows\\System\\cmd.exe
        System.out.println("c:\\\\windows\\\\System\\\\cmd.exe");
        //  \"  :一个"
        //老师说:"要好好学习Java，多敲代码"
        System.out.println("老师说:\"要好好学习Java，多敲代码\"");
        //  \'  : 一个'
        //老师说:'要多敲代码'
        System.out.println("老师说:\'要多敲代码\'");
        //  \r  :一个回车
        //  idea结果：C++
        //  其他编译器可能的结果：C++a程序开发
        System.out.println("Java程序开发\rC++");
        /*
             Java程序开发
             C++
         */
        System.out.println("Java程序开发\r\nC++");
    }
}
