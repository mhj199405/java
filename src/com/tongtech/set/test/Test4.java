package com.tongtech.set.test;

import java.util.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/23 12:21
 */
public class Test4 {
    public static void main(String[] args) {
        //定义一个集合可以存储重复的元素，那就ArrayList集合
        ArrayList<String> al = new ArrayList<>();
        al.add("cccc");
        al.add("aaa");
        al.add("aaa");
        al.add("aaa");
        al.add("dddddd");
        al.add("bbb");
        //定义一个方法用来将List集合中的元素能够排序，并且还不能去重
        List<String> sort = getSort(al);
        System.out.println(sort);

    }
    public static List<String> getSort(List<String> list){
        //TreeSet集合自带排序和去重，除非实现你比较器排序
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num=o1.compareTo(o2);
                return num == 0 ? 1 : num;
            }
        });
        //将list集合中的元素添加到TreeSet集合中
       ts.addAll(list);
       //清空List集合中的元素
       list.clear();
       //将TreeSet集合中排序好的集合添加到List集合中
       list.addAll(ts);
       return  list;
    }
}
