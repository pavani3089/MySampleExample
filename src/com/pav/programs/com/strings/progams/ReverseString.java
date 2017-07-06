package com.pav.programs.com.strings.progams;

/**
 * Created by pavani on 6/19/17.
 */
public class ReverseString {                                  
    public static void main(String[] args) {                  
        String str="Hello How Are You";                       
        String[] temp;                                        
                                                             
        temp = str.split(" ");                                
                                                             
        for (int i = 0; i <temp.length ; i++) {               
            //System.out.print (temp[i]+" ");                 
            char rev[]= temp[i].toCharArray();                
            for (int j = rev.length-1; j >=0 ; j--){          
                System.out.print(rev[j]);                     
            }                                                 
            System.out.print(" ");                            
                                                             
        }                                                     
                                                             
                                                             





        /**char reverse[]= str.toCharArray();
        System.out.println(reverse);
        System.out.println();
        for (int i = reverse.length-1; i >= 0; i--) {
            System.out.print(reverse[i]);
        }**/


    }
}
