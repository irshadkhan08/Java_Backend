package org.stream5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//    int f = list.stream().reduce(1, new BinaryOperator<Integer>() {
//        @Override
//        public Integer apply(Integer integer, Integer integer2) {
//            return integer*integer2;
//        }
//    });
//        System.out.println(f);
   Optional<Integer> sum=  list.stream().filter(new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer%2==0;
        }
    }).map(new Function<Integer, Integer>() {

        @Override
        public Integer apply(Integer integer) {
            return integer*integer;
        }

//        @Override
//        public <V> Function<V, Object> compose(Function<? super V, ? extends Integer> before) {
//            return Function.super.compose(before);
//        }
//
//        @Override
//        public <V> Function<Integer, V> andThen(Function<? super Object, ? extends V> after) {
//            return Function.super.andThen(after);
//        }


    }).reduce(new BinaryOperator<Integer>() {
        @Override
        public Integer apply(Integer integer, Integer integer2) {
            return integer+integer2;
        }
    });
   System.out.println(sum);



   //lamda expression

        int ans =list.stream().filter(i->i%2==0).map(i->i*i).reduce(0,(i,j)->i+j);
        System.out.println("lamda sum : "+ans);

//        Optional<Integer> ans= list.stream().filter(i ->i%2==0).map(i-> i*i).reduce(0,(i, j) ->i+j).describeConstable();
//













        //list of integers - > filter out of even number square the even number return addition of that numbers
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> list = Arrays.asList(1);
//        int sum = 0;
//
//        for(int i = 0; i<list.size(); i++){
//            //filtering it is even
//            if(list.get(i)%2==0){
//                sum = sum+list.get(i)*list.get(i);
//            }
//        }
//        System.out.println("sum after it is iterative way : "+sum);


        //declarative way

//      int sum2 = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                System.out.println("i am inside the filter method");
//                return integer%2==0;
//            }
//        }).map(new Function<Integer, Integer>() {
//
//            @Override
//            public Integer apply(Integer integer) {
//                System.out.println("i am inside the map method");
//                return integer*integer;
//            }
//
//        }).reduce(0, new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println("i am inside the reduce method");
//                return integer+integer2;
//            }
//        });
//       //readability
//        System.out.println("after sum declarative way sum of even num :"+sum2);

//        Optional<Integer> sum2= list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                System.out.println("i am inside the filter method");
//                return integer%2==0;
//            }
//        }).map(new Function<Integer, Integer>() {
//
//            @Override
//            public Integer apply(Integer integer) {
//                System.out.println("i am inside the map method");
//                return integer*integer;
//            }
//
//        }).reduce( new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println("first number is "+integer+" "+"second number is "+integer2);
//                System.out.println("i am inside the reduce method");
//                return integer+integer2;
//            }
//        });
//        //readability
//        System.out.println("after sum declarative way sum of even num :"+sum2);

//       Optional<Integer> ans= list.stream().filter(i ->i%2==0).map(i-> i*i).reduce(0,(i, j) ->i+j).describeConstable();
//        System.out.println(");
    }
}
