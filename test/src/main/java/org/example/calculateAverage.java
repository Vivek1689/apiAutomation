package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class calculateAverage {
    //Calculate average excluding min and max numbers
    public static void main(String[] args) {
        double[] numbers = {9, 8, 2, 6, 5};
        Arrays.sort(numbers);
        double sum = 0;
        for(int i=1;i<numbers.length-1;i++){
            sum += numbers[i];
        }
        System.out.println(sum/(numbers.length-2));
    }
}
