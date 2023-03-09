package org.certification.chapterone.classes;

interface Speak {
    public default long getVolume() {
        return 20;
    }
}

interface Whisper {
    public default long getVolume() {
        return 10000000000000000L;
    }
}

public class Debate implements Speak, Whisper {
    public static void main(String[] a) {
        var d = new Debate();
        System.out.println(d.getVolume());
    }

    @Override
    public long getVolume() {
        System.out.println(Whisper.super.getVolume());
        return 30;
    }
}
