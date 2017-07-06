package com.pav.programs;

/**
 * Created by pavani on 6/7/17.
 */
public class FloydsTriangle {
    public static void main(String[]args){
        int i,j, x=1;
        for(i=0;i<=6;i++){
            System.out.println();
            for(j=0;j<=i;j++){
                System.out.print(x+"  ");
                x++;
            }
        }
    }
}
