package org.example;

import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Vowels removed "+removeVowelsFunction(inputString));
    }
    public static String removeVowelsFunction(String inputString){
        return inputString.replaceAll("[aeiouAEIOU]","");
    }
}
