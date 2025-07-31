package org.example;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;


public class Main {
    public static void main(String[] args) {
        System.out.println(new ClassOne().greet());
        System.out.println(new ClassTwo().greet());
        System.out.println(new ClassThree().greet());
    }
}