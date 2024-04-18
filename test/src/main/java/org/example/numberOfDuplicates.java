package org.example;

import java.util.HashSet;
import java.util.Set;

public class numberOfDuplicates {
    public static void main(String[] args){
        int[] numberArray = {1,1,2,2,9,9,56,7,5};
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number: numberArray){
            uniqueNumbers.add(number);
        }
        System.out.println(numberArray.length-uniqueNumbers.size()+" number of duplicates");
    }
}
