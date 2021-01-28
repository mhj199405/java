package com.tongtech.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 20:43
 */
public class Demo3_List {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("world");
        /*Iterator it = list.iterator();  //获取迭代器
        while(it.hasNext()){ //判断集合中是否有元素
//            System.out.println(it.next());
            String str=(String)it.next();  //向下转型
            if("world".equals(str)){
              list.add("javaee"); // 遍历的时候并增加元素；并发修改ConcurrentModificationException
            }
        }*/
        ListIterator lit= list.listIterator();  //获取迭代器
        while(lit.hasNext()){ //判断集合中是否有元素
//            System.out.println(it.next());
            String str=(String)lit.next();  //向下转型
            if("world".equals(str)){
                //list.add("javaee"); // 遍历的时候并增加元素；并发修改ConcurrentModificationException
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
