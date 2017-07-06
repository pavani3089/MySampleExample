package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class Missing2 {
    static int getMissingNo (int a[])
    {

        int i, total=0;
        System.out.println(a.length);

        for(int k=0;k<=a.length+1;k++)
        {
            total=total+k;
        }
        System.out.println(total);

        for ( i = 0; i< a.length; i++)
            total -= a[i];
        return total;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,8,9,10};
        int miss = getMissingNo(a);
        System.out.println(miss);


    }
}
