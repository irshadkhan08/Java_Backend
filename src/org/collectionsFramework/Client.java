package org.collectionsFramework;

public class Client {
    public static void main(String[] args) {
//        List1 ref = new ArrayList1();
//        List1 ref = new Set1();
        List1 ref= new MapExample();
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
