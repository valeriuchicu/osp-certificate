package org.certification.chapterone.classes;

public class BicycleExerciseWhereYouMustPayAttention {
    String color = "red";

    public static void main(String[] rider) {
        //  a private method in the same class CAN be used in main method
        //  You just have to guess which color will be print???
        new BicycleExerciseWhereYouMustPayAttention().printColor("blue");
    }

    private void printColor(String color) {
        color = "purple";
        System.out.print(color);
    }
}
