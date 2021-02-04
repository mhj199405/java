package com.tongtech.arraylist;

import java.util.LinkedList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 18:16
 */
public class Stack {
    private LinkedList linkedList=new LinkedList();
    /*
    * 模拟进栈的方法
    * */
    public void in(Object obj){
       linkedList.addLast(obj);
    }
    /*
    * 模拟出栈的方法
    *
    * */
    public Object out(){
        return linkedList.removeLast();
    }
    /*
    * 模拟判空的方法
    * */
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
