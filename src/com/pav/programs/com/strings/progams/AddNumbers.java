package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/19/17.
 * Adding Numbers in a string.
 */
public class AddNumbers {
    public static void main(String[] args) {
        String str = "Hello123abc05";
        char[] input = str.toCharArray();
        int res=0;
        for (int i = 0; i <input.length ; i++) {

          if(Character.isDigit(input[i])){
              int x= Character.getNumericValue(input[i]);
              res=res+x;
          }

        }
        System.out.println(res);
    }
}
