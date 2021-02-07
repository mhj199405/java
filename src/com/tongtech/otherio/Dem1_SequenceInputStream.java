package com.tongtech.otherio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/7  23:16
 */
public class Dem1_SequenceInputStream {
    public static void main(String[] args) throws IOException {
        //demo1();
        FileInputStream fis1 = new FileInputStream("a.txt"); //创建字节输入流关联a.txt
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileOutputStream fos = new FileOutputStream("c.txt",true);
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int b;
        while ((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close(); //sis在关闭流的时候，会将构造参数中传入的流的对象也关闭掉
        fos.close();
    }
    public static void demo1()throws IOException{
        FileInputStream fis1 = new FileInputStream("a.txt"); //创建字节输入流关联a.txt
        FileOutputStream fos = new FileOutputStream("c.txt",true);//创建字节输出流关联c.txt
        int i;
        while ((i=fis1.read())!=-1){ //不断的在a.txt中读取字节
            fos.write(i);//将读取的字节写入c.txt
        }
        fis1.close(); //关闭字节输入流
        FileInputStream fis2 = new FileInputStream("b.txt");//创建字节输入流关联b.txt
        int b;
        while ((b=fis2.read())!=-1){
            fos.write(b);
        }
        fis2.close();
        fos.close();
    }
}
