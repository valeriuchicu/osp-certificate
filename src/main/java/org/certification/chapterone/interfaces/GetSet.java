package org.certification.chapterone.interfaces;

interface Ready {
    static int first = 2;
    final short DEFAULT_VALUE = 10;
    GetSet go = new GetSet();            // n1
}

public class GetSet implements Ready {
    static int second = DEFAULT_VALUE;   // n2
    int first = 5;

    public static void main(String[] begin) {
        var r = new Ready() {
        };
        System.out.print(r.first);        // n3
        System.out.print(" " + second);   // n4
    }
}