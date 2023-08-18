package org.javaOOPs2.inheritance.has_a_relation;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Address obj = new Address("Jaipur", "103141");
        new Student("Irshad", obj);
    }
}

