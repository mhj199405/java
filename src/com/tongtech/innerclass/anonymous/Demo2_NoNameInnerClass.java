package com.tongtech.innerclass.anonymous;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/29 15:54
 */
public class Demo2_NoNameInnerClass {
    public static void main(String[] args) {
        Outers outers = new Outers();
        outers.method();
    }
}
interface Inters{
    public void show1();
    public void show2();
}
//  匿名内部类只针对重写一个方法的时候使用
class Outers{
    public void method(){
        /*new Inters(){
            public void show1(){
                System.out.println("show1");
            }
            public void show2(){
                System.out.println("show2");
            }
        }.show1();
        new Inters(){
            public void show1(){
                System.out.println("show1");
            }
            public void show2(){
                System.out.println("show2");
            }
        }.show2();*/
        Inters i=new Inters(){ // 父类引用指向子类对象
            public void show1(){
                System.out.println("show1");
            }
            public void show2(){
                System.out.println("show2");
            }
//            public void show3(){
//                System.out.println("show3");
//            }
        };
        i.show1();
        i.show2();
        //i.show3();//匿名内部类是不能向下转型的，因为没有子类类名
    }
}
