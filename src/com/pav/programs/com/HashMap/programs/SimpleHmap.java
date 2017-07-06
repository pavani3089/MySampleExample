package com.pav.programs.com.HashMap.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 6/22/17.
 */
public class SimpleHmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hMap = new HashMap();
        hMap.put("one",new Integer(1));
        hMap.put("two",new Integer(2));
        hMap.put("three",new Integer(3));
        hMap.put("four",new Integer(3));
        boolean b =hMap.containsKey("One");

        System.out.println(b);
        for(Map.Entry m:hMap.entrySet())
        {


            System.out.println(m.getKey()+"--->"+m.getValue());
        }


    }
}
