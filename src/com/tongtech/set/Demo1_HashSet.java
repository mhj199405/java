package com.tongtech.set;

import com.tongtech.set.bean.Person;

import java.util.HashSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 20:32
 */
public class Demo1_HashSet {
    /*
    * Set集合，无索引，不可以重复，无序(存取不一致)
    * */
    public static void main(String[] args) {
       //demo1();
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",23)); //当new的时候，添加到内存时自动调用hashcode方法，随机分配一个hashcode值
        hs.add(new Person("张三",23));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));
        System.out.println(hs.size());
        System.out.println(hs);
    }
    public static void demo1(){
        HashSet<String> hs = new HashSet<>();  //创建HashSet对象
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");  // 当向set集合中存储重复元素的时候返回false
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        System.out.println(hs);    // HashSet的继承体系中有重写toString方法
        System.out.println(b1);
        System.out.println(b2);
        for (String s:hs){     //只要可以用迭代器迭代的，就可以使用增强的for循环
            System.out.println(s);
        }
    }
}













