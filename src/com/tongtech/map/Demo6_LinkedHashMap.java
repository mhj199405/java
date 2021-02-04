package com.tongtech.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/26 18:58
 */
public class Demo6_LinkedHashMap {
    /*
    LinkedHashMap保证怎么存就怎么取
    * */
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("张三",23);
        lhm.put("李四",24);
        lhm.put("赵六",26);
        lhm.put("王五",25);
        Set<Map.Entry<String, Integer>> entries = lhm.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
      while(iterator.hasNext()){
          Map.Entry<String, Integer> next = iterator.next();
          String key = next.getKey();
          Integer value = next.getValue();
          System.out.println(key+"="+value);
      }
        
//        System.out.println(lhm);
    }
}
