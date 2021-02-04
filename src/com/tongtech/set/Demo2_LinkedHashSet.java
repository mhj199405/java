package com.tongtech.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/22 11:29
 */
public class Demo2_LinkedHashSet {
    /*
    * LinkedHashSet
    * 底层是链表实现的，是set集合中唯一一个能保证怎么存就怎么取的集合对象
    * 因为是HashSet的子类，所以也是保证元素唯一的，与HashSet的原理一样
    *
    * */
    public static void main(String[] args) {
        LinkedHashSet<Object> lhs = new LinkedHashSet<>();
        lhs.add("d");
        lhs.add("d");
        lhs.add("d");
        lhs.add("d");
        lhs.add("a");
        lhs.add("a");
        lhs.add("a");
        lhs.add("b");
        lhs.add("b");
        lhs.add("c");
        lhs.add("c");
        lhs.add("c");
        lhs.add("c");


        for(Iterator<Object> it = lhs.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}



















