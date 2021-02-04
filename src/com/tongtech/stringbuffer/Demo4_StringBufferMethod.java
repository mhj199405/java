package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 10:26
 */
public class Demo4_StringBufferMethod {
    /*
    * A:StringBuffer的替换功能
    *   public StringBuffer replace(int start,int end,String str)
    *      从start到end用str替换(包含头不包含尾)
    *   public StringBuffer reverse()
    *      字符反转
    * */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
         sb.append("woshimihaijun");
//        sb.replace(5,sb.length(),"zhangsanfen"); //替换
         sb.reverse(); // 反转
        System.out.println(sb);
    }
}
