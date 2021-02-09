package com.tongtech.otherio;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 10:08
 */
public class Demo9_Data {
    public static void main(String[] args) throws IOException {
         //demo1();
         //demo2();
         //demo3();
         demo4();
    }
    public static void demo4() throws IOException{
        DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
        int x = dis.readInt();
        int y = dis.readInt();
        int z = dis.readInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        dis.close();
    }
    public static void demo3() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
        dos.writeInt(997);
        dos.writeInt(998);
        dos.writeInt(999);
        dos.close();
    }
    public static void demo2() throws IOException{
        FileInputStream fis = new FileInputStream("h.txt");
        int read = fis.read();
        System.out.println(read);
        fis.close();
    }
    public static void demo1() throws  IOException{
        FileOutputStream fos = new FileOutputStream("h.txt");
        fos.write(998);
//        fos.write(98);
//        fos.write(99);
        fos.close();
    }
}
