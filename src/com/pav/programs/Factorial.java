package com.pav.programs;

/**
 * Created by pavani on 6/6/17.
 */
public class Factorial {
    public static void main(String[]args){
        int fact=1;
        int x=6;
        for(int i=1;i<=x; i++){
            fact=fact*i;

        }
        System.out.println("Factorial of "+x+"! is "+fact);

    }
}
