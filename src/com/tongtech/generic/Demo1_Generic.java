package com.tongtech.generic;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 18:58
 */
public class Demo1_Generic {
    /*
    * A：泛型的概述
    * B:泛型好处
    *  提高安全性(将运行期的错误转换到编译器)
    *  省去强转的麻烦
    * C：泛型基本使用
    *   <>中放的必须是引用数据类型
    * D:泛型使用注意事项
    *   前后的泛型一致，或者后面的泛型可以省略不写(1.7的新特性菱形泛型)
    * */
    public static void main(String[] args) {
      //demo1();
        // int[] a=new byte[];//数组要保证前后的数据类型一致
        //ArrayList<Object> people = new ArrayList<>(); //集合的泛型要保证前后的数据类型一致
        ArrayList<Object> list = new ArrayList<>(); //1.7版本的新特性，菱形泛型
        ArrayList<Object> list1 = new ArrayList<>(); //泛型最好不要定义成Object，没有意义
        list1.add("aaa");
        list1.add(true);
    }
    public static void demo1(){
        ArrayList<Person> list = new ArrayList();

        list.add(new Person("张三",24));
        Iterator<Person> it = list.iterator();
        while (it.hasNext()){
            //System.out.println(it.next().getName()+"---"+it.next().getAge()); //next()方法只能调用一次，如果调用多次，指针就会向后移动多次
            Person p = it.next();
            System.out.println(p.getName()+"-----"+p.getAge());
        }

    }
}


















