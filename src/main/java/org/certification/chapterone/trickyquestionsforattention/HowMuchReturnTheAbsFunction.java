package org.certification.chapterone.trickyquestionsforattention;

public class HowMuchReturnTheAbsFunction {

    public static void main(String[] args) {
        var sum = 0.0;
        sum = sum + Math.round(11.2);
        sum = sum + Math.ceil(8.1);
        sum = sum + Math.abs(sum);

        System.out.println(sum);

//        Integer a = -8;
//        double d = -100;
//        float f = -90;
//        double ABS = 90;
//
//        System.out.println(Math.abs(a));
//        System.out.println(Math.abs(d));
//        System.out.println(Math.abs(f));
//        System.out.println(Math.abs(ABS));
    }
}
