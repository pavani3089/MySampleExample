package com.pav.programs.com.HashMap.programs;

import java.util.HashMap;

/**
 * Created by pavani on 6/22/17.
 */
public class SearchKeyAndValue {
    public static void main(String[] args) {
        HashMap hMap = new HashMap();
        hMap.put("one",new Integer(1));
        hMap.put("two",new Integer(2));
        hMap.put("three",new Integer(3));

        boolean b = hMap.containsKey("four");
        if(b == true){
            System.out.println("Given key exists");
        }
        else{
            System.out.println("Given key doesn't exists");

        }

        boolean bln = hMap.containsValue(2);
        if(bln == true){
            System.out.println("Given value exists");
        }
        else{
            System.out.println("Given value doesn't exists");

        }
        System.out.println();
        System.out.println("Size of HashMap: "+hMap.size());



    }
}
