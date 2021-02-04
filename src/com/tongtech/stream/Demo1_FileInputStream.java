package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 11:28
 */
public class Demo1_FileInputStream {
    /*
    * read():方法读取的是一个字节，为什么返回的是int，而不是byte
    * 00010100 00100100 0100001 11111111 0000000
    * 10000001 byte类型-1的原码
    * 11111110 -1的反码
    * 11111111 -1的不嘛
    * */
    public static void main(String[] args) throws IOException {
       //demo1();
        FileInputStream fis = new FileInputStream("m.txt");
        int b;
        while ((b=fis.read())!=-1){
            System.out.println(b);
        }
        fis.close();

    }
    public static void demo1() throws IOException {
        FileInputStream fos = new FileInputStream("m.txt"); //创建流对象
        int i1 = fos.read(); //从硬盘上读取一个字节
        int i2 = fos.read();
        int i3 = fos.read();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        fos.close();
    }
}
