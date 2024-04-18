package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCountValidator {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        if (validateString(firstString,secondString)) System.out.println("Both have same characters");
        else System.out.println("Both have different characters");
    }

    static boolean validateString(String firstString,String secondString){
        if (firstString.length()!=secondString.length()){
            return false;
        }
        HashMap<Character,Integer> frequency = new HashMap<>();
        for (char ch:firstString.toCharArray()){
            frequency.put(ch, frequency.getOrDefault(ch,0)+1);
        }
        for (char ch:secondString.toCharArray()){
            int count=frequency.getOrDefault(ch,0);
            if (count==0) return false;
            frequency.put(ch,count-1);
        }
        for (int value:frequency.values()){
            if (value!=0) return false;
        }
        return true;
    }
}
