package org.certification.chapterone.exceptions;

public class Error extends Exception{ // The Error name is a ugly name but it is still valid name.
}
//class 2BeOrNot2Be extends RuntimeException {} A class name cannot start with a Number




// This exception class declaration is also non valid because:
// The declared class(child class) cannot use Generics if the the class which it extend in this case is
// NumberFormatException does not use Generics
//class NumberException˂Integer˃ extends NumberFormatException {}
