package com.tongtech.otherio;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/8 9:14
 */
public class Demo1_SequenceInputStream {
      /*
         整合多个输入流
      *  SequenceInputStream(Enumeration<? extends InputStream> e)
         整合两个输入流：
         SequenceInputStream(InputStream s1, InputStream s2)
      * */
    public static void main(String[] args) throws IOException {
//      demo1();
//      demo2();
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileInputStream fis3 = new FileInputStream("c.txt");
        Vector<FileInputStream> v = new Vector<>();
        v.add(fis1);
        v.add(fis2);
        v.add(fis3);
        Enumeration<FileInputStream> elements = v.elements();
        /*while (elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }*/
        SequenceInputStream sis = new SequenceInputStream(elements);//将枚举中的输入流整合成一个流
        FileOutputStream fos = new FileOutputStream("d.txt");
        int b;
        while ((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close();
        fos.close();
    }
    public static void demo2() throws IOException{
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        int b;
        while ((b=sis.read())!=-1){
            fos.write(b);
        }
        sis.close(); //sis在关闭流的时候，会将构造方法中传入的流也关闭掉
        fos.close();
    }
    public static void demo1() throws IOException{
          /*File file1 = new File("a.txt");
        File file2 = new File("b.txt");
        file1.createNewFile();
        file2.createNewFile();*/
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");
        int b1;
        while ((b1=fis1.read())!=-1){
            fos.write(b1);
        }
        fis1.close();
        FileInputStream fis2 = new FileInputStream("b.txt");
        int b2;
        while ((b2=fis2.read())!=-1){
            fos.write(b2);
        }
        fis2.close();
        fos.close();
    }
}
