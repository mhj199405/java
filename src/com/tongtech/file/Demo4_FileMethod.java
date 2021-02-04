package com.tongtech.file;

import java.io.File;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 16:09
 */
public class Demo4_FileMethod {
    /*
    * A:判断功能
    *   public boolean isDirectory():判断是否是目录
    *   public boolean isFile():判断是否是文件
    *   public boolean exists():判断是否存在
    *   public boolean canRead():判断是否可读
    *   public boolean canWrite():判断是否可写
    *   public boolean isHidden():判断是否隐藏
    * */
    public static void main(String[] args) {
        File fiel = new File("ccc");
        boolean file = fiel.isFile();
        System.out.println(file);
        System.out.println(fiel.exists());
        System.out.println(fiel.isDirectory());
        System.out.println(fiel.canRead()); //windows系统下认为所有文件都是可读的
        System.out.println(fiel.canWrite());
        System.out.println(fiel.isHidden());
        File file1 = new File("m.txt");
        System.out.println(file1.isHidden());
    }
}
