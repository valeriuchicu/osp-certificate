package org.certification.chapterone.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Wash<T extends Collection> {
    public void clean(T items) {
        System.out.println("Cleaned " + items.size() + " items");
    }
}

public class LaundryTime {
    public static void main(String[] args) {
        Wash<List> wash = new Wash<List>();
//        wash.clean(List.of("sock", "tie"));
    }
}