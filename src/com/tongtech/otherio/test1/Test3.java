package com.tongtech.otherio.test1;

import java.io.*;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/9 15:41
 */
public class Test3 {
    /*
    * 需求：从键盘接收两个文件夹路径，把其中一个文件夹(包含内容)拷贝到另一个文件夹中
    *  把其中一个文件夹中(包含内容)拷贝到另一个文件夹中
    * 分析：
    *  1、在目标文件夹中创建原文件夹
    *  2、获取原文件夹中所有的文件和文件夹，储存在File数组中
    *  3、遍历数组
    *  4、如果是文件就用Io流读写
    *  5、如果是文件夹就递归调用
    * */
    public static void main(String[] args) throws IOException {
        File file1 = getFile();
        File file2 = getFile();
        if(file1.equals(file2)){
            System.out.println("目标文件夹是原文件夹的子文件");
        }else {
            getCopy(file1, file2);
        }
    }
    public static File getFile(){
        //创建一个使用Scanner类包装的键盘输入流
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true){
            String s = scanner.nextLine();
            File file = new File(s);
            if(!file.exists()){
                System.out.println("您输入的文件夹路径不存在，请您重新输入：");
            }else if(file.isFile()){
                System.out.println("你输入的是文件路径，请您输入文件夹路径：");
            }else {
                return file;
            }
        }
    }
    public static void getCopy(File source,File target) throws IOException {
        File newDir = new File(target, source.getName());
        //在目标文件夹中创建原文件夹
        newDir.mkdir();
        //获取原文件夹中的所有文件和文件夹，存储在File数组中
        File[] files = source.listFiles();
        for (File file:files){
            if(file.isFile()){
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
                BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(new File(newDir,file.getName())));
                int b;
                while ((b=bis.read())!=-1){
                    bos.write(b);
                }
                bis.close();
                bos.close();
            }else {
               getCopy(file,newDir);
            }
        }
    }
}
