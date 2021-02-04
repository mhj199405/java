package com.tongtech.stream.test;

import com.tongtech.conmmon.Scaaner;

import java.io.*;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/3 19:51
 */
public class Test2 {
    /*
    * 在控制台录入文件的路径，将文件拷贝到当前路径项目下
    * 分析：
    *   1、创建键盘录入对象
    *   2、定义方法对键盘录入的路径进行判断，如果是文件就返回
    *   3、在主方法中接收改文件
    *   4、读和写该文件
    * */
    public static void main(String[] args) throws IOException {
        File file = getFile();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
        int i;
        while ((i=bis.read())!=-1){
             bos.write(i);
        }
        bis.close();
        bos.close();
    }
     public static File getFile(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("输入文件名：");
         while (true){
             String s = scanner.nextLine();
             File file=new File(s);
             if(file.isDirectory()){
                 System.out.println("这是一个目录");
             }else if(!(file.exists())){
                 System.out.println("你录入的文件不存在");
             }else {
                 return file;
             }
         }
     }
}
