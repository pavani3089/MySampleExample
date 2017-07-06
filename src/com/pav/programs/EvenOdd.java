package com.pav.programs;

/**
 * Created by pavani on 6/6/17.
 */
public class EvenOdd {
    public static void main(String[]args){
        int n, x;
        System.out.println("EVEN");
        for(n=1;n<=10;n++) {
            x = n % 2;
            if (x == 0) {
                System.out.print(n + " ");
            }
        }
        System.out.println();

        System.out.println("ODD");
        for(n=1;n<=10;n++) {
            x = n % 2;
            if (x != 0) {
                System.out.print(n + " ");

            }
        }
    }
}
