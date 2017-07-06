package com.pav.programs.com.arrays.programs;

import java.util.Arrays;

/**
 * Created by pavani on 6/13/17.
 */
public class FillArray {
    public static void main(String[] args) {
        char a[]= new char[]{'a','b','c','d'};
        Arrays.fill(a,1,3,'e');
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");

        }
        System.out.println();
        Arrays.fill(a,'o');
        for (int i=0;i<a.length;i++) {

            System.out.print(a[i]+" ");

        }

    }
}
