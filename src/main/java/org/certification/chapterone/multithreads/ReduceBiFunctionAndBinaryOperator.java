package org.certification.chapterone.multithreads;

import java.util.Collections;
import java.util.List;
/*
The reduction is parallel, but since the accumulator and combiner a
re well-behaved (stateless and associative), the result is consistent,
making option D incorrect. The identity is 1, which is applied to every element,
meaning the operation sums the values (1+1), (1+2), and (1+3). For this reason,
9 is consistently printed at runtime,
 */
public class ReduceBiFunctionAndBinaryOperator {
    public static void main(String[] args) {
        var data = List.of(1,2,3);
        int f = data.parallelStream()
                .reduce(1, (a,b) -> a+b, (a,b) -> a+b);
        System.out.println(f);
    }
}
