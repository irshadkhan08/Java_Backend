package org.fileStream6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main  {
    public static void main(String[] args) throws Exception {
        Person obj = new Person("anil",22);
        //writeObjectTofile(obj);
        readObjectFromFile();

    }
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/home/irshad/Desktop/JBDL/demo.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        System.out.println(objectInputStream.readObject());
    }
    public static void writeObjectTofile(Person obj)throws Exception{
        FileOutputStream fileOutputStream = new FileOutputStream("/home/irshad/Desktop/JBDL/demo.txt");
        String country = "India";

//        fileOutputStream.write(country.getBytes(StandardCharsets.UTF_8));
//        ObjectOutputStream obj1 = new ObjectOutputStream(fileOutputStream );
////        obj1.write(country.getBytes());
//       // System.out.println(obj1);
//        obj1.writeObject(obj);
    }
}
