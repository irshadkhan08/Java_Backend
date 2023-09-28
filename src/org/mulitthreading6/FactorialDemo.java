package org.mulitthreading6;

import java.math.BigInteger;

public class FactorialDemo implements Runnable{
    int num;
    FactorialDemo(){
        this.num = num;
    }
    @Override
    public void run() {
        BigInteger res = getFact();
        System.out.println(this.num +" "+Thread.currentThread().getName());
    }

    public BigInteger getFact(){
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i<=num; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
