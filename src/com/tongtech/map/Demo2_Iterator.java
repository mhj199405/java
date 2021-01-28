package com.tongtech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/25 19:12
 */
public class Demo2_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
        System.out.println(map.get("张三")); //根据键获取值
        //获取所有的键
        /*Set<String> set = map.keySet(); //获取所有键的集合
        Iterator<String> it = set.iterator(); //获取迭代器
        while (it.hasNext()){
            String key=it.next();//获取每一个键
            Integer value=map.get(key); //根据key获取value
            System.out.println(key+"="+value);
        }*/
        //使用增强的for循环遍历集合
        for(String key:map.keySet()){
            System.out.println(key+"="+map.get(key));
        }
    }
}
