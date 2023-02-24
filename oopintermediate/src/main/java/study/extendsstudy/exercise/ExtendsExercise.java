package study.extendsstudy.exercise;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/11/22 22:53
 */
public class ExtendsExercise {
    public static void main(String[] args) {
      /*  PC pc = new PC();
        pc.brand = "联想";
        pc.cpu = "i7-12000K";
        pc.memory = "64G";
        pc.disk = "ssd-4T";
        pc.getDetails();
        NotePad notePad = new NotePad();
        notePad.cpu = "17-12000H";
        notePad.memory = "32G";
        notePad.disk = "ssd-2T";
        notePad.color = "白色";
        notePad.getDetails();*/
        PC pc = new PC("i7-12000k","64GB","4TB","联想");
        pc.printInfo();
        NotePad notePad = new NotePad("i7-13000K","32GB","2TB","白色");
        notePad.printInfo();
    }
}
