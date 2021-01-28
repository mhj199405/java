package com.tongtech.innerclass.member;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/28 19:33
 */
public class Test1_InnerClass {
    public static void main(String[] args) {
        Outere.Innde oi=new Outere().new Innde();
        oi.show1();
    }
}
// 要求：使用已知的变量，在控制台输出 30,20,10
// 内部类之所以能获取到外部类的成员，是因为它能获取到外部类的引用外部类名.this
class Outere{
    public int num=10;
    class Innde{
        public int num=20;
        public void show1(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outere.this.num);
        }
    }
}
