package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 18:39
 */
public class Test4_Animal {
    public static void main(String[] args) {
        Cats cats = new Cats("黑", 4);
        System.out.println(cats.getColor()+"------"+cats.getLeg());
        cats.eat();
        cats.catchMouse();
        System.out.println("-----------------");
        Dogs dogs = new Dogs("黄", 4);
        System.out.println(dogs.getColor()+"------"+dogs.getLeg());
        dogs.eat();
        dogs.lookHome();
    }
}
class Animals{
    private String color;
    private int leg;

    public Animals() {
    }

    public Animals(String color, int leg) {
        this.color = color;
        this.leg = leg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
class  Cats extends Animals{
    public Cats(){}
    public Cats(String color,int leg){
        super(color,leg);
    }
    public void eat(){
        System.out.println("吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class  Dogs extends Animals{
    public Dogs(){}
    public Dogs(String color,int leg){
        super(color,leg);
    }
    public void eat(){
        System.out.println("狗吃屎");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
