package alanrookie.homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 20:36
 * 定义Music类，里面有音乐名 name,音乐时长times,并有播放和返回本身属性信息的方法
 *
 */
public class Music {
    /**
     * 音乐名称
     */
    String name;
    /**
     * 时长 每秒
     */
    int times;
    public Music (){

    }
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("开始播放音乐");
        System.out.println("音乐名:" + this.name + "\t时长:" + (times / 60) +"分" + (times % 60) + "秒");
    }
    public String info(){
        return "音乐名:" + this.name + "\t时长:" + (times / 60) +"分" + (times % 60) + "秒";
    }
}
