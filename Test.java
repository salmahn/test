package com.android.bootcamp;

/**
 * Created by salmah on 5/8/17.
 */
public class Test {
    String name;
    int age;

    public Test(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("I am "+name+" and I am "+age+" years old");
    }
}


