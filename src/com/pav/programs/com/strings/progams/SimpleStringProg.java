package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/15/17.
 */
public class SimpleStringProg {
    public static void main(String[] args) {
        char c[]= new char[]{'H','e','l','l','o'};
        String s= new String(c);
        String s1= " world! ";
        String s3= "hello";
        String s4= "hello";

        System.out.println(s.concat(s1));   //concatinate
        System.out.println(s+s1);
        System.out.println();

        System.out.println(s1.trim());      //trim white spaces befor n after string
        System.out.println();

        System.out.println(s.toLowerCase());    //lowercase
        System.out.println();

        System.out.println(s1.toUpperCase());   //uppercase
        System.out.println();

        System.out.println(s.compareTo(s3));    //compare 2 strings

        System.out.println(s.compareToIgnoreCase(s3));  //compare 2 strings ignoring the case
        System.out.println();

        System.out.println(s==s3); //compare using == operator
        System.out.println(s3==s4); //compare using == operator
        System.out.println();

        System.out.println(s.equals(s3));  //compare using equals()
        System.out.println(s4.equals(s3));  //compare using equals()

        System.out.println();

        char[] x= s.toCharArray();



    }
}
