package com.example.arrays;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "Raisul";
        students[1] = "Rahim";
        students[2] = "Karim";
        students[3] = "Rafiq";
        students[4] = "Sarah";
//        System.out.println(students[2]);

        String[] employes = {"A", "B", "C"};
        int[] number = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < 6; i++) {   //when array size is fixed;
            System.out.println(number[i]);
        }

        int[] number1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < number1.length; i++) {    //if we don't know te size of array
            System.out.println(number1[i]);



        }
    }
}
