package com.tongtech.otherio.test;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 11:25
 */
public class Test1 {
    /*
     * 定义一个文件输入流，调用read(byte[])方法，将a.txt文件中的内容打印出来(byte数组大小限制为5)
     * */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] arr=new byte[5];
        int b;
        while ((b=fis.read(arr))!=-1){
            baos.write(arr,0,b);
        }
        //System.out.println(baos);//即使没有调用,底层也会默认帮我们调用toString()方法
        byte[] bytes = baos.toByteArray();
        System.out.println(new String(bytes));
    }
}
