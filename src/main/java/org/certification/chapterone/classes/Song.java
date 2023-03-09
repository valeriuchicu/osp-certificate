package org.certification.chapterone.classes;

public class Song {


   // A class cannot contain two methods with the same method signature,
    // even if one is static and the other is not.


    //    public void playMusic() {
//        System.out.print("Play!");
//    }
    private static void playMusic() {
        System.out.print("Music!");
    }

    private static void playMusic(String song) {
        System.out.print(song);
    }

    public static void main(String[] tracks) {
        new Song().playMusic();
    }
}
