package com.bnmit;

public class App {

    // ✅ THIS METHOD WAS MISSING
    public static int findGreatest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(findGreatest(5, 9, 3));
    }
}