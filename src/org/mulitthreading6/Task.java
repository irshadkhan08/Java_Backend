package org.mulitthreading6;

public class Task extends Thread{
    @Override
    public void run() {
//        super.run();
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("i am run method of thread class "+currentThread());
    }
}
