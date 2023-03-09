package org.certification.chapterone;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadEverything {
    public static void main(String[] b) throws Exception {
        Path p = Paths.get("collection");
        new ReadEverything().read(p);
        }

    public void readFile(Path p) {
        try {
            Files.readAllLines(p)
                    .parallelStream()
                    .forEach(System.out::println);
        } catch (Exception e) {
        }
    }

    public void read(Path directory) throws Exception {
        Files.walk(directory)
                .filter(p -> Files.isRegularFile(p))
                .forEach(x -> readFile(x));
    }
}
// Try to guess how many errors are in this class ???
/*
  package bookworm;
          import java.io.*;
          import java.nio.file.*;
          public class ReadEverything {
     public void readFile(Path p) {
                try {
                       Files.readAllLines(p)
                       .parallel()
                       .forEach(System.out::println);
                   } catch (Exception e) {}
            }
    public void read(Path directory) throws Exception {
               Files.walk(directory)
                  .filter(p -˃ File.isRegularFile(p))
                  .forEach(x -˃ readFile(x));
            }
    public static void main(String[] b) throws IOException {
               Path p = Path.get("collection");
               new ReadEverything().read(p);
            } }

*/