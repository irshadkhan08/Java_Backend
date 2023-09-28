package org.javaOOPs2.abstraction;

public enum BankEnum {
    // shorter database  which in inside your code base
    HDFC("hdfc",101,true),ICICI("icici",102, true);//we are creating objects of enum class
    private String val;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    private int id;
    private boolean isActive;
    BankEnum(String val, int id, boolean isActive){
        this.val = val;
        this.id = id;
        this.isActive=isActive;
    }
    public String getName() {
        return val;
    }
    public void setName(String name) {
        this.val = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
//    HDFC,ICICI
//    BankEnum(){}

}
//enum -->enum constructor is always private

//internally working
//public BankEnum extends Enum

