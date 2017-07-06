package com.pav.programs.com.OopsConcepts.programs;

import java.util.ArrayList;

/**
 * Created by pavani on 6/26/17.
 */

class Institute{
    int id;
    String course;
    String instname;

}

class Student extends Institute{
    String name;
    int age;
    Student(int id1, String n, int a, String c){
        id = id1;
        this.name = n;
        this.age = a;
        this.course = c;
    }
}

class Lecturer extends Institute{
    String name;
    int salary;
    Lecturer(String iname,String ln,String c, int sl){
        this.instname = iname;
        this.name = ln;
        this.course = c;
        this.salary = sl;

    }

}


public class InheritanceExample {
    public static void main(String[] args) {
        Student s1 = new Student(111,"Pavani",28,"Java");
        Student s2 = new Student(222,"Vandana",30,"Selenium" );
        ArrayList<Student> s= new ArrayList<Student>();
        s.add(s1);
        s.add(s2);

        for (Student st:s) {
            System.out.println(st.id+" "+st.name+" "+st.age+" "+st.course);

        }
System.out.println();
        Lecturer l1 = new Lecturer("xyz","Yuva","Java",1000);
        Lecturer l2 = new Lecturer("xyz","Vasu","Java",1000);
        ArrayList<Lecturer> l= new ArrayList<Lecturer>();
        l.add(l1);
        l.add(l2);

        for (Lecturer L:l) {
            System.out.println(L.instname+" "+L.name+" "+L.course+" "+L.salary);

        }
    }
}
