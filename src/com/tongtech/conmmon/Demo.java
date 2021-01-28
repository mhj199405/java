package com.tongtech.conmmon;

/**
 * @author M.hj
 * @version 1.0
 * @date 2020/10/20 10:14
 */
public class Demo {
    public static void main(String[] args) {
        /**
         * 打印所有的水仙花数
         */
        System.out.println("100~1000的所有水仙花数");
        for (int i=100;i<1000;i++){
            int ge=i%10;
            int shi=i/10%10;
            int bai=i/10/10%10;

            if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                System.out.println(+i);
            }

        }
    }
}
