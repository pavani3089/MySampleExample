package com.pav.programs;

/**
 * Created by pavani on 6/22/17.
 */
public class PrimeNumTest {
    /*

     */
    public static void main(String[] args) {
        PrimeNumTest p = new PrimeNumTest();

        for (int i=2;i<100;i++) {
            boolean b = p.isPrime(i);
            if (b) {
                System.out.println(i+"  its prime num");
            } else {

            }
        }
    }
    public boolean isPrime(int i){


        for(int x=2;x<i;x++)
        {

            if(i%x==0)
            {
                return false;
            }



        }

        return  true;
    }
}
