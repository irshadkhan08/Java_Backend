package org.javaOOPs2.EqualsHash;

class Student extends Exception {
  private String name;
  private Integer age;
  public Student(String name, Integer age) {
   this.name = name;
   this.age = age;
  }
  @Override
  public boolean equals(Object obj){
      return true;
//   if(obj==this){
//    return true;
//   }
//   if(!(obj instanceof Student)){
//    return false;
//   }
//   Student s = (Student) obj;
//   if(s.name==this.name && s.age==this.age){
//       return true;
//   }

  }

  public static void main(String[] args) {
   Student student1 = new Student("Irshad",22);
   Student student2 = new Student("Irshad",22);
   Student student3 = new Student("Sakir",280);
//   System.out.println(student1.equals(student1));
//   System.out.println(student1==student1);
//   System.out.println(student1.equals(student2));
//   System.out.println(student1==student2);
//   System.out.println(student1.equals(student3));

//   System.out.println(student1.equals(student1));
   Demo demo = new Demo();
   System.out.println(student1.equals(student3));

  }
 }
