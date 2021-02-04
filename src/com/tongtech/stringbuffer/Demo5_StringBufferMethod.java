package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 10:32
 */
public class Demo5_StringBufferMethod {
    /*A:StringBuffer截取字符串
    *  public String  substring(int start)
    *    从指定位置截取到末尾，但是返回的字符串不再是StringBuffer而是String
    *  public String substring(int start,int end)
    *    从指定开始的位置截取到结束的位置，包含开始位置，但是不包含结束位置
    * */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("woshiheima");
//        String s = sb.substring(0);
//        System.out.println(s);
        String s1 = sb.substring(5, sb.length());
        System.out.println(s1);
    }
}
