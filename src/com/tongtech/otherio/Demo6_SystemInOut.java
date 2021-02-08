package com.tongtech.otherio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 16:58
 */
public class Demo6_SystemInOut {
    public static void main(String[] args) throws IOException {
     //demo1();
        System.setIn(new FileInputStream("a.txt"));//改变标准输入流
        System.setOut(new PrintStream("f.txt"));//改变标准输出流
        InputStream in = System.in; //获取标准的键盘输入流，默认指向键盘，改变后指向文件
        PrintStream out = System.out;//获取标准的输出流，默认指向控制台，改变后指向文件
        int i;
        while ((i=in.read())!=-1){
            out.write(i);
        }
       // System.out.println(); //也是一个输出流，因为没有和硬盘上的文件产生关联的管道
        in.close();
        out.close();
    }
    public static void demo1() throws IOException{
        InputStream is = System.in;//如果关联到某个文件，必须关闭流
        int read = is.read();
        System.out.println(read);
        is.close();
        InputStream iss = System.in;
        int read1 = iss.read();
        System.out.println(read1);
    }
}
