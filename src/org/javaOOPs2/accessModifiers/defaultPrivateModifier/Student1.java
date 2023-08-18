package org.javaOOPs2.accessModifiers.defaultPrivateModifier;

class Student1 {
    String name;
    int rollNo;
    String mob;

    Student1() {
    }

    void settingDetails() {
        this.name = "irshad";
        this.rollNo = 245;
        this.mob = "552626515";
    }

    void disPlayStudentDetails() {
        System.out.println("This is default Access Modifier");
        System.out.println("name " + this.name);
        System.out.println("roll no " + this.rollNo);
        System.out.println("mob " + this.mob);
    }
}
