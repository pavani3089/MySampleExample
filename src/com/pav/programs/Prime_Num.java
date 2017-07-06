package com.pav.programs;

/**
 * Created by pavani on 6/5/17.
 */
public class Prime_Num {
    public static void main(String[]args){
        for(int x=2; x<=30; x++) {
            int n = x, m = 0, flag = 0;
            m = n / 2;
            for (int i = 2; i <= m; i++) {

                if (n % i == 0) {
                    //System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }
    }
}
