package org.executorService7;

public class VolatileMemoryDemo implements Runnable{
     private volatile static int value = 0;
     private String type;
     int temp;

    public VolatileMemoryDemo(String type) {
        this.type = type;
    }

    @Override
    public void run() {

        if(type=="W"){
            while(value!=5){
                value++;
                System.out.println("Write Value : "+value);
                try{
                    Thread.sleep(100);
                }
                catch (Exception e){
                    throw new RuntimeException();
                }
            }
        }
        else{
         temp = 0;
            while(true) {
                if (temp != value) {
                    System.out.println("temp value               :" + temp);
                    System.out.println("Value                    : " + value);
                    temp = value;
                    System.out.println("Read  Value : " + value);
                }
            }
        }

        System.out.println(temp);
    }

}
