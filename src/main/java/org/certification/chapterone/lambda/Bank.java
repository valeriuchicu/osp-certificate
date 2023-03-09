package org.certification.chapterone.lambda;

import java.util.function.DoubleToIntFunction;

//public class Bank {
//    private int savingsInCents;
//
//    public static void main(String[] currency) {
//        Bank creditUnion = new Bank();
//        creditUnion.savingsInCents = 100;
//        double deposit = 1.5;
//
//        creditUnion.savingsInCents +=
//                ConvertToCents.f.applyAsInt(deposit);  // j1
//        System.out.print(creditUnion.savingsInCents);
//    }
//
//    private static class ConvertToCents {
//        static DoubleToIntFunction f = p -> Math.toIntExact(Math.round(p * 100));
//    }
//}

enum Currency { DOLLAR, YEN, EURO }
abstract class Provider {
    protected Currency c = Currency.EURO;
}
public class Bank extends Provider {
    protected Currency c = Currency.DOLLAR;
    public static void main(String[] pennies) {
        int value = 0;
        switch(new Bank().c.ordinal()) {
            case 0:
                value--; break;
            case 1:
                value++; break;
        }
        System.out.print(value);
    } }