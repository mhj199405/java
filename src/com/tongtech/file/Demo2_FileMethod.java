package com.tongtech.file;

import java.io.File;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 11:54
 */
public class Demo2_FileMethod {
   /* createNewFile() ：当且仅当具有该名称的文件尚不存在时，原子地创建一个由该抽象路径名命名的新的空文件。
      mkdir():创建由此抽象路径名命名的目录。
      mkdirs():创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录。
      注意事项
         如果你创建文件或者文件夹忘了写盘符，那么，默认在项目路径下
    */
    public static void main(String[] args) throws IOException {
        demo1();
//        File file = new File("bbb.txt");
//        boolean b = file.mkdir();
//        System.out.println();
//        File file1 = new File("ccc");
//        boolean mkdirs = file1.mkdirs();
//        System.out.println(mkdirs);
    }
    public static void demo1() throws IOException{
        File file = new File("m.txt");
        boolean newFile = file.createNewFile(); //如果没有就创建，返回true
        System.out.println(newFile);
        File cccc = new File("cccc");
        boolean newFile1 = cccc.createNewFile();
        System.out.println(newFile1);
    }
}
