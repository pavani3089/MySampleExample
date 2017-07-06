package com.pav.programs.com.arraylist.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by pavani on 6/21/17.
 */
public class SortAndSearch {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("3");
        arrayList.add("5");
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("4");
        arrayList.add("4");
        arrayList.add("5");
        System.out.println("Before Sorting:");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("After Sorting:");
        Collections.sort(arrayList);
        Iterator str = arrayList.iterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }
        System.out.println();

        boolean b = arrayList.contains("0");
        if(b == true){
            System.out.println("ArrayList contains 0");
        }
        else{
            System.out.println("ArrayList doesn't contains 0");

        }
        System.out.println();

        int index = arrayList.indexOf("4");
        if(index!= -1){
            System.out.println("Index of element 4:"+ index);
        }
        System.out.println();

        int LastOcc = arrayList.lastIndexOf("5");
        if(LastOcc!= -1){
            System.out.println("Last Occurance of element 5 is at index:"+ LastOcc);
        }


    }
}
