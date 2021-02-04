package com.tongtech.code;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/19 10:43
 */
class Student1{
    static {
        System.out.println("Student1静态代代码块");
    }
    {
        System.out.println("Student1构造代码块");
    }
    public Student1() {
        System.out.println("Student1的构造方法");
    }
}
public class Demo2_Student {
  static {
        System.out.println("Demo2_Student静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("我是main方法");
        Student1 student1 = new Student1();
        Student1 student2 =new Student1();
    }
}
