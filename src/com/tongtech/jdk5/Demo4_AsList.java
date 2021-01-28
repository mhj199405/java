package com.tongtech.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 17:10
 */
public class Demo4_AsList {
    /*
    * 将数组转化成集合
    * 数组转化成集合虽然不能增加或者减少元素，但是可以用集合的思想操作数组，也就是说可以使用其他集合的方法
    * */
    public static void main(String[] args) {
      //demo1();
      //demo2();
       //集合转数组，加泛型的
        ArrayList<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        String[] s = list.toArray(new String[10]); //当集合转数组时，数组长度如果小于等于集合的size时，
                       // 转换后的数组长度等于集合的size；如果数组的长度大于集合的size，分配的数组长度就和你指定的长度一样
        for (String ss:s){
            System.out.println(ss);
        }
    }
    public static void demo2(){
        //int[] arr={12,3,34,5};
        //List<int[]> ints = Arrays.asList(arr); //基本数据类型的数组转化为集合，会将整个数组当做一个对象转化
        //System.out.println(ints);
        Integer[] arr={12,3,34,5};
        List<Integer> list = Arrays.asList(arr); //将数组转换为集合，必须是引用类型数据
        System.out.println(list);
    }
    public static void demo1(){
        String[] s={"ad","12","df21","dfsa"};
        List<String> list = Arrays.asList(s);//将数组转换为集合
        Iterator<String> it = list.iterator();
        list.add("mihaijun"); //出现UnsupportedOperationException异常，不能添加
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
