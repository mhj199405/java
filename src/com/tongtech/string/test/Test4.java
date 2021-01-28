package com.tongtech.string.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 19:11
 */
public class Test4 {
    /*
    * A：案例演示：
    *   需求：把一个字符串的首字母转换为大写，其他的为小写
    *   链式编程：只有保证每次调用完方法返回的是对象，就可以继续调用
    * */
    public static void main(String[] args) {
         String s="woaiHeiMa";
        String s1 = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(s1);
    }
}
