package com.pav.programs;

/**
 * Created by pavani on 6/23/17.
 */
public class FibonacciSeries {
    public static void main(String[] args) {

        int a=0;
        int b=1;
        int c;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i <10 ; i++) {

            c= a+b;
            a=b;
            b=c;
            System.out.print(c+" ");

        }
    }
}
