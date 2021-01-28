package com.tongtech.arraylist;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/20 17:11
 */
public class Demo2_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Person("张三",23));
        list.add(new Person("张三",23));
        list.add(new Person("李四",24));
        list.add(new Person("李四",24));
        list.add(new Person("李四",24));
        list.add(new Person("李四",24));
//        ArrayList single = getSingle(list);
//        System.out.println(single);
        list.remove(new Person("张三",23));
        System.out.println(list);
    }
  /*
  *  案例演示：
  *   A 需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
  *   B:注意事项：
  *     重写 equals方法
  *     contains方法 判断是否包含，底层依赖的是equals方法
  *     remove判断底层是否删除，依赖与equals方法
  * */
    public static ArrayList getSingle(ArrayList list){
        ArrayList newlist = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            if(!(newlist.contains(obj))){
                newlist.add(obj);
            }
        }
        return newlist;
    }
}
