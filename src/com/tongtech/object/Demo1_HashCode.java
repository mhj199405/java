package com.tongtech.object;

import com.tongtech.bean.Student;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/30 9:40
 */
public class Demo1_HashCode {
    public static void main(String[] args) {
        Object obj=new Object();
        int hashCode=obj.hashCode();
        System.out.println(hashCode);
        Student student = new Student("张三", 23);
        Student student1 = new Student("李四", 24);
        System.out.println(student);
        System.out.println(student1);
    }
}
