package org.certification.chapterone.exceptions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TriggeringConcurrentModificationException {

    public static void main(String[] args) {
        List<String> list = List.of(
                "Mary", "had", "a", "little", "lamb");
        Set<String> set = new HashSet<>(list);
        set.addAll(list);
        // THE RIGHT WAY IS TO USE A ITERATOR OR TO USE removeIf
            set.removeIf(sheep -> sheep.length() > 1);

        // we cannot use   FOR   and   REMOVE  to remove from a collections without an ITERATOR
        //        for (String sheep : set)
        //            if (sheep.length() > 1)
        //                set.remove(sheep);
        // if we will try to do so it will throw ConcurrentModificationException
        System.out.println(set);

    }
}
