package fi.academy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Tiedostohaku {


    public static void main(String[] args) {

        Path dir = Paths.get(".");
        Stream<Path> virta = null;
        try {
            virta = Files.list(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        virta.filter(Files::isRegularFile)
                .map(p -> p.getFileName())
                .forEach(System.out::println);
    }

}