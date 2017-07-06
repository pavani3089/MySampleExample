package com.pav.programs.com.arraylist.programs;

import java.util.ArrayList;

/**
 * Created by pavani on 6/21/17.
 */
public class AddElementToIndex {
    public static void main(String[] args) {
        ArrayList names= new ArrayList();

        names.add("Pavani");
        names.add("Yuva");
        names.add("Yuvansh");
        names.add(1,"Ayenampudi");
        names.add(3,"Chiluvuri");
        names.add(5,"Varma");


        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }
    }
}
