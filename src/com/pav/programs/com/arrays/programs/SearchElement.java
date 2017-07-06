package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/12/17.
 */
public class SearchElement {
    public static void main(String[]args){
        int a[]= new int[]{1,10,0,7,3};
        int temp=7,n;
        for(int i=0;i<a.length;i++){
            if(temp==a[i]){
                System.out.println("The given value "+temp+" is in position "+i);
            }
        }
        System.out.println();
        System.out.println("Array after inserting: ");
        int value=12;
        int p=2, j;
        for(j=0;j<a.length;j++){
            if(j==p){
                a[j]=value;
            }
            System.out.print(a[j]+" ");

        }

    }
}
