package com.pav.programs.com.HashMap.programs;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavani on 6/22/17.
 */
public class HashMapCharacters {

    public static void main(String[] args) {


        String s="abc123gfabc123";

        char[] x=s.toCharArray();

        HashMap<Character ,Integer> h=new HashMap<>();

        for(int  i=0;i<x.length;i++)
        {



            if(h.containsKey(x[i]))
            {
                h.put(x[i],h.get(x[i])+1);

            }
            else
            {
                h.put(x[i],1);

            }





        }



        for(Map.Entry m:h.entrySet()) {

            int i = (int) m.getValue();
            if (i == 1) {
                System.out.println(m.getKey() + "---->" + m.getValue());

                break;
            }
        }

    }
}
