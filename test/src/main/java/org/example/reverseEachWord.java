package org.example;

import java.util.Scanner;

public class reverseEachWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(reversedString(inputString).trim());
    }
    static String reversedString(String inputString){
        String reversedString = "";
        for(int i=0;i<inputString.length();i++){
            int firstCounter = i;
            while(inputString.charAt(i)!=' ' && i!=inputString.length()-1){
                i++;
            }
            int secondCounter = i-1;
            if (i==inputString.length()-1){
                secondCounter=i;
            }
            while (secondCounter>=firstCounter){
                reversedString += inputString.charAt(secondCounter);
                --secondCounter;
            }
            reversedString += " ";
        }
        return reversedString;
    }
}
