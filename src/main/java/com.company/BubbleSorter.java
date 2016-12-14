package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radgast on 14.12.2016.
 */
public class BubbleSorter implements SorterInterface {
    public List<String> sortByLength(List<String> string) {
        List<String> result = new ArrayList<>(string);
        int resultSize = result.size();

        for (int j = 0; j < resultSize - 1; j++) {
            boolean swapped = false;

            for (int i = 0; i < resultSize - 1; i++) {
                String a = result.get(i);
                String b = result.get(i + 1);
                if (a.length() > b.length()) {
                    swap(result, i, i + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return result;
    }

    private void swap(List<String> list, int a, int b) {
        String backup = list.get(a);
        list.set(a, list.get(b));
        list.set(b, backup);
    }
}
