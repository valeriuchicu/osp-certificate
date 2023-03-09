package org.certification.chapterone.lambda;

@FunctionalInterface
public interface Serval {

    void hello();
    static void printName(){}

//    protected String getName(); In a interface all abstract method must be PUBLIC

    // here is missing the modifier
//    boolean cat(String name){
//        return true;
//    }
}
