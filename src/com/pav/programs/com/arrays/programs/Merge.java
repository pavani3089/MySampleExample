package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/12/17.
 */
public class Merge {
    public static void main(String[] args) {
        char a[]= new char[]{'a','e'};
        char b[]= new char[]{'i','o','u'};
        char c[]= new char[a.length+b.length];
        int count=0;
        for(int i=0; i<a.length; i++){
            c[i] = a[i];
            //System.out.println(c[i]);

        }
        for(int i=a.length, j=0; i<c.length&&j<b.length; i++,j++){
            c[i]=b[j];

        }


       for(char k:c)
       {
           System.out.print(k+"  ");
       }

    }
}
