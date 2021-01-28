package com.tongtech.string;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 12:54
 */
public class Demo5_StringMethod {
    public static void demo(){
        int[] arr={1,3,4,2,3};
        System.out.println(arr.length);  //数组中的length是属性
        String s1="heima";
        String s2="你是张三丰,还是?";
        System.out.println(s1.length()); // length()是一个方法，获取的是每一个字符的个数
        System.out.println(s2.length());
        // 根据索引获取对应的字符
        System.out.println(s2.charAt(3));
        //StringIndexOutOfBoundsException字符串索引越界异常
       /* char c=s2.charAt(10);
        System.out.println(c);*/
        //返回指定字符在此字符串中第一出现的位置索引
        System.out.println(s1.indexOf(97));
        //参数接收的是Int类型的，传递char类型的自动提升
        System.out.println(s1.indexOf('a'));
        // 如果不存在字符串，就返回-1
        System.out.println(s1.indexOf('f'));
        // 根据指定的字符串，寻找第一字符出现的索引位置
        System.out.println(s1.indexOf("im"));
        // 如果字符不是连接在一起的，那么就会找不到
        System.out.println(s1.indexOf("ai"));
    }
    public static void demo2(){
        String s1="woaiheima";
        // 返回指定字符在字符串中从指定位置后第一次出现的位置
        System.out.println(s1.indexOf('a',3));
        System.out.println(s1.indexOf("im",4));
        //返回指定的字符在字符串中从指定位置倒着找字符出现的第一次位置
        System.out.println(s1.lastIndexOf('a'));
        System.out.println(s1.lastIndexOf('a',6));
        System.out.println(s1.lastIndexOf("he",5));
    }
    public static void demo3(){
        String s1="heimawudi";
        String s2=s1.substring(5);
        System.out.println(s2);
        String s3=s1.substring(0,5); //包含头不包含尾
        System.out.println(s3);
    }
    public static void main(String[] args) {
        //demo();
        //demo2();
        demo3();
    }
}
