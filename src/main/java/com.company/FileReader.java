package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Radgast on 08.12.2016.
 */
public class FileReader {
    public static List<String> readLines(String filename) throws IOException {
        final List<String> lines = new ArrayList<>();

        if (filename == null) {
            throw new FileNotFoundException("Null is not a file, kurwamać!");
        }

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(filename))) {



            for(String line = br.readLine(); line != null; line = br.readLine()){
                lines.add(line);
            }
        }

        return lines;
    }
}
