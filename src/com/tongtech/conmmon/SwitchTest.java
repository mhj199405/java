package com.tongtech.conmmon;


/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/23 10:10
 */
public class SwitchTest {
    public static void main(String[] args) {

        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
