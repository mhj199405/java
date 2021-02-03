package com.tongtech.stream;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 22:45
 */
public class Demo5_Buffer {
    /*
    * close方法
    *   具备刷新的功能，在关闭刘之前，就会先刷新一次缓冲区，将缓冲的字节全都刷新到文件上，再关闭，close方法关闭之后就不能再写了
    * flush方法
    *  具备刷新的功能，刷新之后可以继续写
    * */
    public static void main(String[] args) throws IOException {
       //demo1();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("韩宝仪-粉红色的回忆.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fh.mp3"));
        int b;
        while ((b=bis.read())!=-1){
            bos.write(b);
          //  bos.flush(); //随时写随时刷新
        }
        bos.flush();
//        bis.close();
//        bos.close();
    }
    public static void demo1() throws IOException {
        /*
         *  缓存流使用了，内存的运算效率比硬盘要高的多，所有只要降低硬盘的读写次数就会提高效率
         * */
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
