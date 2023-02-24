package project.houserent.view;

import project.houserent.domain.House;
import project.houserent.service.HouseService;
import project.houserent.utils.Utility;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 10:43
 * 显示用户界面
 * 接收用户输入
 * 调用service的各种操作
 */
public class HouseView {
    private HouseService houseService = new HouseService();

    /**
     * 系统界面
     */
    public void view(){
        while (true){
            System.out.println("===============房屋出租系统===============");
            System.out.println("\t1.新增房源");
            System.out.println("\t2.查找房屋");
            System.out.println("\t3.删除房屋");
            System.out.println("\t4.修改房屋信息");
            System.out.println("\t5.房屋列表");
            System.out.println("\t6.退    出");
            System.out.print("请选择(1~6):");
            char choose = Utility.readMenuSelection();
            switch (choose){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    houseService.houseList();
                    break;
                case '6':
                    char exit = Utility.readConfirmSelection();
                    if (exit == 'Y'){
                        return;
                    }
                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
    /**
     * 新增房源
     */
    public void addHouse(){
        //新增房源
        System.out.print("请输入房主:");
        String name = Utility.readString(10);
        System.out.print("请输入电话:");
        String phone = Utility.readString(12);
        System.out.print("请输入地址:");
        String address = Utility.readString(20);
        System.out.print("请输入月租:");
        double rent = Utility.readInt(0);
        System.out.print("请输入状态:");
        int state = Utility.readInt();
        House house = new House(name,phone,address,rent,state);
        houseService.addHouse(house);
    }

    /**
     * 查找房源
     */
    public void findHouse(){
        //查找房屋
        System.out.print("请输入房屋编号(-1退出):");
        int id = Utility.readInt(0);
        if (id== -1){
            return;
        }
        House houseById = houseService.getHouseById(id);
        if (houseById == null){
            System.out.println("房屋不存在");
            return;
        }
        System.out.println("编号\t房主\t\t电话\t\t\t地址\t\t月租\t\t状态(为出租\\已出租)");
        System.out.print((id) + "\t");
        System.out.print(houseById.getName() + "\t");
        System.out.print(houseById.getPhone() + "\t");
        System.out.print(houseById.getAddress() + "\t");
        System.out.print(houseById.getRent() + "\t");
        System.out.print((houseById.getState() == 0 ? "未出租" :
                "已出租" )+ "\n");
    }

    /**
     * 删除房源
     */
    public void deleteHouse(){
        //删除房屋
        System.out.print("请输入房屋编号(-1退出):");
        int deleteId = Utility.readInt(0);
        if (deleteId == -1){
            return;
        }
        System.out.println("你真的要删除房屋信息吗:");
        char choose = Utility.readConfirmSelection();
        if (choose == 'N'){
            System.out.println("你放弃了删除！！");
            return;
        }
        boolean b = houseService.deleteHouse(deleteId);
        if (!b){
            System.out.println("没有该编号的房屋信息");
            return;
        }
        System.out.println("删除成功");
    }

    /**
     * 修改房源
     */
    public void updateHouse(){
        System.out.print("请输入房屋编号(-1退出):");
        int updateId = Utility.readInt(0);
        if (updateId == -1){
            return;
        }
        House updateHouse = houseService.getHouseById(updateId);
        if (updateHouse == null){
            System.out.println("房屋不存在");
            return;
        }
        System.out.print("请输入房主(" + updateHouse.getName() +"),回车跳过输入:");
        updateHouse.setName(Utility.readString(10,updateHouse.getName()));
        System.out.print("请输入电话("+updateHouse.getPhone()+"),回车跳过输入:");
        updateHouse.setPhone(Utility.readString(12,updateHouse.getPhone()));
        System.out.print("请输入地址("+updateHouse.getAddress()+"),回车跳过输入:");
        updateHouse.setAddress(Utility.readString(20,updateHouse.getAddress()));
        System.out.print("请输入月租(" + updateHouse.getRent()+"),回车跳过输入:");
        updateHouse.setRent(Utility.readInt((int)updateHouse.getRent()));
        System.out.print("请输入状态(0/1)(" +( updateHouse.getState() == 0 ? "0:未出租" : "1:已经出租") +"),回车跳过输入:");

        updateHouse.setState(Utility.readInt(updateHouse.getState()));
        houseService.updateHouse(updateId,updateHouse);
    }
}
