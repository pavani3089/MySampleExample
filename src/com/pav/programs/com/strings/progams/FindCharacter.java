package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/19/17.
 */
public class FindCharacter {
    public static void main(String[] args) {
        String a= "Hello";
        char b[] = a.toCharArray();
        System.out.println(b);
        for (int i = 0; i < b.length; i++) {
            if (i==2){
                System.out.println("Charcter present in the given string in position "+(i+1)+" is "+b[i]);
                b[i]= ' ';
            }

        }
        System.out.println();

        System.out.println("After replacing:");

        System.out.print(b);
        System.out.println();
        System.out.println("After deleting:");


        // Delete a character from array

        char c[] = new char[5];

        for (int i = 0; i < b.length-1; i++) {
            if (i==2){
                b[i]=c[i];
            }
        }
        System.out.println(b);


    }
}
