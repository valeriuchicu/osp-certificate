package org.certification.chapterone.nioFiles;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
public class MoveAFile {
    public static void main(String[] args) throws IOException {

        // This does not work
        Files.createDirectories(Path.of("/flower"));
        Files.createDirectories(Path.of("/nursery"));
        Files.createDirectories(Path.of("/garden/trip.txt"));

        Files.move(Path.of("C:\\flower\\rose.txt"),
                Paths.get("C:\\garden\\trip.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.move(new File("C:\\garden\\rose.txt").toPath(),
                Paths.get("C:\\nursery\\rose.txt"), StandardCopyOption.ATOMIC_MOVE);


        // IN THIS WAY IT WORKS
//        Files.createDirectories(Path.of("/flower/rose.txt"));
//        Files.createDirectories(Path.of("/nursery"));
//        Files.createDirectories(Path.of("/garden"));
//        Files.move(Path.of("C:\\flower\\rose.txt"),
//                Paths.get("C:\\garden\\rose.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.move(new File("C:\\garden\\rose.txt").toPath(),
//                Paths.get("C:\\nursery\\rose.txt"), StandardCopyOption.ATOMIC_MOVE);



//        Files.createDirectory(Path.of("/nursery"));

        //        Files.createFile(Paths.get("C:\\nursery\\sapling.seed"));
//        Files.delete(Paths.get("C:\\nursery\\sapling.seed"));
//        System.out.println("Hello world!");
//        Files.move(
//                Paths.get("C:\\nursery\\sapling.seed"),
//                Paths.get("C:\\forest"));
//                StandardCopyOption.ATOMIC_MOVE);

//        String fromFile = "C:\\nursery\\rose.txt";
//        String toFile = "C:\\garden\\rose.txt";
////        String toFile = "C:\\garden";
//
//        Path source = Paths.get(fromFile);
//        Path target = Paths.get(toFile);

//        try {

            // rename or move a file to other path
            // if target exists, throws FileAlreadyExistsException
//            Files.move(source, target);

            // if target exists, replace it.
//             Files.move(source, target, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
//            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
//             Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);


            // multiple CopyOption
            /*CopyOption[] options = { StandardCopyOption.REPLACE_EXISTING,
                                StandardCopyOption.COPY_ATTRIBUTES,
                                LinkOption.NOFOLLOW_LINKS };

            Files.move(source, target, options);*/

//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }
    }
}