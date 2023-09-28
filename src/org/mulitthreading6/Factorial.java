package org.mulitthreading6;

import java.math.BigInteger;
import java.util.Arrays;

public class Factorial {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Integer arr[] = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println("firstTime output "+startTime);
//        Integer arr2[] = new Integer[]{10000,20000,30000,40000,50000,60000,70000,80000,90000,100000};

        Arrays.stream(arr).map(i->getFact(i)).forEach(i-> System.out.println(i));
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken :"+(endTime-startTime));
        System.out.println("endTime output "+endTime);
    }
    public static BigInteger getFact(int num){
        BigInteger res = BigInteger.ONE;
        for(int i = 2; i<=num; i++){
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }

}
