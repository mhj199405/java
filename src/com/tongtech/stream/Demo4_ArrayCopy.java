package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 18:34
 */
public class Demo4_ArrayCopy {
    /*
    *  第三种
    * 定义小数组
    * */
    public static void main(String[] args) throws IOException {
         // demo1();
         // demo2();
        FileInputStream fis = new FileInputStream("韩宝仪-粉红色的回忆.mp3");
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        byte[] arr=new byte[1024*8];
        int length;
        while ((length= fis.read(arr))!=-1){//如果忘记了加arr,返回的不是读取有效的字节个数，而是字节的码表值
            fos.write(arr,0,length);
        }
        fis.close();
        fos.close();
    }
    public static void demo2() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        FileOutputStream fos = new FileOutputStream("mmm.txt");
        byte[] arr=new byte[2];
        int length;
        while ((length= fis.read(arr))!=-1){
            fos.write(arr,0,length);
        }
        fis.close();
        fos.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");
        byte[] arr=new byte[2]; //将文件上的字节读取到字节数组中
        int i = fis.read(arr); //读到有效的字节个数
        System.out.println(i);
        for (byte b:arr){
            System.out.println(b);
        }
        System.out.println("----------------");
        int i1 = fis.read(arr); //读到有效的字节个数
        System.out.println(i1);
        for (byte b:arr){
            System.out.println(b);
        }
        fis.close();
    }
}
