package homework.homework05;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:40
 */
public class Factory {
    /**
     * 认为马为一匹马，且只能通过工厂创建马
     */
    private static Horse horse = new Horse();
    private Factory(){

    }
    /**
     * 养马
     * @return
     */
    public static   Horse buildHorse(){
        return  new Horse();
    }
    public static Horse oneHorse(){
        return horse;
    }
    /**
     * 造船
     * @return
     */
    public static Boat builBoat(){
        return new Boat();
    }

    /**
     * 创建飞机
     * @return
     */
    public static Aircraft builAircraft(){
        return new Aircraft();
    }
}
