package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 16:23
 */
public class Demo3_Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("2.jpg");//创建输入流对象，关联2.jpg
        FileOutputStream fos = new FileOutputStream("copy.jpg");
        int b;
        while ((b=fis.read())!=-1){
            fos.write(b);
        }
        fis.close();
        fos.close();
    }
}
