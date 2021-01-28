package com.tongtech.extend;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/22 18:29
 */
public class Test4_Person {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(25);
        System.out.println(student.getName()+"----"+student.getAge());
        student.eat();
        student.study();
        Teacher teacher = new Teacher();
        teacher.setName("李四");
        teacher.setAge(34);
        System.out.println(teacher.getName()+"-----"+teacher.getAge());
        teacher.eat();
        teacher.study();
    }
}
class  Person{
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
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
    public void eat(){
        System.out.println(name+"吃饭");
    }
}
class  Student extends Person{
    public Student(){}
    public Student(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println(this.getName()+"---------学习");
    }
}
class Teacher extends Person{
    public Teacher(){}
    public Teacher(String name,int age){
        super(name,age);
    }
    public void study(){
        System.out.println(this.getName()+"---------上课");
    }
}