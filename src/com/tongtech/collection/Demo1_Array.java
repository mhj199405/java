package com.tongtech.collection;

import com.tongtech.bean.Student;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/18 20:15
 */
public class Demo1_Array {
    public static void main(String[] args) {
       //int[] arr=new int[5]; //基本数据类型数组的定义
        Student[]  arr=new Student[5];
        arr[0]=new Student("张三",24);
        arr[1]=new Student("李四",24);
        arr[2]=new Student("王五",24);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
