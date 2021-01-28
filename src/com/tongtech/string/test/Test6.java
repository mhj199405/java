package com.tongtech.string.test;

import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/5 17:24
 */
public class Test6 {
    public static void main(String[] args) {
         /* String s="Abcd";
          String s1="abcd";
        int i = s.compareTo(s1);//比较两个字符串是否相等
        System.out.println(i);
        int i1 = s.compareToIgnoreCase(s1);
        System.out.println(i1);
        System.out.println(s.concat(s1)==(s+s1));
        System.out.println(s+s1);
        char[] c={'a','c','d','d'};
        String s2 = String.copyValueOf(c);
        String s3 = String.valueOf(c);
        System.out.println(s2);
        System.out.println(s3);*/
//        demo();
//       demo1();
        //demo2();
        login();
    }
    public static void demo(){
        String max="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhiyaonengzhaodaogongzuodejiushihaoma";
        String min="heima";
        int count=0;
        int index=0;
        while((index=max.indexOf(min)) !=-1){
            count++;
            max=max.substring(index+min.length());
        }
        System.out.println(count);
    }
    public static void demo1(){
        String max="woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhiyaonengzhaodaogongzuodejiushihaoma";
        String[] split = max.split(",");
        for(int i=0;i<split.length;i++){
            System.out.print(split[i]+"  ");
        }
    }
    public static void demo2(){
        String s="aimhjhidfhajfhi";
        char c = s.charAt(1); // 返回char指定索引的值
        System.out.println(c);
        int i = s.codePointAt(1);// 返回指定索引的处字符的unicode码表值
        System.out.println(i);
        System.out.println("----------");
        int codePointBefore = s.codePointBefore(1);// 返回指定索引字符之前的字符的Unicode编码值
        System.out.println(codePointBefore);
        int i1 = s.codePointCount(0, 2);
        System.out.println(i1);
        int lastIndexOf = s.lastIndexOf("hi",12);
        System.out.println(lastIndexOf);
        byte[] bytes = s.getBytes();
        for(byte b:bytes){
            System.out.print(b+ " ");
        }
        char[] chars = s.toCharArray();
        for(char c1:chars){
            System.out.print(c1+"  ");
        }
        int in = s.lastIndexOf(97,6);
        System.out.println(in);
        int j = s.lastIndexOf('a');
        System.out.println(j);
        int hi = s.lastIndexOf("hi", 7);
        System.out.println(hi);
    }
    public static void login(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("please input username:");
            String username = sc.nextLine();
            System.out.println("please input password");
            String password=sc.nextLine();
            if("admin".equals(username) && "root".equals(password)){
                System.out.println(username+"登陆成功！");
                break;
            }else{
              int num=2-i;
              if(num==0){
                  System.out.println("您的输入密码错误的次数已经三次，请明天再试！");
              }else{
                  System.out.println("您好！你还有"+num+"输入密码的机会");
              }
            }
        }
    }
}
