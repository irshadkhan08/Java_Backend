package org.stream5;

public class Main {
    public static void main(String[] args) {
//        FunctionalInterfaceExample functionalInterfaceExample = new FunctionalInterfaceExample() {
//            @Override
//            public int sum(int a, int b) {
//               return a+b;
//            }
//        };
//        System.out.println(functionalInterfaceExample.sum(2,3));

        //java provides the same another way write the same thing using lambda expression
        FunctionalInterfaceExample functionalInterfaceExample = (int a,int b)-> {
            //System.out.println("i am inside the body");
            return a+b;
        };
        functionalInterfaceExample.sum(4,5);
        System.out.println(functionalInterfaceExample.sum(4,5));
    }
}
