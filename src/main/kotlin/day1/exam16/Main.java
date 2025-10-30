package day1.exam16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        String source = "a.txt";
        String target = "b.txt";

        try {
            Files.copy(new File(source).toPath(), new File(target).toPath(), StandardCopyOption.REPLACE_EXISTING);

        }catch (IOException e) {

        }
    }
}