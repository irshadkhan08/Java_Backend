package org.javaOOPs2.abstraction.abstractDemo;

public class AbstractMainClass extends AbstractClassDemo{

//    public void non_abstractMethod() {
//        super.non_abstractMethod();
//    }

    @Override
    void abstractMethod() {
        System.out.println("I am abstract method...");
    }

    public static void main(String[] args) {
        AbstractClassDemo obj = new AbstractMainClass();
        obj.abstractMethod();

    }
}
