package org.mulitthreading6;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
//
//        Task2 task = new Task2();
//        Thread thread = new Thread(task);
//        thread.start();
//        System.out.println(Thread.currentThread());
//

        Task task = new Task();
        task.run();
        System.out.println("i am inside the main class "+Thread.currentThread());



    }
}
