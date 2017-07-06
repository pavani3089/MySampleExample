package com.pav.programs.com.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by pavani on 6/21/17.
 */
public class RemoveReplacePrograms {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");

       arrayList.remove(1);
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));

        }

       arrayList.set(1,"6");
        System.out.println("After replacing:");
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));

        }

        System.out.println();
        arrayList.clear();
        System.out.println("Size of arraylist after removing all:"+arrayList.size());




    }
}
