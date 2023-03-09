package org.certification;

public class Main {
    final int distance = 2;
    static int[][] game; // = new int[3][3];
    public static void main(String[] args) {
        final int distance = 3;
        game[0][0] = 6;
        Object[] obj = game;
        game[0][0] = 8;
        System.out.println(game[0][0]);
    }
}

abstract interface CanSwim {
    public void swim(final int distance);
}