package org.javaOOPs2.exceptionHandling;

import java.io.Closeable;
import java.io.IOException;

public class CloseableDemo implements Closeable {
    @Override
    public void close()throws IOException {
        System.out.println("print inside close method");
    }
    public void printData(){
        System.out.println("print some data");
    }
    public static void main(String[] args){

        try( CloseableDemo obj = new CloseableDemo()){
            obj.printData();
        }
        catch (IOException e){

        }
    }
}
