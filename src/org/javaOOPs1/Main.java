//package org.javaOOPs1;
//
//public class Main {
//}
package org.javaOOPs1;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String s1 = null;
        String s2 = null;
        System.out.println(((String)s1).contains((CharSequence)s2));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = sum + a + b;
        return sum;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int v = var2[var4];
            sum += v;
        }

        return sum;
    }
}

