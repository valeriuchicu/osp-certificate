package org.certification.chapterone.classes;

public sealed interface Time permits Hour, Minute, Second {}

record Hour() implements Time {}
//interface Minute extends Time {} this does not compile because it is not final and
// even is not non-sealed. We cannot make an interface Final because after that we
// cannot implement it but we can make this interface non-sealed and everything will works fine.
non-sealed interface Minute extends Time {}
non-sealed class Second implements Time {}
class Micro extends Second {}
