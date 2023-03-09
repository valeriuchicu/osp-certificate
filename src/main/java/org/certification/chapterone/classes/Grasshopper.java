package org.certification.chapterone.classes;

import org.certification.chapterone.Hopper;

public class Grasshopper extends Hopper {
    public static void main(String[] args) {
        var hopper = new Grasshopper();
        hopper.move();  // p2
        hopper.hop();   // p3
    }

    public void move() {
        hop();  // p1
        tryHop(); // If the method was not override we are not obligated to use super.
    }
}
