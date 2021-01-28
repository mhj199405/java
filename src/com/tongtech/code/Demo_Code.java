package com.tongtech.code;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 10:03
 */
public class Demo_Code {
    public static void main(String[] args) {
        // 局部代码块；作用：限定了变量的生命周期
        /*{
            int x=10;
            System.out.println(x);
        }*/
        Student student = new Student();
        System.out.println("------------------");
        Student student1 = new Student("张三", 25);
    }
    static{
        System.out.println("我是主方法中的静态代码块");
    }
}
class Student{
    private String name;
    private int age;

    public Student() {
//        study();
        System.out.println("空参构造");
    } // 空参构造

    public Student(String name, int age) { //有参构造
//        study();
        this.name = name;
        this.age = age;
        System.out.println("有参构造");
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
    // 构造代码块：每创建一次对象就会执行一次，优先于构造函数执行
    {
//        System.out.println("构造代码块");
        study();
    }
    public void  study(){
        System.out.println("学生应该具备学习的能力");
    }
    //随着类的加载而加载，只执行一次
    //　作用：用来给类进行初始化，一般用来加载驱动
    // 静态代码块是优先于主方法执行
    static {
        System.out.println("我是静态代码块");
    }
}
