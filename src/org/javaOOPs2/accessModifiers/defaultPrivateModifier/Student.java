package org.javaOOPs2.accessModifiers.defaultPrivateModifier;

class Student {
    String name = "Irshad";
    int rollNo = 123;

    Student() {
    }

    private void detailDisplay() {
        System.out.println(this.name + " ");
        System.out.println(this.rollNo + " ");
    }
}
