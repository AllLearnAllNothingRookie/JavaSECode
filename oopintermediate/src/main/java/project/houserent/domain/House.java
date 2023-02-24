package project.houserent.domain;

/**
 * @author AllLearnAllNothingRookie
 * @version 1.0
 * @date 2022/12/6 9:27
 */
public class House {
    /**
     * id
     */
    private int id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 月租金
     */
    private double rent;
    /**
     * 状态 0:未租  1:已租
     */
    private int state;

    public House() {
    }

    public House(String name, String phone, String address, double rent, int state) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public House(int id, String name, String phone, String address, double rent, int state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", rent=" + rent +
                ", state=" + state +
                '}';
    }
}
