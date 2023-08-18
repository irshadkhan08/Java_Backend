package org.javaOOPs2.abstraction;

public class SbiBank implements Bank {
    public SbiBank() {
    }

    public String getBankName() {
        return "SbiBank";
    }

    public String getUpiBankName() {
        return "SBI_UPI";
    }

    public String getBank() {
        return Bank.super.getBank();
        //return "Hello";
    }
}
