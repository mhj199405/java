package com.tongtech.exception;

/**
 * @author M.hj
 * @version 1.0
 * @date 2021/1/29 20:06
 */
public class Demo8_Exception {
    public static void main(String[] args) {

    }
}
class AgeOUtOfBoundsException extends  Exception{
    public AgeOUtOfBoundsException(String message) {
        super(message);
    }

    public AgeOUtOfBoundsException() {
        super();
    }
}
