package com.tongtech.object;

import com.tongtech.bean.Student;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/30 9:53
 */
public class Demo2_GetClass {
    public static void main(String[] args) {
        Student student = new Student("张三", 24);
        Class claszz=student.getClass();//获取该对象的字节码文件
        String name = claszz.getName();//获取名称
        System.out.println(name);
    }
}
