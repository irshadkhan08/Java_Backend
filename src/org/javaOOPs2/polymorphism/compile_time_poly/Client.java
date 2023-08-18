package org.javaOOPs2.polymorphism.compile_time_poly;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        CompileTimePoly ref = new CompileTimePoly();
        ref.sum(1, 2);
        ref.sum(2, 3, 8);
        ref.sum(2, 3, 5);
        System.out.println(ref.sum(2, 3, 8));
        System.out.println(ref.sum(2, 3, 4));
    }
}
