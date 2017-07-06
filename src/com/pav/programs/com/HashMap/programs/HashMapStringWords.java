package com.pav.programs.com.HashMap.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 6/22/17.
 */
public class HashMapStringWords {

    public static void main(String[] args) {

        HashMap<String,Integer> h=new HashMap<>();
        String s="Jai&Hello&jai&How&Hello&How&Pavani&Hello";
        String[] v = s.split("&");
        //System.out.println(v);
        for(int i=0;i<v.length;i++)
        {

            if(h.containsKey(v[i])) {
                h.put(v[i], h.get(v[i])+1);

            }
            else
            {
                h.put(v[i], 1);
            }



        }


        for(Map.Entry m:h.entrySet())
        {

            int i=(int)m.getValue();
            if(i>1)
            System.out.println(m.getKey()+"--->"+m.getValue());
        }










    }
}
