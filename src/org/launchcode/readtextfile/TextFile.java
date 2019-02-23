package org.launchcode.readtextfile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TextFile implements ReadImpl {


    @Override
    public void readTextFile(String fileName) {

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            stream.forEach(System.out::println);


        } catch (FileNotFoundException s) {
            System.out.println("Failed to find the text file to read");

        } catch (IOException e) {
            System.err.println("Failed to read to file");
        }
    }
}
