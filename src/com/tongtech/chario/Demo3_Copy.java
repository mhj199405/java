package com.tongtech.chario;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 10:24
 */
public class Demo3_Copy {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //demo1();
        //demo2();
        //demo3();
        BufferedReader bfr = new BufferedReader(new FileReader("xie.txt"));
        BufferedWriter bfw = new BufferedWriter(new FileWriter("mj.txt"));
        int c;
        while ((c=bfr.read())!=-1){
            bfw.write(c);
        }
        bfr.close();
        bfw.close();
    }
    public static void demo3() throws IOException{
        FileReader fr = new FileReader("xie.txt");
        FileWriter fw = new FileWriter("mj.txt");
        char[] arr=new char[1024];
        int i;
        while ((i=fr.read(arr))!=-1){ //将文件上的数据读取到字符数组中
            fw.write(arr,0,i);  //将字符数组中的数据写到文件上
        }
        fr.close();
        fw.close();
    }
    public static void demo2() throws IOException{
        //字符流不能拷贝纯文本文件
        FileReader fr = new FileReader("2.jpg");
        FileWriter fw = new FileWriter("mhj.jpg");
        int i;
        while ((i=fr.read())!=-1){
            fw.write(/*(char)*/i);
        }
        fr.close();
        fw.close();//Writer类中有一个2k的小缓冲区，如果不关闭刘，就会内容写到缓冲区里，关流会将缓冲区的内容刷新，再关闭
    }
    public static void demo1() throws IOException{
        FileReader fr = new FileReader("xie.txt");
        FileWriter fw = new FileWriter("mj.txt");
        int i;
        while ((i=fr.read())!=-1){
            fw.write(/*(char)*/i);
        }
        fr.close();
        fw.close();//Writer类中有一个2k的小缓冲区，如果不关闭刘，就会内容写到缓冲区里，关流会将缓冲区的内容刷新，再关闭
    }
}












