package com.pav.programs.com.OopsConcepts.programs;

/**
 * Created by pavani on 6/26/17.
 */
class MyClass {
    int height;
    MyClass(int i) {
        System.out.println("Building new House that is " + i + " feet tall");
        height = i;
    }
    void info() {
        System.out.println("House is " + height + " feet tall");
    }
    void info(String s) {
        System.out.println(s + ": House is " + height + " feet tall");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MyClass t = new MyClass(1);
        t.info();
        t.info("overloaded method");

    }

}
