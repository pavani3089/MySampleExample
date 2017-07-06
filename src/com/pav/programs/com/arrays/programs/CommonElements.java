package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class CommonElements {
    public static void main(String[] args) {
        int a[]=new int[]{3,4,8,0,1,5,2,6,7};
        int b[]=new int[]{3,10,4,5,8,7,0,9};
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if (a[i]==b[j]) {
                    System.out.print(a[i]+" ");
                }

            }

        }
    }
}
