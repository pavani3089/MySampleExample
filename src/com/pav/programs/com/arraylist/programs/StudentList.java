package com.pav.programs.com.arraylist.programs;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by pavani on 6/22/17.
 */

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

}

public class StudentList {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Pavani", 28);
        Student s2 = new Student(2,"Yuva", 31);
        Student s3 = new Student(3,"Yuvansh", 2);

        ArrayList<Student> sl= new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        Iterator itr = sl.iterator();
        while (itr.hasNext()){
            Student list = (Student) itr.next();
            System.out.println("Roll No: "+list.rollno+" Name: "+list.name+" Age: "+list.age);
        }
    }
}
