package org.certification.chaptertwo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.ExecutorService;

public class Padlock2 {

    int count = 0;
    public void sneak(Collection<String> coll) {
        coll.stream().peek(System.out::println).findFirst();
    }
    public static void main(String... unused) throws Exception {
        var c = new Padlock2();
        c.sneak(Arrays.asList("weasel, hello"));

    }
}