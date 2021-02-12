package com.tongtech.otherio.test1;

import java.io.File;
import java.util.Scanner;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/2/12 0:17
 */
public class Test4 {
    public static void main(String[] args) {
        File file = getFile(); //获取文件夹路径
         printLev(file,0);
    }
    public static void printLev(File file,int len){
        //把文件夹中的所有文件以及文件夹的名字按层级打印
        File[] files = file.listFiles();
        for (File file1:files){
            for(int i=0;i<=len;i++){
                System.out.print("\t");
            }
            //无论是文件还是文件夹都都需哟啊直接打印
            System.out.println(file1);
            //如果是文件夹就递归调用
            if(file1.isDirectory()){
                printLev(file1,len+1);
            }
        }
    }
    public static File getFile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true){
            String s = scanner.nextLine();
            File file = new File(s);
            if(!file.exists()){
                System.out.println("您输入的文件夹路径不存在，请您重新输入文件夹路径");
            }else if(file.isFile()){
                System.out.println("您输入的是文件路径，请您输入文件夹路径");
            }else {
                return file;
            }
        }
    }
}
