package com.tongtech.arraylist;

import java.util.LinkedList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 18:50
 */
public class Queue {
    private LinkedList list=new LinkedList();
    public void in(Object obj){
        list.addFirst(obj);
    }
    public Object out(){
        return list.removeLast();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
