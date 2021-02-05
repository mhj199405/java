package com.tongtech.chario;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 9:59
 */
public class Demo1_FileReader {
    public static void main(String[] args) throws IOException {
        //创建一个文件,并且往里面写一些东西
      /*  BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("du.txt"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入数据:");
        while (true){
            String s = scanner.nextLine();
            if("quit".equals(s)){
                break;
            }
            bos.write(s.getBytes());
            bos.write("\r\n".getBytes());
        }
        bos.close();*/
       FileReader fr = new FileReader("du.txt");
       int length;
       while ((length=fr.read())!=-1){
           System.out.print((char) length);
       }
    }
}
