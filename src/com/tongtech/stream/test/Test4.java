package com.tongtech.stream.test;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/4 13:08
 */
public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa.txt"));
        System.out.println("请输入数据:");
        while (true){
            String s = scanner.nextLine();
            if(s.equals("quit")){
                break;
            }
            bos.write(s.getBytes());
            bos.write("\r\n".getBytes());
        }
        bos.close();
    }
}
