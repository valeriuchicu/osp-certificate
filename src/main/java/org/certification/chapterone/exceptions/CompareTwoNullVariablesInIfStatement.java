package org.certification.chapterone.exceptions;

public class CompareTwoNullVariablesInIfStatement {
    public static void main(String[] args) {
        String mode = null;
        int grade = (Integer) null; // this line trying to unbox will throw at runtime an exception
        Integer average = null;
//        if (grade ˃= average && Integer.parseInt(mode) ˃ 0){ this will not compilee
            System.out.println("You passed!");
//        }
    }
}
