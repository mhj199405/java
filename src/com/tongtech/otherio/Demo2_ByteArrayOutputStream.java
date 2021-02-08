package com.tongtech.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 9:48
 */
public class Demo2_ByteArrayOutputStream {
    public static void main(String[] args) throws IOException {
       //demo1();
        FileInputStream fis = new FileInputStream("d.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();//在内存中创建了可以增长的内存数组
        int b;
        while ((b=fis.read())!=-1){
            baos.write(b);//将读取到的输入写入内存中
        }
       /* byte[] bytes = baos.toByteArray(); //将缓冲区中的数据全部获取出来，并且赋给bytes数组
        System.out.println(new String(bytes).toString());*/
        System.out.println(baos.toString());//将缓冲区的内容转换为字符串，在输出语句可以省略调用toString方法
        fis.close();
    }
    public static void demo1() throws IOException{
        FileInputStream fis = new FileInputStream("d.txt");
        byte[] arr=new byte[3];
        int leng;
        while ((leng=fis.read(arr))!=-1){
            System.out.print(new String(arr,0,leng));
        }
        fis.close();
    }
}
