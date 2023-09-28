package org.javaOOPs2.abstraction.abstractDemo;

 abstract class AbstractClassDemo {
     AbstractClassDemo(){
         System.out.println("Base abstract class");
     }
     abstract void abstractMethod();


     //non_abstract method can be  public private protected with body implementation in the abstract class
     public void non_abstractMethod(){
        System.out.println("I am non abstract method");
    }
}

//before java8
// interface : --> we could not provide inside any method
//abstract : --> we could provide body

//after java8
//interface : --> static and default method