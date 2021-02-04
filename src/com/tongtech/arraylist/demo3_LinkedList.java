package com.tongtech.arraylist;

import java.util.LinkedList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 17:30
 */
public class demo3_LinkedList {
    /*
    * public void addFirst(E e)及addLast(E e)
    * public E getFirst()及getLast()
    * public E removeFirst()及public E removeLast()
    * public E get(int index)
    * */
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addFirst("e");
        list.addLast("v");
       // System.out.println(list.getFirst()); //获取第一个元素
        //System.out.println(list.getLast()); //获取最后一个元素
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));
    }
}














