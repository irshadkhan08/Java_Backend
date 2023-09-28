package org.javaOOPs2.singleton;

public class Logging {
    public static Logging instance;
    //public static Logging instance = new Logging();-->// early Instantiation
//    private Logging(){
//
//    }
    public void info(String message){
        System.out.println(message);
    }
//    public static Logging getInstance(){// lazy instantiation
public static Logging method(){
        if(instance==null){
            instance = new Logging();
            return instance;
        }
        else{
            return instance;
        }
    }
}
