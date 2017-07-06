package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/19/17.
 */
public class SearchingString {
    public static void main(String[] args) {
        String str="My name is Pavani";
        int index= str.indexOf("Pavani");
        if(index!=-1){
            System.out.println("The given name Pavani is at the index: "+index );
        }
        else{
            System.out.println("The given name is not found");
        }
        System.out.println();

        System.out.println("The string contains name Yuva? "+str.contains("Yuva"));
    }
}
