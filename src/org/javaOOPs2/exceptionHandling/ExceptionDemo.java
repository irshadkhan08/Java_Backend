package org.javaOOPs2.exceptionHandling;
public class ExceptionDemo {

    public void test(int c){
        try{
            int a = 10;
            int d = a/c;
        }
        catch (Exception e){
//           e.printStackTrace();
            throw e;
        }
        finally {
            System.out.println("inside finally method...");
        }
    }
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.test(0);
        System.out.println("here");
    }
}
