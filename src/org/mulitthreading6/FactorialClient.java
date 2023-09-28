package org.mulitthreading6;

import java.util.ArrayList;
import java.util.Arrays;

public class FactorialClient {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        ArrayList<Thread>list = new ArrayList<>();
        Arrays.stream(arr).parallel().forEach(i->
        {
            FactorialMT factorialMT = new FactorialMT(i);
            Thread thread = new Thread(factorialMT);
            thread.start();
            try {
                thread.join();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            list.add(thread);
        });

//        System.out.println(list);
        System.out.println(Thread.currentThread());
       list.stream().forEach(i->{
           try {
               i.join();
           }
           catch (InterruptedException e){
               new RuntimeException(e);
           }
       });

    }
}
