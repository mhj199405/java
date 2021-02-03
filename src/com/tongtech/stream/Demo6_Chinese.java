package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/3 16:46
 */
public class Demo6_Chinese {
    /*
    * 字节流读取中文的问题
    *      字节流在读取中文的时候可能会读到半个中文，造成乱码
    *字节流写出中文的问题
    *      字节流直接操作的字节，所以写出中文必须将字符串转换成字节数组
    *      写出回车换行write("\r\n".getBytes());
    * */
    public static void main(String[] args) throws IOException {
        //demo1();
        FileOutputStream fos = new FileOutputStream("mhj.txt");
        fos.write("不该 范德萨和飞洒发生".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        int leng;
        byte [] arr=new byte[2];
        while ((leng=fis.read(arr))!=-1){
            System.out.println(new String(arr,0,leng));
        }
        fis.close();
    }
}
