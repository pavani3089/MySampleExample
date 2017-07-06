package com.pav.programs;

import java.util.Arrays;

/**
 * Created by pavani on 6/8/17.
 */
public class MergingArr {
    public static void main(String[] args){
        int a[]= new int[]{1,2,3};
        int b[]=new int[]{4,5,6};
        int c[]=new int[a.length+b.length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];


            System.out.print(c[i]+" ");
        }
        for(int i=a.length, j=0; i<c.length&&j<b.length; i++,j++){
            c[i]=b[j];


            System.out.print(c[i]+" ");
        }


        //System.out.println(" ");
       /* for(int x:c )
        {
            System.out.print(x+"     ");
        }*/
    }
}
