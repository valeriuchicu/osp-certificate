package org.certification.chapterone.lambda;

import java.util.function.BinaryOperator;

public class Magician {

    public static void main(String... unused) {
        BinaryOperator<Double> bod = (b, w) -> (double) w.doubleValue();
        BinaryOperator<Long> bol = (b, w) -> (long) w.intValue();

        magicLong(bol);
        magicDouble(bod);
    }

    public static void magicLong(BinaryOperator<Long> lambda) {
        Long aLong = lambda.apply(3L, 7L);
        System.out.println("The result of the lambda is: " + aLong);
    }

    public static void magicDouble(BinaryOperator<Double> lambda) {
        Double aDouble = lambda.apply(3.5, 7.5);
        System.out.println("The result of the lambda is: " + aDouble);
    }
}