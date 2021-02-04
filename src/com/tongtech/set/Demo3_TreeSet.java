package com.tongtech.set;

import com.tongtech.set.bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/22 15:59
 */
public class Demo3_TreeSet {
    /*
    * TreeSet集合是用来给集合排序的，同样也可以保证数据的唯一性
    * 当compareTo方法返回0的时候集合中只有一个元素
    * 当compareTo方法返回正数的时候集合怎么存就怎么取
    * 当compareTo方法返回负数的时候集合会倒序存取
    * */
    public static void main(String[] args) {
      //demo1();
      //demo2();
      //demo3();
      // demo4();
       demo5();

    }
    /*
       * 将字符串按照长度排序
       * */
    public static void demo5(){
        TreeSet<String> ts = new TreeSet<>(new DemoComparator());
        ts.add("aaaaa");
        ts.add("aaaaaaa");
        ts.add("bb");
        ts.add("ccc");
        ts.add("dddd");
        System.out.println(ts);
    }
    public static void demo4(){
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("zhangsan",23));
        ts.add(new Person("lisi",24));
        ts.add(new Person("zhangsao",23));
        ts.add(new Person("wangwu",43));
        System.out.println(ts);
    }
    public static void demo3(){
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("米海军",24));
        ts.add(new Person("米海军",20));
        ts.add(new Person("王五",25));
        ts.add(new Person("王五",90));
        ts.add(new Person("赵六",26));
        ts.add(new Person("张三",23));
        ts.add(new Person("张三",24));
        System.out.println('米'+0);
        System.out.println('张'+0);
        System.out.println('赵'+0);
        System.out.println(ts);
    }
    public static void demo2(){
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三",23));
        ts.add(new Person("李四",24));
        ts.add(new Person("米海军",24));
        ts.add(new Person("王五",25));
        ts.add(new Person("赵六",26));
        System.out.println(ts);
    }
    public static void demo1(){
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(3);
        ts.add(3);
        ts.add(2);
        ts.add(2);
        System.out.println(ts);
    }
}
class DemoComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        int num=o1.length()-o2.length() ;
        return num == 0 ? o1.compareTo(o2): num;
    }
}
