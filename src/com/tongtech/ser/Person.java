package com.tongtech.ser;

import java.io.Serializable;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 9:34
 */
public class Person implements Serializable{

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3245478690496182643L;
    private String name;
    private int age;

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
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
