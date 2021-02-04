package com.tongtech.map;

import com.tongtech.map.bean.Student;

import java.util.Comparator;
import  java.util.TreeMap;
/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/26 19:10
 */
public class Demo7_TreeMap {
    public static void main(String[] args) {
       // demo1();
        TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                int num=o1.getName().compareTo(o2.getName());
                return num == 0 ? o1.getAge()-o2.getAge() : num;
            }
        });


        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("李四",23),"北京");
        tm.put(new Student("王五",25),"北京");
        tm.entrySet();
        System.out.println(tm);
    }
    public static void demo1(){
        TreeMap<Student, String> tm = new TreeMap<>();
        tm.put(new Student("张三",23),"北京");
        tm.put(new Student("李四",23),"北京");
        tm.put(new Student("王五",25),"北京");
        tm.entrySet();
        System.out.println(tm);
    }
}
