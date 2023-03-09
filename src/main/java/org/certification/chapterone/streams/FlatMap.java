package org.certification.chapterone.streams;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
         set.add("tire-");
         List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
         queue.push("wheel-");
         Stream.of(set.stream(), list.stream(), queue.stream())
//      the flatMap will work with this row as it provide Stream<Stream<String>>


//         Stream.of(set, list, queue)
// this one is in the test and this is wrong as this provides Stream<Collection<String>>
            .flatMap(x -> x)
            .forEach(System.out::print);
    }
}
