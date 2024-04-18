package org.example;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        StringBuilder newString = new StringBuilder();
        for (int i =inputString.length()-1;i>=0;i--){
           newString.append(inputString.charAt(i));
        }
        System.out.println(newString);
    }
}
