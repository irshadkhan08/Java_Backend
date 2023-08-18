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
        };
        obj.getUpiBankName();
        System.out.println(obj.getUpiBankName());
        obj.getBank();
        System.out.println(obj.getBank());
    }
}
