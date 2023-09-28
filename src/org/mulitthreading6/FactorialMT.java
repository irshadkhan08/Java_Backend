package org.mulitthreading6;

import java.math.BigInteger;
public class FactorialMT implements Runnable{
    int num;
    FactorialMT(int num){
        this.num=num;
    }
    @Override
    public void run() {
        BigInteger res = getFact(num);
        System.out.println("for num "+this.num +"Thread-name : "+res);
    }

    public BigInteger getFact(int num){
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i<=num; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
