package com.tongtech.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 20:56
 */
public class Demo4_ListIterator {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("a");
        list.add("bb");
        list.add("ccc");
        list.add("dddd");
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()); //获取元素并且指针向后移动
        }
        System.out.println("------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous()); //获取元素并且指针向前移动，必须依赖与hashNext才能遍历
        }
    }
}
