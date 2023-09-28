package org.executorService7;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public Integer call() throws Exception {
         return 123;
    }
}
