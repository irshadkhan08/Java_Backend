package org.javaOOPs2.abstraction.abstractDemo;

public class InnerInterfaceDemo {

    public interface innerInterface{
     void printData();
    }
}
class Implement implements InnerInterfaceDemo.innerInterface{
    public void printData(){
        System.out.println("Hello this is inner interface");
    }
}
