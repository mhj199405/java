package com.tongtech.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/25 19:22
 */
public class Demo3_Iterator {
    /*
    * Map集合的第二种迭代，根据键值对对象，获取键和值
    * A：键值对对象找键和值的思路
    *    获取所有键值对对象的结合
    *    遍历键值对对象的集合，获取到每一个键值对对象
    *    根据键值对对象找键和值
    * */
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);
       /* Set<String> key = map.keySet();
        Iterator<String> it = key.iterator();
        while (it.hasNext()){
            String key1 = it.next();
            Integer value = map.get(key1);
            System.out.println(key1+"="+value);

        }*/
       /*for(String key:map.keySet()){
           Integer value=map.get(key);
           System.out.println(key+"="+value);
       }*/
        /*
        * Map.Entry说明Entry是Map的内部接口，将键和值封装成了entry对象，并存储于在Set集合中
        * */
       /* Set<Map.Entry<String, Integer>> entrySet =map.entrySet(); // 父类引用指向子类
        //获取每一个对象
        Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
        while (it.hasNext()){
            //获取每一个Entry对象
            Map.Entry<String, Integer> entry = it.next();
            //根据键值对对象获取键
            String key = entry.getKey();
            //根据键值对对象获取值
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }*/
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           System.out.println(entry.getKey()+"="+entry.getValue());
       }

    }
}
