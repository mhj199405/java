package com.tongtech.generic;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 10:25
 */
public class Demo5_Generic {
    /*
    * A：泛型通配符<?>
    *     任意类型，如果没有明确，那么就是Object及任意的java类了
    * B：？extends E
    *     向下限定，E及其子类
    * C:？super E
    *     向上限定，E及其子类
    * */
    public static void main(String[] args) {
        //List<?> inters = new ArrayList<>(); //当右边的泛型是不确定的，那么左边的泛型就可以是?
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("张三",23));
        p.add(new Person("李四",24));
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("王五",25));
        s.add(new Student("赵六",26));
        p.addAll(s);
        System.out.println(p);

    }
}











