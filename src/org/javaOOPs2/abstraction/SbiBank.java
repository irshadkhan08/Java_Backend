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
    public String test(){
        return "test";
    }
}


//class A extend class B
//interface A implements interface B

//enum: --> constants we are using during the whole implementation

//jbdl57 status  -> upcoming ,live,running,archived