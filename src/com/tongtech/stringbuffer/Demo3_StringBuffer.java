package com.tongtech.stringbuffer;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/8 10:09
 */
public class Demo3_StringBuffer {
    /*
    *A:StringBuffer的删除功能
    *  public  StringBuffer deleteCharAt(int index)
    *      删除指定位置的字符，并返回本身
    *  public StringBuffer delete(int start,int end)
    *      删除从指定位置开始指定位置结束的内容，并返回本身
    * */
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        //sb.deleteCharAt(5); // 当缓冲区中的这个索引上没有元素的时候就会报StringIndexOutOfBoundsException
        sb.append("mihaijun");
        sb.deleteCharAt(3); // 根据索引删除索引对应位置上的字符串
        System.out.println(sb);

        StringBuffer sb1=new StringBuffer();
        sb1.append("woshimihaijun");
        //sb1.delete(0,4);  //删除时，包含头不包含尾
        //sb1.delete(0,sb1.length()); //清空缓存区
       // System.out.println(sb1);
        //sb1=new StringBuffer();//不推荐使用这种方式清空缓存区，原来的对象会变成垃圾，浪费内存

    }
}
