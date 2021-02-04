package com.tongtech.stream.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/4 5:22
 */
public class Test3 {
    /*
    * 将键盘录入的数据拷贝到当前项目下的text.txt文件中，键盘录入数据当遇到quit时就退出
    * */
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("text.txt");
       Scanner scanner=new  Scanner(System.in);
        System.out.println("请输入数据：");
        while (true){
            String s=scanner.nextLine();
            if(!(s.equals("quit"))){
                fos.write(s.getBytes());
                fos.write("\r\n".getBytes());
            }else {
                break;
            }
        }
        fos.close();
    }
}
