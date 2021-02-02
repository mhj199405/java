package com.tongtech.stream;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 22:45
 */
public class Demo5_Buffer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("韩宝仪-粉红色的回忆.mp3");//创建对象输入流，关联。MP3
        FileOutputStream fos = new FileOutputStream("mhj.mp3");//创建对象输出流，关联.mp3
        BufferedInputStream bis = new BufferedInputStream(fis); //创建缓存区对象，对输入流进行包装让其变得更加强大
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
        }
        bis.close();
        bos.close();
    }
}
