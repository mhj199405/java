package com.tongtech.file;

import java.io.File;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/1 13:05
 */
public class Demo3_FileMethod {
    /*
    * A:重命名和删除功能
    *    public boolean renameTo(File dest):把文件重命名为指定的文件路径
    *    public boolean delete():删除文件或者文件夹
    * B:重命名注意事项
    *     如果路径名相同，那就是改名
    *     如果路径名不同，就是改名并剪切
    * C:删除注意事项
    *     Java中的删除不走回收站
    *     要删除一个文件夹，请注意改文件夹内不能包含文件或者文件夹
    *
    * */
    public static void main(String[] args) {
      //demo1();
      /*  File file = new File("m.txt");
        boolean b = file.delete();
        System.out.println(b);*/
       /* File file1 = new File("bbb.txt");
        boolean b1 = file1.delete();
        System.out.println(b1);*/
        File b = new File("b\\c\\a");
        boolean delete = b.delete();
        System.out.println(delete);
    }
    public static void demo1(){
        File file1 = new File("b.txt");
        File file2 = new File("G:\\a.txt");
        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }
}
