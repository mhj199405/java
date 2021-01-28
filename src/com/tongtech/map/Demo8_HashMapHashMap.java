package com.tongtech.map;

import com.tongtech.map.bean.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/27 9:32
 */
public class Demo8_HashMapHashMap {
    public static void main(String[] args) {
        //2014届高三补习班
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("张三",23),"天水");
        map.put(new Student("李四",24),"兰州");
        map.put(new Student("王五",25),"平凉");
        map.put(new Student("赵六",26),"定西");
        //2015届补习班
        HashMap<Student, String> map1 = new HashMap<>();
        map1.put(new Student("唐僧",23),"天水");
        map1.put(new Student("猪八戒",24),"兰州");
        map1.put(new Student("孙悟空",25),"平凉");
        map1.put(new Student("沙僧",26),"定西");
        HashMap<HashMap<Student,String>, String> hm = new HashMap<>();
        hm.put(map,"2014届补习班");
        hm.put(map1,"2015届补习班");
        long start = System.currentTimeMillis();
        //使用迭代器进行双重HashMap的遍历
       /* Set<Map.Entry<HashMap<Student, String>, String>> entries = hm.entrySet();
        Iterator<Map.Entry<HashMap<Student, String>, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<HashMap<Student, String>, String> next = iterator.next();
            HashMap<Student, String> key = next.getKey();
            String value = next.getValue();
            Set<Map.Entry<Student, String>> entries1 = key.entrySet();
            Iterator<Map.Entry<Student, String>> iterator1 = entries1.iterator();
            while (iterator1.hasNext()){
                Map.Entry<Student, String> next1 = iterator1.next();
                Student key1 = next1.getKey();
                String value1 = next1.getValue();
                System.out.println(key1+"="+value1+"="+value);
            }
        }*/
        //遍历双向HashMap集合，
        for(HashMap<Student, String> h:hm.keySet()){ // hm.ketSet()代表的是双列集合中键的集合
            String value = hm.get(h);   // get(h)根据键对象获取值对象
            //获取集合中集合的键的对象
            for( Student students :h.keySet()){  //h.keySet()获取集合总所有学生的键对象
                String value1 = h.get(students);
                System.out.println(students+"="+value1+"="+value);
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
