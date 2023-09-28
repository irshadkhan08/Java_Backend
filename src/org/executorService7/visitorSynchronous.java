package org.executorService7;

public class visitorSynchronous implements Runnable {
    private int visitor;
    public visitorSynchronous(int visitor) {
        this.visitor = visitor;
    }

    public int getVisitor() {
        return visitor;
    }
    @Override
    public void run() {
        getAndAdd();
    }
    public synchronized void getAndAdd(){
        visitor++;
    }
}
