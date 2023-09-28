package org.executorService7;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;
public class CallableClient {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTask callableTask = new CallableTask();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Future<Integer>>res = new ArrayList<>();

        for(int i = 0; i<20; i++){
            res.add(executorService.submit(callableTask));
        }

        System.out.println("Here...");

        for(Future<Integer>f : res){
            System.out.println(f);
        }
        System.out.println("Here...");
    }
}
