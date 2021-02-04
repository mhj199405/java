package com.tongtech.wrapclass;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/13 15:26
 */
public class Demo3_Integer {
    /*
    * 基本数据类型包装类有八种，其中其中都有parseXXX方法，可以将七种的字符串表现形式转换成基本数据类型
    *
    * */
    public static void main(String[] args) {
       //demo();
       String s="true";
        boolean b = Boolean.parseBoolean(s);
        System.out.println(b);
         String s2="abc";
//        Character.parseChar(s2); //char的包装类型Character中没有parseCharacter这个方法
                                   // 字符串到字符的转换通过toCharArray()就可以把字符串转化为字符数组

    }
    public static  void demo(){
        //  int------->String  int转换为String
        int i=100;
        String s=i+"";  //给整数添加一个""之后便可转换成String；推荐使用
        System.out.println(s);

        String s1=String.valueOf(i); // 使用String的静态方法valueOf可以将整数转换为String类型；推荐使用
        System.out.println(s1);

        Integer s2 = new Integer(i);  //先是把整数类型转换为包装类型，再调用Integer的toString方法将包装类型转换为String类型
        System.out.println(s2.toString());

        String s3 = Integer.toString(i);//把整数当做直接当做参数
        System.out.println(s3);
        System.out.println("------------------------------------");
        // String---Integer-->int  String转换为int
        String s4="100";
        Integer s5 = new Integer(s4); //显示将String转化为Integer，再调用intValue()方法转换为int类型
        int j = s5.intValue();
        System.out.println(j);
        //String--->int
        int jj = Integer.parseInt(s4); // 调用Integer类的parseInt方法将数字字符串转化为int类型
        System.out.println(jj);
    }
}
