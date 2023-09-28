package org.javaOOPs2.abstraction.abstractDemo;

public abstract class AbstractDemo extends Object{// this abstract class can extends Object class
    public void print(){
        System.out.println("This is concrete method");
    }
    //this is abstraction
    //hiding the internal complexities this is abstraction
    public abstract void printData();
    public abstract int sum(int a,int b);//---> this is prototype declaration

}

