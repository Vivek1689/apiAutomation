package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class secondLargestOddNumber {
    public static void main(String[] args) {
      String number = "5732@";
        ArrayList<Integer> numbers = new ArrayList<>();
      for (int i=0;i<number.length();i++){
          if (Character.isDigit(number.charAt(i))) {
              int value = Integer.parseInt(String.valueOf(number.charAt(i)));
              if ((value) % 2 != 0) {
                  numbers.add(value);
              }
          }
      }
        Collections.sort(numbers,Collections.reverseOrder());
      Object[] numberArray = numbers.toArray();
      if (numberArray.length<=1) System.out.println("Only largest odd number " + numberArray[0]);
      else System.out.println("Second Largest "+numberArray[1]);
    }
}