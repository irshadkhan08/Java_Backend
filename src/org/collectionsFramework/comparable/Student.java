package org.collectionsFramework.comparable;

class Student implements Comparable<Student>{
    String name;
    int age;
    int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    @Override
    public int compareTo(Student o) {
        if(this.age>o.age){
            return 1;
        }
        else if(this.age<o.age){
            return -1;
        }
        else {
            return 0;
        }
    }

    public static boolean main(String[] args) {
        Student obj1 = new Student("irshad",22,1515);
        Student obj2 =  new Student("harpreet",21,15125);
        Student obj3 = new Student("arbaz",21,5525);

        System.out.println(obj1.compareTo(obj2));
        System.out.println(obj2.compareTo(obj3));
        System.out.println(obj3.compareTo(obj1));
//        ArrayList<Student>al = new ArrayList<Student>();
//        al.add(new Student("irshad",22,1515));
//        al.add(new Student("harpreet",21,15125));
//        al.add(new Student("arbaz",24,5525));
//
////        Collections.sort(al);
//
//        for(Student st :al){
//            System.out.println(st.name +" "+st.age+" "+st.rollNo);
//        }

        return false;
    }
}
