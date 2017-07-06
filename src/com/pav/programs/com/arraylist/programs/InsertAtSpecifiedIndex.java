package com.pav.programs.com.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by pavani on 6/21/17.
 */
public class InsertAtSpecifiedIndex {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("pavani");
        arrayList.add("yuva");
        arrayList.add("yuvansh");

        Vector v = new Vector();
        v.add("raju");
        v.add("padma");

        arrayList.addAll(1,v);

        // Iterating using iterator
        System.out.println("Using Iterator:");
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

        System.out.println();

        // Iterating using List Iterator
        System.out.println("Using List Iterator:");
        System.out.println();
        ListIterator ltr = arrayList.listIterator();
        System.out.println("Printing in forward direction:");
        while (ltr.hasNext()){
            System.out.println(ltr.next());
        }
        System.out.println();
        System.out.println("Printing in reverse direction:");
        while (ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }




    }
}
