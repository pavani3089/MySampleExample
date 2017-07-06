package com.pav.programs.com.OopsConcepts.programs;

import java.util.ArrayList;

/**
 * Created by pavani on 6/26/17.
 */
public class ConstructorStudent {
    String name;
    int rollnum;
    int age;
    ConstructorStudent(String n, int r, int a){
        this.name= n;
        this.rollnum= r;
        this.age = a;
    }

    public static void main(String[] args) {
        ConstructorStudent s1 = new ConstructorStudent("Pavani",1,28);
        ConstructorStudent s2 = new ConstructorStudent("Vandana",2,30);
        ArrayList<ConstructorStudent> s= new ArrayList<ConstructorStudent>();
        s.add(s1);
        s.add(s2);

        for (ConstructorStudent st:s) {
            System.out.println(st.name+" "+st.rollnum+" "+st.age);

        }

    }
}
