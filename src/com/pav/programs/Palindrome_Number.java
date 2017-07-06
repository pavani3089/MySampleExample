package com.pav.programs;

/**
 * Created by pavani on 6/6/17.
 */
public class Palindrome_Number {
    public static void main(String[]args){
        int r, temp, sum=0;
        int n=6789876;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is a Palindrome Number");
        }
        else{
            System.out.println(temp+" Not a Palindrome Number");
        }
    }
}
