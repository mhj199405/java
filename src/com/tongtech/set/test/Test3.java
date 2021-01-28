package com.tongtech.set.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/22 14:53
 */
public class Test3 {
    /*
    * 案例演示;
    *   将集合重复的元素去掉
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        System.out.println("没有去重之前：");
        System.out.println(list);
        System.out.println("去重之后：");
        ArrayList<String> single = getSingle(list);
        System.out.println(single);

    }
    public static ArrayList<String> getSingle(ArrayList<String> list){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
        return list;
    }
}
