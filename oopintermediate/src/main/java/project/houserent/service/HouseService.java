package project.houserent.service;

import project.houserent.domain.House;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 9:47
 */
public class HouseService {
    /**
     * 房源信息
     */
    private House [] houses = null;
    private int count = 0;

    /**
     * 新增房源
     * @param house 新增房屋的信息
     * @return 返回新增结果
     */
    public boolean addHouse(House house) {
        //如果系统里没有任何房源则添加房源
        if (houses == null){
            houses = new House[16];
            houses[count ++] = house;
            return true;
        }
        //添加房源
        //如果房屋数量超过了数组容量则对数组进行扩容
        if (count >= houses.length){
            dilatation();
        }
        houses[count++] = house;
        return true;
    }

    /**
     * 查找房源
     * @param id 要查找房屋的编号
     * @return 返回查找到的房屋信息，没有找到则返回null
     */
    public House getHouseById(int id){
        //id没有在数组打范围内,或者房源没有任何房源
        if (houses == null || ( id <= 0 || id > count)){
            return  null;
        }
        return houses[(id - 1)];
    }

    /**
     * 删除房源
     * @param id 要删除房屋的编号
     * @return 返回删除的结果
     */
    public boolean deleteHouse(int id){
        //id没有在数组打范围内,或者房源没有任何房源
        if (houses == null || (id <= 0 || id > count )){
            return false;
        }
        //从数组中删除元素
        for (int i = (id - 1);i < count - 1;i ++){
            houses[i] = houses[i + 1];
        }
        count --;
        return true;
    }

    /**
     * 修改房屋信息
     * @param id 要修改房屋的编号
     * @param house 修改后的房屋信息
     * @return 修改结果
     */
    public boolean updateHouse(int id,House house){
        //id没有在数组打范围内,或者房源没有任何房源
        if (houses == null || (id <= 0 || id >count)){
            return false;
        }
        houses[(id - 1)] = house;
        return true;
    }

    /**
     * 房屋列表
     */
    public void  houseList(){
        if (count == 0){
            System.out.println("编号\t房主\t\t电话\t\t\t地址\t\t月租\t\t状态(为出租\\已出租)");
            System.out.println("\t\t\t暂时没有房源");
            return;
        }
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t\t月租\t\t状态(未出租\\已出租)");
       for (int i = 0;i < count;i ++){
           System.out.print((i + 1) + "\t");
           System.out.print(houses[i].getName() + "\t");
           System.out.print(houses[i].getAddress() + "\t");
           System.out.print(houses[i].getPhone() + "\t");
           System.out.print(houses[i].getRent() + "\t");
           System.out.print((houses[i].getState() == 0 ? "未出租" : "已出租" )+ "\n");
       }
    }

    /**
     * 房屋列表
     */
    public void dilatation(){
        House [] newhouse = new House[houses.length * 2];
        for (int i = 0;i < houses.length;i ++){
            newhouse[i] = houses[i];
        }
        houses = newhouse;
    }
}
