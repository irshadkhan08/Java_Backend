package org.executorService7;

public class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hey from thread "+ Thread.currentThread().getName());
    }
}
