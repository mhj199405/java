package com.tongtech.map;

import java.util.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 11:02
 */
public class Demo9_Hashtable {
    /*
    * 面试题：
    *  HashMap和Hashtable的区别
    * 共同点：
    * 底层都是哈希算法，都时双列集合
    * 区别：
    * 1、HashMap是线程不安全的，效率高，JDK1.2版本
    *    Hashtable是线程安全的，效率低  JDK1.0版本
    * 2、HashMap可以存储null键和null值
    *    Hashtable不可以存储null键和null值
    * */
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put(null,34);
        ht.put("李四",null);
        System.out.println(ht);
    }
    public static void hashMap(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put(null,23);
        map.put("张三",null);
        System.out.println(map);
        //使用迭代器遍历
      /*  Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }*/
        for(String s:map.keySet()){
            Integer value = map.get(s);
            System.out.println(s+"="+value);
        }

    }
}






