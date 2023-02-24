package study.filestudy;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2023/2/4 17:22
 * todo:文件：文件就是保存数据的地方，它可以是一张图片，也可以是视频声音等
 * todo: 文件流:文件在程序中是以流的形式来操作的
 *      流：数据在数据源(文件)和程序(内存)之间经历的路程
 *      输入流：数据从数据源(文件)到程序(内存)的路径
 *      输出流：数据从程序(内存)到数据源(文件)的路径
 *todo：常见的文件操作
 *      相关构造器：
 *          1.new File(String pathname) : 根据路径创建一个File对象
 *          2.new File(File parent,String child):根据父目录文件 + 子路径构建
 *          3.new File(String parent,String child):根据父目录 + 子路径构建
 *        相关方法：
 *          public boolean createNewFile() throws IOException：创建新文件
 *        获取文件信息：
 *           public String getName(): 获取文件名
 *           public String getAbsolutePath(): 获取文件的绝对路径
 *           public String getParent()：获取文件父级目录
 *           public long length()：获取文件大小(字节)
 *           public boolean exists(): 判断文件是否存在
 *           public boolean isFile(): 判断是不是一个文件
 *           public boolean isDirectory():判断是不是一个目录
 *           其余方法见API文档
 *       目录操作：
 *          public boolean delete():删除文件或空目录
 *          public boolean mkdirs()：创建多级目录
 *          public boolean mkdir()：创建一级目录
 *
 */
public class FileStudy {
}
