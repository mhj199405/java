package com.tongtech.string;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/4 9:51
 */
public class Demo4_StringMethod {
    public static void main(String[] args) {
        String s1="heima";
        String s2="heima";
        String s3="HeiMa";
        String s4="abcdefgh";
        String s5="   abchfff      ";
        //比较字符串的内容是否相同，区分大小写
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        // 将字符串转化为字符数组
        char[] chars=s3.toCharArray();
        for(char s: chars){
            System.out.print(s);
        }
        System.out.println();
        System.out.println("---------------");
        //比较字符串的内容是否相同，忽略大小写
        System.out.println(s1.equalsIgnoreCase(s3));
        // 判断大字符串是否包含小字符串
        System.out.println(s4.contains("abcd"));
        System.out.println("--------------");
        // 判断某个字符串是否是按照指定的字符串开头
        System.out.println(s4.startsWith("ab"));
        System.out.println("---------------");
        // 判断某个字符串是否是按照指定的字符串结尾
        System.out.println(s4.endsWith("gh"));
        System.out.println("-----------");
        // 去掉字符串的前导空格和后导空格
        System.out.println(s5.trim());
        // 判断字符串是否为空
        String s6="abcac";
        String s7="";
        String s8=null;
        /*
        * ""和null区别：
        *  ""是字符串常量，同时也是一个String类的对象，既然是String类的对象也可以调用String类的方法
        *  null是空常量，不能调用任何方法，否则会出现空指针异常，null可以给任意的引用数据类型赋值
        *
        * */
        System.out.println(s6.isEmpty());
        System.out.println(s7.isEmpty());
        System.out.println(s8);
        StringBuilder sb=new StringBuilder();
        sb.append("sdfsfd");
        System.out.println(sb);
    }
}
