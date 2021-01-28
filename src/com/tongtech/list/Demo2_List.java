package com.tongtech.list;

import com.tongtech.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/19 20:18
 */
public class Demo2_List {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Student("张三",23));
        list.add(new Student("李四",23));
        list.add(new Student("王五",23));
        list.add(new Student("赵六",23));
        /*Iterator it = list.iterator();
        while(it.hasNext()){
            Student  s =(Student) it.next();
            System.out.println(s.getName()+"---"+s.getAge());
        }*/
        for(int i=0;i<list.size();i++){
            //System.out.println(list.get(i)); //通过索引获取每一个元素
           Student s=(Student) list.get(i);
            System.out.println(s.getName()+"===="+s.getAge());
        }
    }
}
