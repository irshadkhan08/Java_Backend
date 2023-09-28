package org.javaOOPs2.exceptionHandling;

public class CustomExceptionDemo {
    public static void valid(int age){
        if(age>=10){
            System.out.println("age is valid");
        }
        else{

            throw new CustomException("age is not valid");
//            System.out.println(new CustomException("age is not valid"));
        }
    }
    public static void main(String[] args)
        {

            valid(12);
        }
}
