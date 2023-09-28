package org.topFiveRecord;

public class Client {
    public static void main(String[] args) {

        InterfaceDemo ref = new ListMap();
        ref.addKey("pen");
        ref.addKey("pen");
        ref.addKey("pencil");
        ref.addKey("pencil");
        ref.addKey("book");
        ref.addKey("book");
        ref.addKey("colour");
        ref.addKey("colour");
        ref.addKey("copy");
        ref.addKey("copy");
        ref.addKey("register");
        ref.addKey("earser");

        System.out.println(ref.returnlist());
    }
}
