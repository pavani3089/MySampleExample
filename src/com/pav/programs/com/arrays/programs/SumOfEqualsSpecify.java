package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class SumOfEqualsSpecify {

    public static void main(String[] args) {
        int[] a=new int[]{1,2,3,4,5,6,7,8};

        int total=5;

        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(total==a[i]+a[j])
                {
                    System.out.println("numbers("+a[i]+","+a[j]+")");

                }
            }

        }
    }
}
