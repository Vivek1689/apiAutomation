package org.example;

import java.util.ArrayList;

public class positiveAndNegativeNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, -10, 2, 8, -15, -9, 12, 6};
        ArrayList<Integer> negativeNumbers = new ArrayList<>();
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number<0){
                negativeNumbers.add(number);
            }else{
                positiveNumbers.add(number);
            }
        }
        negativeNumbers.addAll(positiveNumbers);
        System.out.println(negativeNumbers);
    }
}
