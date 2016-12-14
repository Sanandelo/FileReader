
package com.company;


import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Radgast on 08.12.2016.
 */
public class MainTest {
    @Test(expected = FileNotFoundException.class)
    public void testFileNotFound() throws IOException {
        FileReader.readLines("C:\\1.txt");
    }

    @Test(expected = FileNotFoundException.class)
    public void testFilenameIsNull() throws IOException {
        FileReader.readLines(null);
    }
}
