package org.example;

public class numberSearchInArray {
    public static void main(String[] args) {
        int[] numberArray = {3, 2, 4, 6};
        int targetNumber = 4;
        for (int i=0;i<numberArray.length;i++) {
            if (numberArray[i]==targetNumber) {
                System.out.println(targetNumber + " appeared in " + i+" index");
            }
        }
    }
}
