package org.stream5;
@FunctionalInterface
public interface FunctionalInterfaceExample {
     //It is abstract method
    //functional interface is only one abstract method it called functional interface
    int sum(int a, int b);
     default int add(int a,int b,int c){
         return a+b+c;
     };
}
