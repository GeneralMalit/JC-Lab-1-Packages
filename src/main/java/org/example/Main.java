package org.example;
import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        ClassOne c1 = new ClassOne();
        ClassTwo c2 = new ClassTwo();
        ClassThree c3 = new ClassThree();
        out.println(c1.greet());
        out.println(c2.greet());
        out.println(c3.greet());
    }
}