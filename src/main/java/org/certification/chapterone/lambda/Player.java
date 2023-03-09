package org.certification.chapterone.lambda;
/*
This is a correct example of code that uses a lambda.
The interface has a single abstract method.
The lambda correctly takes one double parameter
and returns a boolean. This matches the interface.
The lambda syntax is correct. Since it compiles
 */
public class Player {
    static void prepare(double angle, Basket t) {
        boolean ready = t.needToAim(angle);  // k1
        System.out.println(ready);
    }

    public static void main(String[] args) {
        prepare(45, d -> d > 5 || d < - 5);   // k2
    }

    interface Basket {
        boolean needToAim(double angle);
    }
}