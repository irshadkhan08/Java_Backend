package org.executorService7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class VisitorDemo {
    public static void main(String[] args) throws InterruptedException {

//
//        VisitorCountTask visitorCountTask = new VisitorCountTask();
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//
//        for(int i = 0; i<20000; i++){
//            executorService.submit(visitorCountTask);
//        }
//
//        executorService.awaitTermination(1, TimeUnit.MINUTES);
//        System.out.println("Total no of visitor inside the partyhall is :"+ visitorCountTask.getVisitorCount());


        visitorSynchronous visitor= new visitorSynchronous(2);
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for(int i = 0; i<20000; i++){
            executorService.submit(visitor);
        }
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Total no of visitor inside the partyhall is :"+ visitor.getVisitor());

    }
}
