package com.tongtech.set.bean;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/23 16:59
 */
public class Student {
    private String name;
    private int chinese;
    private int math;
    private int english;
    private int sum;
    public Student() {
    }

    public Student(String name, int chinese, int math, int english) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.sum=this.chinese+this.math+this.english;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum;
    }

    public int getSum() {
        return sum;
    }
}
