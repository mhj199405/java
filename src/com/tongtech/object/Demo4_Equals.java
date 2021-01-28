package com.tongtech.object;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/12/30 13:07
 */

import com.tongtech.bean.Student;

/**
 * equals方法，比较两个对象是否相等
 * public boolean equals(Object obj) {
 *  return (this == obj);
 * }
 * Object中的equals方法是比较对象的地址值，没有什么意义，我们需要重写他
 * 因为在开发中我们通常比较的是对象中的属性值，我们认为相同属性是同一个对象，这样我们就需要重写equals方法
 *  ==和equals方法的区别：
 *    共同点： 都可以做比较。返回值都是boolean
 *    区别： 1、==号是比较运算符，既可以比较基本数据类型，也可以比较引用数据类型，基本数据类型比较的是值，引用数据类型比较的是地址值
 *          2、equals方法只能比较的是引用数据类型，equals方法在没有重写之前，比较的是地址值，底层依赖的是==号，但是比较地址值是没有意义的，我们需要重写equals方法
 *          比较对象中的属性值
 * */
public class Demo4_Equals {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 24);
        Student s2 = new Student("张三", 24);
        boolean b = s1.equals(s2);
        System.out.println(s1==s2);
        System.out.println(b);
    }
}
