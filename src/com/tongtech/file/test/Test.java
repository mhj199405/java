package com.tongtech.file.test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 19:07
 */
public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\T470\\Desktop\\restfulcrud-实验");
        String[] list = file.list();//C:\Users\T470\Desktop\restfulcrud-实验\corejava\图片\final所有的.jpg文件
       /* for (String s:list){
           if(s.endsWith(".jpg")){
               System.out.println(s);
           }
        }*/
      /*  File[] files = file.listFiles();
        for (File f:files){
            if(f.isFile() && f.getName().endsWith(".jpg")){
                System.out.println(f);
            }
        }*/
       String[] arr= file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file1 = new File(dir, name);
                return file1.isFile() && (file1.getName().endsWith(".jpg") || file1.getName().endsWith(".pdf"));
            }
        });
        for (String a:arr){
            System.out.println(a);
        }
    }
}
