package com.tongtech.classes;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/15 18:41
 */
public class Demo4_Student {
    public static void main(String[] args) {
        Student student1 = new Student(); //使用空参构造
        student1.setName("米海军"); // 设置年龄
        student1.setAge(23);    // 设置姓名
        System.out.println("我得姓名是"+student1.getName()+",我的年龄是"+student1.getAge());
        // getxxx获取属性值，也可把获取的属性值赋给其他变量
        Student student2 = new Student("张三分", 24);
        student2.show();
    }
}
class Student{
    private String name;
    private int age;
    public Student(){
    }
    public Student (String name,int age){
        this.name=name;
        this.age=age;
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
    public void show(){ //　只是为了显示姓名和年龄
        System.out.println("我得姓名是"+name+",我的年龄是"+age);
    }
}
