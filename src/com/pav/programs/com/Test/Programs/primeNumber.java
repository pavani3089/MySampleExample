package com.pav.programs.com.Test.Programs;

/**
 * Created by pavani on 6/23/17.
 */
public class primeNumber {
    public static void main(String[] args) {
        int a=67;
        int flag = 1;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                flag = 0;
            }
        }

        if (flag == 1) {
            System.out.println(a + " is prime");
        } else {
            System.out.println(a + " not prime");
        }

    }

}
