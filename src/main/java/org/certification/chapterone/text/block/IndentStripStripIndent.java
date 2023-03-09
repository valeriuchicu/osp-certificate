package org.certification.chapterone.text.block;

public class IndentStripStripIndent {

    public static void main(String[] args) {
        // indent(0) matches the indentation of a text block
        // strip() gets rid of any leading or trailing whitespace
        // stripIndent() only removes incidental whitespace
        var smart = """
                barn owl\n\n
                wise // " " " are not at the same line with all text this indentation is bring by indent(0) to position 0
                """;

        var clever = """
                barn owl\n\n
                 wise // the space between wise and " " " is cleaned by strip()
                """;

        var sly = """
                barn owl\n\n
                wise\r // this is converted in t\n and cleaned by stripIndent()
                """;
//        System.out.println(sly);
//        var sly2 = """
//                barn owl\n\n
//                wise
//                """;
//        System.out.println(sly.indent(0));
//        System.out.println("==============");
//        System.out.println(sly.equals(sly.indent(0)));
//        System.out.println(sly2.equals(sly2.indent(0)));

//        System.out.println( smart.indent(8));
//        System.out.println( smart.indent(-9));
        System.out.println("Smart ======================");
        System.out.println(smart.equals(smart.indent(0)));
        System.out.println(smart.equals(smart.strip()));
        System.out.println(smart.equals(smart.stripIndent()));
        System.out.println("Clever ======================");
        System.out.println(clever.equals(clever.indent(0)));
        System.out.println(clever.equals(clever.strip()));
        System.out.println(clever.equals(clever.stripIndent()));
        System.out.println("Sly ======================");
        System.out.println(sly.equals(sly.indent(0)));
        System.out.println(sly.equals(sly.strip()));
        System.out.println(sly.equals(sly.stripIndent()));
    }
}
