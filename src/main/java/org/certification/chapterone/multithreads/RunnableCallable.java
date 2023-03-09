package org.certification.chapterone.multithreads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunnableCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var e = Executors.newSingleThreadExecutor();
        Runnable r1 = () -> Stream.of(1,2,3).parallel();
        Callable r2 = () -> Stream.of(4,5,6).parallel();

        Future<Stream<Integer>> f1 = (Future<Stream<Integer>>) e.submit(r1);  // x1
        Future<Stream<Integer>> f2 = e.submit(r2);  // x2

        var r = Stream.of(f2.get())
                .flatMap(p -> p)                         // x3
         //       .parallelStream()  x4 The parallelStream() method is found in the
                // Collection interface, not the Stream interface
                .collect(
                        Collectors.groupingByConcurrent(i -> i%2==0));
        System.out.print(r.get(false).size()
                +" "+r.get(true).size());
        e.shutdown();
        // =================== Ex: parallelStream() on a  collection
        List<Integer> list = Arrays.asList(1,2,3);

        list.parallelStream()
                .peek(System.out::println)
                .findFirst();
    }
}
