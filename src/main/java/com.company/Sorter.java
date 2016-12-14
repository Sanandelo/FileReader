package com.company;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * Created by Radgast on 12.12.2016.
 */
public class Sorter implements SorterInterface{
    public  List<String> sortByLength(List<String> string) {
        List<String> result = new ArrayList<>(string);
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        return result;
    }

    private static int countOccurrences(String str, char target){
        int count =0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == target){
                count++;
            }
        }
        return count;
    }
    public  List<String> sortByWhiteSpace(List<String> string){
        List<String> result = new ArrayList<>(string);
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return countOccurrences(o1,' ') - countOccurrences(o2, ' ');
            }
        });
        return result;
    }
}
