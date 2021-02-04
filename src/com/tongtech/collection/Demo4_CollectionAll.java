package com.tongtech.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 18:17
 */
public class Demo4_CollectionAll {
    public static void main(String[] args) {
       //demo1();
       //demo2();
       //demo3();
       demo4();

    }
    public static void demo4(){
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        //c2.add("d");
//        c2.add("e");
        //获取两个集合的交集,如果调用的集合改变就返回true,如果调用的集合不变就返回false
        //从该集合中删除所有不包含在指定集合中的元素。
        boolean b = c1.retainAll(c2);
        System.out.println(b);
        System.out.println(c1);
    }
    public static void demo3(){
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
       /* c2.add("z");*/
        boolean b = c1.containsAll(c2); //判断调用的集合是否包含传入的集合
        System.out.println(b);
    }
    public static void demo2(){
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("z");
        c1.removeAll(c2);
        System.out.println(c1);
    }
    public static void demo1(){
        Collection c1=new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");
        Collection c2=new ArrayList();
        c2.add("a");
        c2.add("b");
        // c1.addAll(c2);  //将c2中的每一个元素看作一个对象都添加到c1中
        c1.add(c2);//将集合c2看做一个元素添加到集合c1
        System.out.println(c1);
    }
}
