package com.pav.programs.com.arrays.programs;

/**
 * Created by pavani on 6/13/17.
 */
public class ExtendingArray {
    public static void main(String[] args) {
        char name[]= new char[]{'d','j','k','m'};
        char extend[]=new char[6];
        extend[4]= 'l';
        extend[5]= 'p';
        System.arraycopy(name,0,extend,0, name.length);
        for (char newname:extend)
        {
            System.out.print(newname+" ");
        }
    }
}
