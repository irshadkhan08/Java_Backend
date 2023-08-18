package org.javaOOPs2.abstraction;

public class HdfcBank implements Bank {
    public HdfcBank() {
    }

    public String getBankName() {
        return "hdfc bank";
    }

    public String getUpiBankName() {
        return "HDFC_UPI";
    }

    public String getBank() {
        return "Hdfc bank ";
    }
}
