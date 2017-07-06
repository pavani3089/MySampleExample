package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class SecondLargest {

    public static void main(String[] args) {


        int[] a=new int[]{
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};

        int lar=a[0],slar=a[0];
        for(int i=0;i<a.length;i++)
        {

            if(lar>a[i])
            {
                slar=lar;
                lar=a[i];

            }
            else if (a[i]<slar)
            {
                slar=a[i];
            }



        }

        System.out.println(lar);
        System.out.println(slar);

    }
}
