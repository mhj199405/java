package com.tongtech.stream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/2 13:30
 */
public class Demo2_FileOutputStream {
    /*
    * FileOutputStream在创建对象的时候如果没有这个文件会帮我们创建出来，
    * 如果有这个文件就会先将文件清空
    * */
    public static void main(String[] args) throws IOException {
       //demo1();
        FileOutputStream fis = new FileOutputStream("m.txt", true);//如果想续写，就在第二个参数传true
        fis.write(100);
        fis.write(101);
        fis.write(102);
        fis.close();
    }
    public static void demo1() throws IOException {
        FileOutputStream fos = new FileOutputStream("y.txt");//字节输出流对象，如果没有就自动创建一个
        fos.write(97); //虽然写出了一个int数，但是到文件上是一个字节，会自动去除前8位
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
