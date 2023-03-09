package org.certification.chapterone.classes;

import java.io.Closeable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

abstract interface CanSwim {
    public void swim(final int distance);
}

public class Turtle {
    final int distance = 2;

    public static void main(String[] seaweed) {


         String race = "";
         outer:
         do {
             inner:
                do
                    {
                       race += "x";
                    }
                while (race.length() <= 4);
             } while (race.length() < 4); // Atata timp cat conditia in while este true DO se va executa
         System.out.println(race);

//        var numPigeons = Long.parseLong("100");
//
//        var var = "";
//        var result = Arrays.binarySearch(seaweed, seaweed[0]);
//        List<String>  hello = Arrays.asList("");
//        hello.set(0, "");
//
//        var date = LocalDate.of(2022, Month.JULY, 17);
//        var time = LocalTime.of(10, 0);
//        var zone = ZoneId.of("America/New_York");
//        var iceCreamDay = ZonedDateTime.of(date, time, zone);
////        time = time.plusMonths(1);
////        iceCreamDay = iceCreamDay.plusMonths(1);
//        System.out.println(iceCreamDay.getMonthValue());


//        var odds = IntStream.iterate(1, a -> a+2);
//        var evens = IntStream.iterate(2, a -> a+2);
//        var sum = IntStream.concat(odds, evens)
//                .peek(System.out::println)
//                .limit(10).sum();
//        System.out.println(sum);
//        System.out.println("=====================");
//        var odds1 = IntStream.iterate(1, a -> a+2);
//        var evens1 = IntStream.iterate(2, a -> a+2);
//        var sum1 = IntStream.concat(evens1, odds1)
//                .peek(System.out::println)
//                .limit(10).sum();
//        System.out.print(sum1);

//        AtomicInteger increment = new AtomicInteger(10);
//
//        System.out.println(increment.incrementAndGet());
//        System.out.println(increment.decrementAndGet());


//         var halleysComet = Path.of("stars/./rocks/../m1.meteor").subpath(1, 5).normalize();
//
//         var lexellsComet = Paths.get("./stars/../solar/");
//        lexellsComet = lexellsComet.subpath(1, 3).resolve("m1.meteor").normalize();
//
//         System.out.print(halleysComet.equals(lexellsComet) ? "Same!" : "Different!");


//        boolean balloonInflated = false;
//        do {
//            if (!balloonInflated) {
//                balloonInflated = true;
//                System.out.print("inflate-");
//            }
//        } while (! balloonInflated); //  As long as the variable between parenthesis is true the while loop will be run
//        System.out.println("done");




//         System.out.println("cheetah\ncub");
//         System.out.println("cheetah\\ncub");
//         System.out.println("cheetah\ncub".translateEscapes());
//         System.out.println("cheetah\\ncub".translateEscapes());



//        //===================================
//        var dice = new LinkedList<Integer>();
//        dice.offer(3);
//        //====================================
//        Object coffee = (Integer)null;
//        coffee.equals(new Object());
//        //====================================
//        final int distance = 3;
////        CanSwim seaTurtle = {  here was the error An anonymous class instantiated from
////        an Interface must have  " new CanSwim()
//        CanSwim seaTurtle = new CanSwim (){
//        final int distance = 5;
//        @Override
//        public void swim ( final int distance){
//            System.out.print(distance);
//        }
//      };
//        seaTurtle.swim(7);
    }
}

