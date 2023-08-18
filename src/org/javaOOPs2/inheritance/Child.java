package org.javaOOPs2.inheritance;

public class Child extends Parent {
    int sum = 0;

    public Child() {
        System.out.println("i am constructor of child class");
    }

    public void getSum() {
        System.out.println(super.sum);
        System.out.println(this.sum);
    }
}
