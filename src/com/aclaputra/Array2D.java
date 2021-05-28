package com.aclaputra;

public class Array2D {
    public static void main(String[] args) {

        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Convertte";
        cars[0][2] = "Avanza";
        cars[1][0] = "Mustang";
        cars[1][1] = "Ferrari";
        cars[1][2] = "Mercedes-benz";
        cars[2][0] = "Hyundai";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "Tesla";

        for(int i = 0 ; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }

        }


    }
}
