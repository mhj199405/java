package com.tongtech.wrapclass;

import java.util.Arrays;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/13 20:11
 */
public class Demo4_Integer {
    public static void main(String[] args) {
        Integer i= new Integer(129);
        Integer j=new Integer(129);
        System.out.println(i==j); // 结果：true
        System.out.println(i.equals(j)); // 结果：false
        System.out.println("-------------");
        Integer i1=127;
        Integer j1=127;
        System.out.println(i1==j1); //结果：true
        System.out.println(i1.equals(j1)); // 结果: true
        System.out.println("--------------");
        System.out.println(i==i1); //结果：false
        System.out.println(i.equals(i1)); // 结果: false

        System.out.println("--------------");
        Integer a=128;
        Integer b=128;
        System.out.println(a==b); //结果：false
        System.out.println(a.equals(b)); //结果：true
        /*
        * -128到127是byte的取值范围，如果在这个取值范围内，自动装箱就不会新建对象，而是从常量池中获取
        * 如果超过byte取值范围就会重新创建对象
        *      public static Integer valueOf(int i) {
        *          assert IntegerCache.high>=127
                 if (i >= IntegerCache.low && i <= IntegerCache.high)
                     return IntegerCache.cache[i + (-IntegerCache.low)];
                 return new Integer(i);
    }
        *
        *
        * */
      /*  String ss="abcdac";
        char[] chars = ss.toCharArray();
        System.out.println(chars);
        String s = new String(chars);
        System.out.println(s);
        System.out.println();*/
      float arr[]={2,3,45,5,5};
        //System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int i2 = Arrays.binarySearch(arr, 3);
        System.out.println(i2);
    }
}














