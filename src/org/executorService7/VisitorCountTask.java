package org.executorService7;

public class VisitorCountTask implements Runnable{
    private int visitorCount;
    public VisitorCountTask() {
        this.visitorCount = 0;
    }
    public int getVisitorCount() {
        return visitorCount;
    }
    @Override
    public void run() {
        visitorCount++;
    }
}
