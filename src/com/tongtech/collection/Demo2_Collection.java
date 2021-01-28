package com.tongtech.collection;

import com.tongtech.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 13:31
 */
public class Demo2_Collection {
    /*
    注意：
          collectionXxx.java使用了未经检查或不安全的操作
          注意：要了解详细信息，请使用-Xlint:unchecked重新编译
          java编译器认为改程序存在安全隐患
    * add方法中如果集合是List一直返回都是true，因为List集合中允许存储重复元素
    *如果是Set集合当存储重复元素的时候，就会返回false
    *ArrayList的父类(abstractArrayList)的父类( AbstractCollection<E>)重写了toString方法,所以在打印对象的引用时，输出的结果
    * 不是Object类中的toString的结果
    * */
    public static void main(String[] args) {
        //demo1();
        Collection c=new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
       // c.remove("c");   //删除指定的元素
        // c.clear(); //清空集合
//        System.out.println(c.contains("c")); //判断是否包含某个元素
        System.out.println(c.isEmpty()); //判断集合是否为空
        System.out.println(c.size());  //获取集合中元素的个数
        System.out.println(c);
    }
    public static void demo1(){
        Collection c=new ArrayList();
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三",25));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(c);
    }
}













