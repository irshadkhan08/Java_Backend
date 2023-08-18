package org.javaOOPs2.polymorphism.runtime_poly;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Parent ref1 = new Child();
        Child child = (Child)ref1;
        child.method3();
    }
}
