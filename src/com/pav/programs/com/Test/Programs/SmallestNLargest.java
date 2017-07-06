package com.pav.programs.com.Test.Programs;

/**
 * Created by pavani on 6/23/17.
 */
public class SmallestNLargest {
    public static void main(String[] args) {
        int[] a= new int[]{12,67,89,1,28,92};
        int small=a[0];
        for (int i = 1; i <a.length ; i++) {

                if (small > a[i]) {

                    small = a[i];
                }

        }
        System.out.println("Smallest number is: "+small);

        int large=a[0];
        for (int i = 1; i <a.length ; i++) {

            if (large < a[i]) {

                large = a[i];
            }

        }
        System.out.println("Largest number is: "+large);


    }
}
