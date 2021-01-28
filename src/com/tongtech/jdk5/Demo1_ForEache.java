package com.tongtech.jdk5;

import com.tongtech.arraylist.bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 11:07
 */
public class Demo1_ForEache {
    /*
    * A；增强的for概述
    *   简化数组和Collection集合的遍历
    * B:格式
    *   for(元素数据类型 变量：数组或者Collection集合){
    *         使用变量即可，该变量就是元素
    *   }
    * C：案例演示
    *    数组，集合存储元素用增强for遍历
    * D:好处：
    *    简化遍历
    * 增强的for循环底层依赖的是迭代器(Iterator)
    * */
    public static void main(String[] args) {
        //demo1();
        //demo2();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        /*
        * 普通for循环删除要i--
        * */
       /* for(int i=0;i< list.size();i++){
            if("b".equals(list.get(i))){
                list.remove(i--);
            }
        }
        System.out.println(list);*/
       /*
       * 使用迭代器删除
       * */
     /*   Iterator<String> it = list.iterator();
        while(it.hasNext()){
           if("b".equals(it.next())){
//               list.remove("b"); //不能用集合的删除方法，因为迭代过程中如果集合修改会出现并发修改异常
               it.remove();
           }
       }*/
         /*
         * for循环进行迭代
         * */
        /*for( Iterator<String> it1 = list.iterator();it1.hasNext();){
            if("b".equals(it1.next())){
                it1.remove();
            }
       }*/
        /*
        * 使用增强的for循环;增强的for循环只能遍历，不能删除
        * */
        for(String s:list){
            if("b".equals(s)){
                list.remove("b");
            }
        }
        System.out.println(list);
    }
    public static void demo2(){
        ArrayList<Person> p = new ArrayList<>();
        p.add(new Person("张三",23));
        p.add(new Person("李四",24));
        p.add(new Person("王五",25));
        p.add(new Person("赵六",26));
        for(Person s:p){
            System.out.println(s);
        }
    }
    public static void demo1(){
        int[] a={2,2,33,45,-9,0};
        for (int i:a){
            System.out.println(i);
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for(String s:list){
            System.out.println(s);
        }
    }
}


















