package com.tongtech.arraylist;

import java.util.LinkedList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 17:58
 */
public class Demo4_LinkedList {
    /*
    * 用LinkedList模拟栈结构
    * */
    public static void main(String[] args) {
        //demo1();
        Stack s = new Stack();
        //这是进栈
        s.in("a");
        s.in("b");
        s.in("c");
        s.in("d");
        while(!s.isEmpty()){
            System.out.println(s.out());
        }
        Queue q = new Queue();
        q.in("a");
        q.in("b");
        q.in("c");
        q.in("d");
        while(!q.isEmpty()){
            System.out.println(q.out());
        }
    }
    public static void demo1(){
        LinkedList list = new LinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");  //abcd
        /*System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());*/
        while (!list.isEmpty()){
            System.out.println(list.removeLast());
        }
    }
}
