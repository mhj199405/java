package com.tongtech.chario;

import java.io.*;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/5 16:54
 */
public class Demo7_TransIO {
    public static void main(String[] args) throws IOException {
      //demo1();
      // demo2();
        BufferedReader br =   //更加高效的读
                new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8"));
        BufferedWriter bw =  //更加高效的写
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk"));
        int i;
        while ((i=br.read())!=-1){
            bw.write(i);
        }
        br.close();
        bw.close();
    }
    public static void demo2() throws IOException{
        InputStreamReader isr =
                new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");//指定码表读字符
        OutputStreamWriter osw
                = new OutputStreamWriter(new FileOutputStream("gbk.txt"), "gbk");//指定码表写字符
        int b;
        while ((b=isr.read())!=-1){
            osw.write(b);
        }
        isr.close();
        osw.close();
    }
    public static void demo1() throws IOException{
         /* File file = new File("utf-8.txt");
        File file1 = new File("gbk.txt");
        file.createNewFile();
        file1.createNewFile();*/
        //用默认编码表读、写，出现乱码
        FileReader fr = new FileReader("utf-8.txt");
        FileWriter fw=new FileWriter("gbk.txt");
        int b;
        while ((b=fr.read())!=-1){
            fw.write(b);
        }
        fr.close();
        fw.close();
    }
}
