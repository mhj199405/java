package com.tongtech.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/3 17:31
 */
public class Demo7_TryFinally {
    public static void main(String[] args) throws IOException {
        //demo1();
        try(FileInputStream fis = new FileInputStream("mhj.txt");
            FileOutputStream fos = new FileOutputStream("mmmmm.txt");
           // Myclosed/ myclosed = new Myclosed(); //1.7jdk支持
             ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
    }
    public static void demo1() throws IOException {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try {
            fis= new FileInputStream("mhj.txt");
            fos= new FileOutputStream("mhl.txt");
            new Myclosed();
            int length;
            while ((length =fis.read())!=-1){
                fos.write(length);
            }
        }finally {
            if(fis!=null){
                try{
                    fis.close();
                }
                finally {  //try finally的嵌套的目的是能关一个就关一个
                    if(fos!=null){
                        fos.close();
                    }
                }
            }
        }
    }
}
class Myclosed implements AutoCloseable{
   public void close(){
       System.out.println("我关闭了");
   }
}