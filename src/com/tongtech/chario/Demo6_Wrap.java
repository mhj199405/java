package com.tongtech.chario;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 16:32
 */
public class Demo6_Wrap {
    /*
    * 装饰设置模式的好处是：
    *   耦合性不强，被装饰的类的变化和装饰类的变化无关
    *
    * */
    public static void main(String[] args) {
        Heima heima = new Heima(new Student());
        heima.code();
    }
}
interface Coder{
    public abstract void code();
}
class Student implements Coder{
    @Override
    public void code() {
        System.out.println("javaEE");
        System.out.println("javaSe");
    }
}
class Heima implements Coder{
    //获取被装饰的引用
    private Student student;
    //构造方法中传入被装饰的对象
    public Heima(Student student){
        this.student=student;
    }
    //对原有的功能进行升级
    @Override
    public void code() {
      student.code();
        System.out.println("ssm");
        System.out.println("ssh");
        System.out.println("SpringBoot");
        System.out.println("数据库");
        System.out.println("大数据");
    }
}