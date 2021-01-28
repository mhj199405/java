package com.tongtech.collection;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.tongtech.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 18:45
 */
public class Demo5_Iterator {
    /*
    * 迭代
    *   A:迭代器概述
    *      集合是用来存储元素的额，存储的元素需要查看，那么就需要迭代(遍历)
    * */
    public static void main(String[] args) {
      //demo1();
        Collection c=new ArrayList();
        c.add(new Student("张三",25));
        c.add(new Student("李四",26));
        c.add(new Student("王五",27));
        c.add(new Student("赵六",25));
        Iterator it = c.iterator();
        while (it.hasNext()){
            Student stu =(Student) it.next();

            System.out.println(stu.getName()+"--"+stu.getAge());
            /*System.out.println(it.next());*/
        }
    }
    public static void demo1(){
        Collection c=new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Iterator it = c.iterator(); //获取迭代器
    /*    boolean b = it.hasNext();//判断集合中是否有元素，有就返回true
        System.out.println(b);
        Object next = it.next();//获取集合中的元素
        System.out.println(next);
        boolean b1 = it.hasNext();//判断集合中是否有元素，有就返回true
        System.out.println(b1);
        Object next1 = it.next();//获取集合中的元素
        System.out.println(next1);*/
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
