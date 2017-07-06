package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/19/17.
 */
public class AddNumbers2 {

    public static void main(String[] args) {
        String str = "Hello123abc05";
        char num[]= str.toCharArray();
        for (int i = 0; i <num.length ; i++) {
            if(!Character.isDigit(num[i])){
                num[i]=' ';
            }

        }



        String c= new String(num);
        String[] a= c.split(" ");

        int totalCount=0;
        for (String x:a) {
            //System.out.println(x);
            if(!x.equals("")){
                System.out.println(x);
                totalCount=totalCount+Integer.parseInt(x);
            }

        }

        System.out.println(totalCount);







    }
}
