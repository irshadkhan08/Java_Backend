package org.executorService7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileClient {
    public static void main(String[] args) {
        VolatileMemoryDemo volatileMemoryDemo1 = new VolatileMemoryDemo("R");
        VolatileMemoryDemo volatileMemoryDemo = new VolatileMemoryDemo("W");

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(volatileMemoryDemo1);
        executorService.submit(volatileMemoryDemo);


    }
}
