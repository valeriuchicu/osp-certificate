package org.certification.chapterone;

import java.util.ArrayList;
import java.util.List;

public record Goat(String food) {
    public static void main(String... unused) {
        Goat goatFood = new Goat("Papa buna pentru capre");

        System.out.println(goatFood.food);


        List<Integer> list = new ArrayList<>();
        list.add(-5);
        list.add(0);
        list.add(5);

        list.forEach(x -> System.out.println(x));
    }
}