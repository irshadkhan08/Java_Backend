package org.javaOOPs2.abstraction;

public class HdfcBank implements Bank {
    public HdfcBank() {

    }

//    public String getBankName() {
//        return "hdfc bank";
//    }
public String getBankName() {

        return String.valueOf(BankEnum.ICICI.ordinal());
}
public String test(){
        return BankEnum.ICICI.getName();
}

    public String getUpiBankName() {
        return "HDFC_UPI";
    }

    public String getBank() {
        return "Hdfc bank ";
    }
}
