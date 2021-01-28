package com.tongtech.collection;

import com.tongtech.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 17:39
 */
public class Demo3_Colletion {
    public static void main(String[] args) {
         //demo1();
        Collection c=new ArrayList();
        c.add(new Student("詹姆斯",36));
        c.add(new Student("科比",36));
        c.add(new Student("乔丹",36));
        c.add(new Student("MhJ",26));
        Object[] obj = c.toArray();
        for(int i=0;i<obj.length;i++){
            Student stu=(Student)obj[i];
            System.out.println(stu.getName()+"---------"+stu.getAge());
        }
    }
    public static void demo1(){
        Collection c=new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");
        Object[] array = c.toArray(); //将数组转化为集合
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
