package dev.andus.bastom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Collectors;

public class Utils {
    public static String readFromFile(String filename, String noFileResponse) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            return br.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
            return noFileResponse; // Fallback
        }
    }
}
