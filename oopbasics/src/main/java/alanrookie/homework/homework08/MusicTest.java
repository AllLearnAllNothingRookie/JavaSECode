package alanrookie.homework.homework08;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/12 20:43
 */
public class MusicTest {
    public static void main(String[] args) {
        Music music = new Music("带我去找夜生活",299);
        music.play();
        String info = music.info();
        System.out.println(info);
    }
}
