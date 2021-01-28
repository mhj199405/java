package com.tongtech.classes;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/15 18:54
 */
public class Demo5_Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setBrand("华为p40");
        phone.setPrice(4399);
        System.out.println("手机品牌"+phone.getBrand()+",手机价钱"+phone.getPrice());
        new Phone("华为Mate40",4499).show();
    }
}
class Phone{
    private String brand;
    private int price;
    public Phone(){}
    public Phone(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void show(){
        System.out.println("手机品牌"+brand+",手机价钱"+price);
    }
}
