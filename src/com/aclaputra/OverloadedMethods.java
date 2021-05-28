package com.aclaputra;

public class OverloadedMethods {
    public static void main(String[] args) {
        int x = add(1,2);
        int y = add(1,2, 7);
        int z = add(1,2, 7, 5);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public static int add(int a, int b) {
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    public static int add(int a, int b, int c) {
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    public static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
}
