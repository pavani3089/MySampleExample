package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class GetMissingnum {
    public static void main(String[] args) {
        int a[] = new int[]{2, 3, 4, 5, 6, 7, 8, 9,10};
        int temp=0;

        for (int i = 0; i < a.length; i++) {
            temp = (a[i+1])-a[i];
            if(temp!=1){
                int miss= a[i]+1;
                System.out.println(miss);
                break;
            }


        }
    }
}
