package com.tongtech.bean;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/30 9:42
 */
public class Student extends Object {
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    // 重写equals方法
    public boolean equals(Object o) {
         Student s=(Student)o;
        return this.name.equals(s.name) && this.age==s.age;
    }

}
