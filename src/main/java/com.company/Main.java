package com.company;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class Main {

    private static final String FILENAME = "E:\\test\\test.txt";

    public static void main(String[] args) {


        try {

            List<String> example = FileReader.readLines(FILENAME);
            SorterInterface sorter = new Sorter();

            List<String> resultSorter = sorter.sortByLength(example);
            System.out.println("Sorter");
            System.out.println();
            for (String str : resultSorter) {
                System.out.println(str);
            }

            SorterInterface bubbleSorter = new BubbleSorter();
            List<String> resultBubbleSorter = bubbleSorter.sortByLength(example);
            System.out.println("Bubble sorter");
            System.out.println();
            for (String str : resultBubbleSorter) {
                System.out.println(str);
            }


            System.out.println();
            System.out.println("Simple output");
            int count = 0;
            for (String str : FileReader.readLines(FILENAME)) {
                System.out.println(str);
                count++;
                if (count == 100) {
                    System.out.println("To long file");
                    break;
                }
            }


        } catch (FileNotFoundException e) {
            System.out.println("Kurwa, no file found");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

