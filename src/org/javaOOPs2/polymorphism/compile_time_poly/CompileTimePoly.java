package org.javaOOPs2.polymorphism.compile_time_poly;

public class CompileTimePoly {
    public CompileTimePoly() {
    }

    public double sum(int a, int b, int c) {
        return (double)(a + b + c);
    }

    public double sum(int a, int b, double c) {
        return (double)(1 + a + b) + c;
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
