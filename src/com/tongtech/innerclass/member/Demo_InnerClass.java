package com.tongtech.innerclass.member;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/28 18:23
 */
public class Demo_InnerClass {
    public static void main(String[] args) {
        // 外部类名.内部类名 对象名=外部类名.内部对象；
       Outers.Inners oi=new Outers. Inners();
       oi.method();
       Outers1.Innders1.print();
       new Outers1.Innders1().hello();
    }
}
class Outers{
    static class Inners{
        public void method(){
            System.out.println("method");
        }
    }
}
class Outers1{
    static class Innders1{
        public static void print(){
            System.out.println("static method");
        }
        public void hello(){
            System.out.println("Hello World!");
        }
    }
}
