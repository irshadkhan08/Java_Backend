package org.javaOOPs2.abstraction;

public interface Bank {
    int a = 10;
    String getBankName();

    String getUpiBankName();
    String test();
    default String getBank() {
        return "It is inside the default method example";
    }

    static String StaticExample() {
        return "It is inside the static method example";
    }

    public interface NetBanking{

    }
}