package com.pav.programs;

/**
 * Created by pavani on 6/8/17.
 */
public class SmallestNLargestNum {


    public  static void main(String[] args)
    {
        int a[]= new int[]{5,9,123,6,2,1};
        int Large= a[0];
        int small= a[0];
        for(int i=1; i<a.length; i++){
            if(a[i]>Large){
                Large=a[i];
            }
            if(a[i]<small){
                small=a[i];
            }
        }
        System.out.println("Largest Num = "+Large);
        System.out.println("Smallest Num = "+small);
    }
}
