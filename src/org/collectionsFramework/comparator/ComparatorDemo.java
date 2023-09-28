package org.collectionsFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("irshad",22,1515));
        al.add(new Student("harpreet",21,15125));
        al.add(new Student("arbaz",24,5525));

        System.out.println("Age wise sorting comparator");
        Collections.sort(al, new AgeComparator());

        for(Student st1 : al){
            System.out.println(st1.name+" "+st1.age+" "+st1.roll_no);
        }

        System.out.println("name wise sorting comparator");
        Collections.sort(al, new NameComparator());
        for(Student st2 : al){
            System.out.println(st2.name+" "+st2.age+" "+st2.roll_no);
        }
    }

}
