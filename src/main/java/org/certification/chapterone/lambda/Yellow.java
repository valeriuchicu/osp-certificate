package org.certification.chapterone.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Yellow {
    public static void main(String[] args) {

        String nn = new String("Hello");
        if (nn.isEmpty()){}

        String mm = "Nello";
        if(mm.isEmpty()) {}

        var list = new ArrayList<String>();
        list.add("Atlanta");
        list.add("Chicago");
        list.add("New York");
        list.stream()
                .filter( String::isEmpty)
                .forEach(System.out::println);

//        List list = Arrays.asList("Sunny");
//        method(list);                                // c1
    }

    private static void method(Collection<?> x) {   // c2
        x.forEach(a -> { });                        // c3
    }
}


