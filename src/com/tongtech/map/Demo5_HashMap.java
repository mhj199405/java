package com.tongtech.map;

import com.tongtech.map.bean.Student;

import java.util.HashMap;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/26 18:33
 */
public class Demo5_HashMap{
    public static void main(String[] args) {
            HashMap<Student, String> map = new HashMap<>();
            map.put(new Student("张三",23),"天水");
            map.put(new Student("张三",23),"兰州");
            map.put(new Student("李四",23),"兰州");
            map.put(new Student("王五",23),"兰州");
        System.out.println(map);
    }
}
