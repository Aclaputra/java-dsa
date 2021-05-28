package com.aclaputra;

public class Return {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(add(x,y));
    }
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
