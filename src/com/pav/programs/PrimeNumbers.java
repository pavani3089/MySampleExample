package com.pav.programs;

/**
 * Created by pavani on 6/5/17.
 */
public class PrimeNumbers {
    public static void main(String[]args){
       String s="abc105xy05xyz9";
       char[] x=s.toCharArray();
       char[] y=new char[100];
       int i=0;
       for (char c :x)
       {
           if(Character.isDigit(c))
           {
               x[i]=c;
           }
           else {
               x[i]=',';
           }
        i++;
       }
        String s1=new String(x);

       String[] s2=s1.split(",");
       int total=0;
       for(String s3:s2)
       {
           if(s3.equals(""))
           {

           }
           else
           {
               total=Integer.parseInt(s3)+total;
           }
       }
       System.out.println(total);

    }
}
