package com.tongtech.jdk5;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 17:59
 */
public class Demo5_ArrayListArrayList {
    /*
    * A:案例演示
    *    集合嵌套值ArrayList嵌套ArrayList
    *  案例：
    *  我们学科，学科又分为若干个班级
    *  整个学科一个大集合
    *  若干个班级分为每一个小集合
    *
    * */
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list=new ArrayList<>();
        ArrayList<Person> first = new ArrayList<>();
        first.add(new Person("陈钰琪",28));
        first.add(new Person("蒋依依",24));
        first.add(new Person("鞠婧祎",26));
        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("肖战",28));
        second.add(new Person("杨洋",24));
        second.add(new Person("梁朝伟",26));
        list.add(first);
        list.add(second);
        for (ArrayList<Person> pp:list){
            //System.out.println(pp);
            for(Person p:pp){
                System.out.println(p);
            }
        }
    }
}






















