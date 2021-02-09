package com.tongtech.otherio.test;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 9:33
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("copy2.jpg"));//改变标准输入流
        System.setOut(new PrintStream("copy1.jpg"));//改变标准输出流
        InputStream is = System.in;
        PrintStream ps = System.out;
        byte[] arr=new byte[1024*4];
        int b;
        while ((b=is.read(arr))!=-1){
            ps.write(arr,0,b);
        }
        is.close();
        ps.close();
    }
}
