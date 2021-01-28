package com.tongtech.innerclass.anonymous;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/29 15:24
 */
public class Demo1_NoNameInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.method();
    }
}
/**
 * A:匿名内部类
 *   就是在内部类的简化写法
 * B：前提：存在一个类或者接口
 *    这里的类可以是具体类也可以是抽象类
 * C:格式
 *    new 类名或者接口名(){
 *        重写方法
 *    }
 * D：本质是什么呢？
 *    是一个继承了该类或者实现了该接口的子类匿名对象
 * E: 案列演示：
 *     按照要求来一个匿名内部类
 */
interface Inter{
    public  void print();
}
class Outer{
  class Inner implements Inter{
      public void print(){
          System.out.println("print");
      }
  }
  public void method(){
//      Inner i=new Inner();
//      i.print();
      new Inner().print();
     //Inner inner= new Inner(); //父类引用指向子类对象
      new Inter(){ //　实现了Inter接口；重写抽象方法
          public void print(){
              System.out.println("匿名print");
          }
      }.print();
  }
}