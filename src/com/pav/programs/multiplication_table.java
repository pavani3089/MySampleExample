package com.pav.programs;

/**
 * Created by pavani on 6/6/17.
 */
public class multiplication_table {
    public static void main(String[]args){
        int i,j,k;
        for(i=1;i<=3;i++){
            for(j=1;j<=5;j++){
                k=i*j;
                System.out.println(i+"*"+j+"="+k);
            }
        }

    }
}
