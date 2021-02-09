package com.tongtech.otherio;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 9:58
 */
public class Demo8_RandomAccessFile {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("f.txt", "rw");
//        raf.write(97);
//        int read = raf.read();
//        System.out.println(read);
        raf.seek(4); //在指定的位置设置指针
        /*raf.write(98);*/
        int read = raf.read();
        System.out.println(read);
        raf.close();
    }
}
