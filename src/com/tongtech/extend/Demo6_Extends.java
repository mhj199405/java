package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 15:39
 */
public class Demo6_Extends {
    public static void main(String[] args) {
        Son6 son6 = new Son6();
        System.out.println("-------------------");
        System.out.println(son6.getName()+"---------"+son6.getAge());
        Son6 son61 = new Son6("张三", 25);
        System.out.println(son61.getName()+"---------"+son61.getAge());
    }
}
/*
* A： 案例演示
*    父类没有无参构造方法，子类怎么办
*    super解决
*    this解决
* B:注意事项
*   super(...)或者this(...)必须出现在构造方法的第一条语句上
*/
class Father6{
    private String name;
    private int age;
//    public Father6(){
//        System.out.println("Father6无参构造");
//    }
    public Father6(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Father6有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Son6 extends Father6{
    public Son6(){
//        super("hani",26);
        this("zjhagm",25);
        System.out.println("Son6无参构造");
        return;
    }
    public Son6(String name,int age){
        super(name,age);
        System.out.println("Son6有参构造");
        return;
    }
}


