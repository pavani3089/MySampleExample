package com.pav.programs;

/**
 * Created by pavani on 6/8/17.
 */
public class reverseArray {
    public static void main(String args[]){
        int num[] = { 1, 2, 3, 4, 6, 7, 8, 9, 10};
        int temp;
        System.out.println("Before reversing: ");
        for(int i=0; i<=num.length-1; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("After reversing: ");
        /*for(int i=0; i<num.length/2; i++){
           temp = num[i];
            num[i] = num[num.length-1-i];
            num[num.length-1-i]=temp;

            //System.out.print(temp+" ");
        }
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] +" ");
        }*/
        for(int j=num.length-1; j>=0; j--){
            temp =num[j];
            System.out.print(temp+" ");
        }
    }

}
