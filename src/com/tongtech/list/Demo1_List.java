package com.tongtech.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 19:04
 */
public class Demo1_List {
    public static void main(String[] args) {
      //demo1();
      //demo2();
      //demo3();
      //demo4();
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.set(2,"adfafkj");//将指定位置的元素修改
        System.out.println(list);
    }
    public static void demo4(){
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        /*Object o = list.get(1);
        System.out.println(o);*/
        //通过索引遍历List集合
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public static void demo3(){
        List list=new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
        list.remove(111); //删除的时候不会自动装箱；只要你给整数，他就当做索引对待
        System.out.println(list);
    }
    public static void demo2(){
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("a");
        list.add("b");
        Object remove = list.remove(1); //通过索引删除元素；被删除的元素将被返回
        System.out.println(remove);
        System.out.println(list);
    }
    public static void demo1(){
        List list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(4,"o");//index<=size并且大于等于0;都不会报异常
        //list.add(1,"d");  //在指定的位置添加元素
        // list.add(10,"f"); //java.lang.IndexOutOfBoundsException当存储时，使用不存的索引时出现了越界异常
        System.out.println(list);
    }
}
