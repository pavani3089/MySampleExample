package com.pav.programs.com.OopsConcepts.programs;

/**
 * Created by pavani on 6/27/17.
 */
class bank{
    int getrateofinterest(){
        return 0;
    }
}
class sbi extends bank{
    int getrateofinterest(){
        return 3;
    }
}
class icici extends bank{
    int getrateofinterest(){
        return 6;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        sbi s= new sbi();
        icici i=new icici();
        System.out.println("SBI interest: "+s.getrateofinterest());
        System.out.println("ICICI interest: "+i.getrateofinterest());
    }
}
