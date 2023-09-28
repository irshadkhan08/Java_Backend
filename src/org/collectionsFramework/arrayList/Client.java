package org.collectionsFramework.arrayList;

import org.collectionsFramework.List1;

public class Client {
    public static void main(String[] args) {
        List1 ref = new ArrayList1();
        ref.addMethod("books");
        ref.addMethod("pen");
        ref.addMethod("pencil");
        ref.addMethod("sharpner");
        ref.addMethod("books");

        System.out.println(ref.getMathod());
        //    System.out.println(ref.getMathod());
        System.out.println(ref.getAll());
    }
}
