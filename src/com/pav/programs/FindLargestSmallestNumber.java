package com.pav.programs;

/**
 * Created by pavani on 6/5/17.
 */
public class FindLargestSmallestNumber {

    public static void main(String [] args)
    {
        int numbers[] = new int[]{32,43,53,54,32,124,63,98,43,23,108};
        int large=numbers[0];
        int a=10;
        System.out.println(a++);//10
        System.out.println(a);//11
        for (int i=0;i<numbers.length;i++)
        {
            if (large>numbers[i])

            {

            }
            else
            {
                large=numbers[i];
            }
        }

        System.out.print(large);
    }
}
