package com.tongtech.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 18:27
 */
public class Demo5_FileMethod {
    /*
    * A:获取功能
    *   public String getAbsolutePath():获取绝对路径
    *   public String getPath():获取路径
    *   public String getName():获取名称
    *   public long length():获取长度，字节数
    *   public long lastModified()：获取最后一次修改时间，毫秒值
    *   public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
    *   public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
    * */
    public static void main(String[] args) {
     //demo1();
        File b = new File("F:/workspaceforidea/java");
        String[] list = b.list(); //仅获取文件名称
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("---------------------");
        File[] files = b.listFiles(); //获取文件对象
        for (File s:files){
            System.out.println(s);
        }

    }
    public static void demo1(){
        File file = new File("m.txt");
        File file1 = new File("F:\\workspaceforidea\\java\\m.txt");
        System.out.println(file.getAbsoluteFile());//获取绝对路径
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file.getPath());//获取绝对路径(获取构造方法中的传入路径)
        System.out.println(file.getName());
        System.out.println(file1.getName());
        System.out.println(file.length());
        long l = file.lastModified();  // 文件的最后修改时间
        Date date = new Date(l);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }
}
