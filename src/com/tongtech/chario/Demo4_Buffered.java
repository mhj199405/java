package com.tongtech.chario;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 11:24
 */
public class Demo4_Buffered {
    /*
    * 带缓冲区流的特殊方法：
    * readLine()
    * newLine()
    *
    * newLine()与\r\n的区别：
    *   newLine()是跨平台的方法
    *   \r\n只支持的是windows系统
    * */
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("mj.txt"));
        BufferedWriter bwr = new BufferedWriter(new FileWriter("mjj.txt"));
        String line;
        while((line=bfr.readLine())!=null){
            bwr.write(line);
            bwr.newLine(); //写出回车换行符
           // bwr.write("\r\n");
        }
        bfr.close();
        bwr.close();
    }
    public static void demo1() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("mj.txt"));
        String line;
        while ((line=bfr.readLine())!=null){
            System.out.println(line);
        }
        bfr.close();
    }
}
