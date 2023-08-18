package org.javaOOPs2.encapsulation;

public class EncapsulationDemo {
    private EncapsulationDemo() {
    }

    public static EncapsulationDemo sum() {
        System.out.println("this is protected method");
        return new EncapsulationDemo();
    }
}

