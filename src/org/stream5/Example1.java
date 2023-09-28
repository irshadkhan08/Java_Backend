package org.stream5;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {

        List<String>list = Arrays.asList("aa","irshadKhan","abcdefghia","bcdeghhijakmb");
      List<String>ans =  list.stream().map(x->x.length()>10 ? x.substring(0,10):x).filter(x->x.charAt(0)==x.charAt(x.length()-1)).toList();
      System.out.println(ans);

    }
}
