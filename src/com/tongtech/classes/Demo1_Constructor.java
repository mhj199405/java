package com.tongtech.classes;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/7 20:19
 *   构造方法的重载
 *     重载：方法名相同，与返回值类型无关(构造方法没有返回值)，只看参数列表
 *   构造方法注意事项
 *      如果我们没有给出构造方法，系统将自动提供一个无参构造方法
 *      如果我们给出构造方法，系统将不再提供默认的无参构造方法
 *         注意：这个时候，如果我们还想使用无参构造器，就必须自己给出，建议永远自己给出无参构造方法
 *
 */
public class Demo1_Constructor {
    public static void main(String[] args) {
        Person1 p = new Person1();
//        Person1 p1 = new Person1("掌上那",25);
//        p1.show();
    }
}
class Person1{
  private String name;
  private int age;
//  public Person1(){
//      System.out.println("这是无参构造器");
//  }
//  public Person1(String name,int age){
//      this.name=name;
//      this.age=age;
//  }
  public void show(){
      System.out.println(name+"-------"+age);
  }
}
