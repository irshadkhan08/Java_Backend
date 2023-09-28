package org.mulitthreading6;

import java.math.BigInteger;
import java.util.Arrays;

public class Fact {
    public static void main(String[] args) {


        Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long startTime = System.currentTimeMillis();
        Arrays.stream(arr).map(i->getFact(i)).forEach(i-> System.out.println(i));

        long endTime = System.currentTimeMillis();

        System.out.println("endTime "+(endTime-startTime));
    }
    public static BigInteger getFact(int num){
        BigInteger res = BigInteger.ONE;

        for(int i = 2; i<=num; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

}
