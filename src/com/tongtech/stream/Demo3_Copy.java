package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 16:23
 */
public class Demo3_Copy {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        /*这种方式不推荐使用
        * 因为有可能导致内存溢出
        * */
        FileInputStream fis = new FileInputStream("韩宝仪-粉红色的回忆.mp3");//创建输入流对象，关联2.jpg
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        //int available = fis.available();  //获取文件的字节数
        byte[] arr=new byte[fis.available()]; //创建和文件一样大小的字节数
        fis.read(arr);// 将文件上的字节读取到内存中
        fos.write(arr);//将字节数组中的字节数据写到文件上
        fis.close();
        fos.close();

    }
    public static void demo2() throws IOException{
        FileInputStream fis = new FileInputStream("韩宝仪-粉红色的回忆.mp3");//创建输入流对象，关联2.jpg
        FileOutputStream fos = new FileOutputStream("copy.mp3");
        int b;
        while ((b=fis.read())!=-1){ //不断的读取每一个字节
            fos.write(b); //将每一个字节写出
        }
        fis.close(); //关流释放资源
        fos.close();
    }
    public static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("2.jpg");//创建输入流对象，关联2.jpg
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        int b;
        while ((b=fis.read())!=-1){ //不断的读取每一个字节
            fos.write(b); //将每一个字节写出
        }
        fis.close(); //关流释放资源
        fos.close();
    }
}
