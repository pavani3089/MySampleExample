package com.pav.programs;


/**
 * Created by pavani on 6/8/17.
 */
public class MultiDimenArray {
    public static void main(String[]args){
        int a[][] = new int [3][3];
        int i,j,x=0,y=1;
        int b[][] = new int [3][3];
        int c[][] = new int [3][3];

        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++) {
                if(x<=10) {
                    System.out.print(a[i][j] = x);
                    System.out.print(" ");
                    x++;
                }

            }
            System.out.println();
        }
        System.out.println("+");


        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++) {
                if(y<=20) {
                    System.out.print(b[i][j] = y);
                    System.out.print(" ");
                    y++;
                }

            }
            System.out.println();
        }
        System.out.println("=");

        for(i=0;i<c.length;i++){
            for(j=0;j<c.length;j++) {
                System.out.print(c[i][j]= a[i][j]+b[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }

    }
}
