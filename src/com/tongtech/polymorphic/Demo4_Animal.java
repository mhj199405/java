package com.tongtech.polymorphic;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/23 15:06
 */
public class Demo4_Animal {
    public static void main(String[] args) {
        /* Cats c=new Cats();
         c.eat();*/
        method(new Cats());
        method(new Dogs());
        //Animals a=new Cats(); //开发的时候很少在创建对象的时候用父类引用指向子类对象；直接创建子类对象更方便，可以使用子类中特有属性和行为
    }
//    Cats c=new Dogs();//狗是一只猫
    /*public static void method(Cats c){
        c.eat();
    }
    public static void method(Dogs c){
        c.eat();
    }*/
    // 如果把狗强制转成猫就会出现类型转化异常，ClassCastException
    public static void method(Animals a){ // 当做参数的时候用多态最好，因为扩展性强
        // instanceof 判断前边的引用是否是后边的数据类型
       if(a instanceof Cats){
           Cats c=(Cats)a;
           c.eat();
           c.catchMouse();
       }else if (a instanceof  Dogs){
           Dogs d=(Dogs)a;
           d.eat();
           d.lookHome();
       }else{
           a.eat();
       }
    }
}
/*
*  A：多态的好处
*     提高了代码的维护性(继承保证)
*     提高了代码的扩展性(由多态保证)
*  B: 多态的弊端
*     不能使用子类的特有的属性和行为
*  C: 案例演示
*      多态的好处
*      可以当做形式参数，可以接收任意子类对象
*
* */
class Animals{
   public void eat(){
       System.out.println("动物吃饭");
   }
}
class Cats extends Animals{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
class Dogs extends  Animals{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}