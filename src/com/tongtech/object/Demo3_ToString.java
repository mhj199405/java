package com.tongtech.object;

import com.tongtech.bean.Student;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/30 10:06
 */
public class Demo3_ToString {
    public static void main(String[] args) {
        /*
        * public String toString() {
        *  return getClass().getName() + "@" + Integer.toHexString(hashCode());
        * }
        * 左边：类名
        * 中间：@
        * 右边：hashCode的十六进制表现形式
        * 这么写没有什么实际意义
        * toString方法的作用：可以更方便的显示属性值
        * getXxx方法是为了获取值，可以显示属性值，或做其他操作
        * */
        Student student = new Student("李四", 25);
      /*  String s = student.toString();
        System.out.println(s);*/
        System.out.println(student.toString());
        System.out.println(student);  // 如果直接打印对象的引用，会默认调用toString方法
        System.out.println(student.getName()+ student.getAge());
    }
}











