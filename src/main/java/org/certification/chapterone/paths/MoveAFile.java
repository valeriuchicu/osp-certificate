package org.certification.chapterone.paths;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveAFile {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Path.of("/flower/rose.txt"));
        Files.createDirectories(Path.of("/garden"));
        Files.createDirectory(Path.of("/nursery"));

        Files.move(Path.of("/flower/rose.txt"),
                Paths.get("/garden"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(new File("/garden/rose.txt").toPath(),
                Paths.get("/nursery"), StandardCopyOption.ATOMIC_MOVE);
    }
}
