package org.javaOOPs2.exceptionHandling;

public class CustomException extends RuntimeException {
    public CustomException(String msg){
        System.out.println(msg);
       // throw new Exception()
//        return msg;
    }

}
