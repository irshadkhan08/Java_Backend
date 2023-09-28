package org.executorService7;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
       // ExecutorServiceDemo executorServiceDemo = new ExecutorServiceDemo();
        Task task1 = new Task();
        int corePoolSize = 1;
        int maxPoolSize = 10;

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(corePoolSize,maxPoolSize,
                10L, TimeUnit.SECONDS,new LinkedBlockingQueue<>());
//        long start = System.currentTimeMillis();
        long start = System.currentTimeMillis();

        for (int i = 0; i<20; i++){
            threadPoolExecutor.submit(task1);
        }
        long end = System.currentTimeMillis();


//        System.out.println(end-start);
//        System.out.println("i am the out of loop with the thread name "+Thread.currentThread().getName());
        threadPoolExecutor.shutdown();
//        threadPoolExecutor.shutdownNow();
//        threadPoolExecutor.submit(task1);

        threadPoolExecutor.awaitTermination(500,TimeUnit.MICROSECONDS);
//        System.out.println(TimeUnit.MILLISECONDS);
        System.out.println("Done");

        System.out.println("Yes");

    }
}
