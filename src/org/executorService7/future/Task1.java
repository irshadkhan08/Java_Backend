package org.executorService7.future;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class Task1 implements Callable {
    @Override
    public Object call() throws Exception {
        return 1234;
    }

}
