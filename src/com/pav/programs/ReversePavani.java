package com.pav.programs;

/**
 * Created by pavani on 6/8/17.
 */
public class ReversePavani {

    public static void main(String args[]){
        int num[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10};
        int temp;
        System.out.println("Before reversing: ");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("After reversing: ");

        int reverseArr[] =new int[num.length];
        for(int i=0; i<num.length; i++){
            // temp = num[i];
            reverseArr[i] = num[num.length-1-i];


            System.out.print(reverseArr[i]+" ");

        }
    }


}
