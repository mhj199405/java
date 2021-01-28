package com.tongtech.stringbuffer.test;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 10:55
 */
public class Test1_StringBuffer {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6};
        String s = arrayToSAtring(arr);
        System.out.println(s);
    }
    public static String arrayToSAtring(int[] arr){
        StringBuffer sb = new StringBuffer();//创建字符串缓冲区对象
        sb.append("[");   // 将[添加到缓冲区
        for(int i=0;i<arr.length;i++){      // 遍历数组
            if(i==arr.length-1){
               sb.append(arr[i]).append("]");// [1,2,3]
            }else{
                sb.append(arr[i]).append(",");// [1,2,
            }
        }
        return sb.toString();
    }
}
