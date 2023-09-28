package org.executorService7.future;

import org.executorService7.CallableTask;
import org.executorService7.ExecutorServiceDemo;

import java.util.ArrayList;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<Integer>obj1 = executorService.submit(task1);
        Future<Integer>obj2 = executorService.submit(task2);

        System.out.println(obj1.get()+obj2.get());



    }
}
