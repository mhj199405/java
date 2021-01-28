package com.tongtech.jdk5;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/21 15:11
 */
public class Demo3_Changeable {
    /*
    * A：可变参数概述
    *   定义方法的时候不知道该定义多少个参数
    * B:格式
    *   修饰符 返回值类型 方法名(数据类型...  变量名)
    * C:注意事项
    *   这里的变量其实是一个数组
    *   如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
    * */
    public static void main(String[] args) {
         int[] arr={12,-1,0,3,5};
         print(12,12,32,43,45);
        System.out.println("--------------");
        print();
    }
  /*  public static void print(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }*/
    public static void  print(int ...arr){ //可变参数其实是一个数组,可变参数大小是0到无穷大
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}



















