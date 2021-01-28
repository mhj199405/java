package com.tongtech.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 16:22
 */
public class Demo1_ArrayList {
    /*
    * A:案例演示
    * 需求：ArrayList去除集合中字符串的重复值(字符串的内容相同)
    * 思路：创建新集合方式
    * */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("bb");
        list.add("bb");
        list.add("bb");
        list.add("c");
        list.add("cc");
        list.add("d");
        ArrayList single = Demo1_ArrayList.getSingle(list);
        System.out.println(single);
    }
     /*
        * 创建新集合将重复的元素去掉
        * 1、明确返回值类型，返回ArrayList
        * 2、明确参数列表ArrayList
        *
        * 分析：
        * 1、创建新集合
        * 2、根据传入的集合(老集合)获取迭代器
        * 3、遍历集合
        * 4、通过新集合判断是否包含老集合中的元素，如果包含就不添加，如果不包含就不添加
        * */
     public static ArrayList getSingle(ArrayList list){
         ArrayList newlist = new ArrayList();
         Iterator it = list.iterator();
         while (it.hasNext()){
            Object obj=it.next();
            if(!(newlist.contains(obj))){
                newlist.add(obj);
            }
         }
         return newlist;
     }
}
















