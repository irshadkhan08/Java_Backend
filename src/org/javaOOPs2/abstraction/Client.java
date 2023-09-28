package org.javaOOPs2.abstraction;

public class Client {
    public Client() {
    }

    public static void main(String[] args) {
        Bank obj = new Bank() {
            public String getBankName() {
                return "anonymous name";
            }

            public String getUpiBankName() {
                return "anonymous bank name";
            }
            public String test(){
                return null;
            }
        };
        System.out.println(obj.getBank());
        Bank obj1 = new HdfcBank();
        obj1.getBank();
        System.out.printf(obj1.getBank());
//        obj.getUpiBankName();
//        System.out.println(obj.getUpiBankName());
//        obj.getBank();
//        System.out.println(obj.getBank());
//          Bank bank = new HdfcBank();
//        System.out.println(bank.getBankName());
//          bank.test();
//          System.out.println(bank.test());
//        System.out.println(BankEnum.values().length);
//        System.out.println(BankEnum.valueOf("HDFC"));

//        BankEnum.HDFC.getVal();
//        System.out.println(BankEnum.HDFC.getVal());



//        OuterClassDemo demo = new  OuterClassDemo();
//
//        OuterClassDemo.InnerClass ref = demo.new InnerClass();

//        OuterClassDemo obj1 = new OuterClassDemo();
//        OuterClassDemo.InnerClass obj2 = obj1.new InnerClass();
//        System.out.println(obj2.data);
//        System.out.println(OuterClassDemo.InnerClass.data);

    }
}
