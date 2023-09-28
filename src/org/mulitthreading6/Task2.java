package org.mulitthreading6;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Task2 implements Runnable{
    @Override
    public void run() {
        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("i am inside the runnable interface "+currentThread());
    }
}
