package org.executorService7;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        Task task = new Task();
        //Example1
//        ExecutorService a = Executors.newFixedThreadPool(4);
//        for(int i = 0; i<20; i++){
//            a.submit(task);
//        }
//       //Example2
        // 1- 10 tak thread ban jay_ga
        //jitni baar loop chalega utni thread ban jey_egi
//        ExecutorService b = Executors.newCachedThreadPool();
//        for(int i = 0; i<10; i++){
//            b.submit(task);
//        }

         //Example3
         //ye only 1 banata hai
//        ExecutorService c = Executors.newSingleThreadExecutor();
//        for(int i = 0; i<20; i++){
//            c.submit(task);
//        }


        //Example4
        //delay time means 10 after 10 seconds crate a newThread
        ScheduledExecutorService d = new ScheduledThreadPoolExecutor(1);
        d.schedule(task,10, TimeUnit.SECONDS);
        for(int i = 0; i<5; i++){
            d.submit(task);
        }


    }
}
