package homework.homework05;

import study.abstractclass.abstractdetail.B;
import study.abstractclass.abstractdetail.F;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/27 14:42
 */
public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     * 交通工具
     */
    private Vehicles vehicles;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    /**
     * 赶路的方法
     */
    public void makeHaste(){
        vehicles.work();
    }

    /**
     * 过河
     */
    public void  passRiver(){
        //判断当前的vehicles是不是船 ，如果vehicles为空返回 false
        if (!(vehicles  instanceof Boat)){
            vehicles = Factory.builBoat();
        }
        vehicles.work();
    }

    /**
     * 一般情况
     */
    public void  common(){
        if (!(vehicles instanceof Horse)){
            vehicles = Factory.buildHorse();
        }
        vehicles.work();
    }
    public void passFlamingMountain(){
        if (!(vehicles instanceof Aircraft)){
            vehicles = Factory.builAircraft();
        }
        vehicles.work();
    }
}
