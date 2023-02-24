package study.exceptionhandling.trycatchfinallyhandle;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/28 21:18
 */
public class FinallyReturn {
    public static void main(String[] args) {
        System.out.println(method());
        System.out.println(fun());
        System.out.println(func());
    }
    public static  int method(){
        try{
            String [] names = new String[3];
            //NullPointerException
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                //ArrayIndexOutOfBoundsException
                names[3] = "rookie";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return 2;
        }catch (NullPointerException e){
            return 3;
        }finally {
            return 4;
        }
    }
    public static  int fun(){
        int i = 1;
        try{
            i ++;
            String [] names = new String[3];
            //NullPointerException
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                //ArrayIndexOutOfBoundsException
                names[3] = "rookie";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return ++ i;
        }catch (NullPointerException e){
            return ++ i;
        }finally {
            return ++ i;
        }
    }
    public static  int func(){
        int i = 1;
        try{
            i ++;
            String [] names = new String[3];
            //NullPointerException
            if (names[1].equals("tom")){
                System.out.println(names[1]);
            }else {
                //ArrayIndexOutOfBoundsException
                names[3] = "rookie";
            }
            return 1;
        }catch (ArrayIndexOutOfBoundsException e){
            return ++ i;
        }catch (NullPointerException e){
            return ++ i;
        }finally {
            ++ i;
            System.out.println("i = " + i);
        }
    }
}
