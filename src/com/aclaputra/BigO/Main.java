package com.aclaputra.BigO;

public class Main {
    public static void main(String[] args) {
        /**
         * Fastest to Slowest in Time / Performance of algorithm
         * ====================================================
         * O(1) = constant time
         *      - random access of an element in an array
         *      - inserting at the beginning of linkedlist
         *
         * O(log n) = logarithmic time
         *      - binary search
         *
         * O(n) = linear time
         *      - looping through elements in an array
         *      - searching through a linkedlist
         * O(n log n) = quasilinear time
         *      - quick sort
         *      - merge sort
         *      - heap sort
         * O(n^2) = quadratic time
         *      - insertion sort
         *      - selection sort
         *      - bubble sort
         * O(n!) = factorial time
         *      - travelling Salesman Problem
         * ====================================================
         *
         * O(n) linear time
         * n = 1000000
         * ~1000000 steps
         */
//        int addUp(int n) {
//            for(int i = 0; i <= n; i++) {
//                 sum += i;
//            }
//            return sum;
//        }

        /**
         * O(1) constant time
         * n = 1000000
         * more simple
         * ~3 steps
         */
//        int addUp(int n) {
//            int sum = n * (n + 1) / 2;
//            return sum;
//        }
    }
}
