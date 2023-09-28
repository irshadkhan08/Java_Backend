package org.javaOOPs2.exceptionHandling;

public class ExceptionDemo1 {
    public static void method1()throws Exception{
        throw new Exception("Artihmetic");
    }
    public static void method2(){

    }

    public static void main(String[] args) throws Exception {
            method1();
    }
}

//

//1.throws ya try catch ke bina throw ko use nhi kar sakte
//2.ager throw execption hoga to throws ya try catch use kerna hi pedega
//3.jab RuntimeException ko throw karte hai to throws ya try-catch ki need nhi pedhti
