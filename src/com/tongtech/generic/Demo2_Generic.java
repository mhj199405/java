package com.tongtech.generic;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 19:33
 */
public class Demo2_Generic {
    /*
    * A:案例演示
    *   ArrayList存储字符串并遍历泛型版
    * */
    public static void main(String[] args) {
       demo1();
       ArrayList<Person> al=new ArrayList<>();
       al.add(new Person("张三",23));
       al.add(new Person("李四",24));
       al.add(new Person("王五",25));
       al.add(new Person("赵六",26));
        Iterator<Person> it = al.iterator();
        while (it.hasNext()){
              Person s=it.next(); // 将集合中的每一个元素用Person记录
            System.out.println(s.getName()+"---------"+s.getAge());
        }
    }
    public static void demo1(){
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        Iterator<String> it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
