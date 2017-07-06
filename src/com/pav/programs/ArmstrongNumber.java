package com.pav.programs;

/**
 * Created by pavani on 6/6/17.
 */
public class ArmstrongNumber {
    public static void main(String[]args){
        int n=371, c=0,a, temp;
        temp=n;
        while(n>0){
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c) {
            System.out.println(temp + " is an Armstrong Number");
        }else{
            System.out.println(temp + " is not an Armstrong Number");
        }
    }
}
