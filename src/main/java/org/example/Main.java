package org.example;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        out.println(new ClassOne().greet());
        out.println(new ClassTwo().greet());
        out.println(new ClassThree().greet());
    }
}