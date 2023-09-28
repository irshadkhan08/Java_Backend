package org.executorService7.future;

import org.executorService7.CallableTask;

import java.util.concurrent.Callable;

public class Task2 implements Callable {
    @Override
    public Object call() throws Exception {
        return 200;
    }

}
