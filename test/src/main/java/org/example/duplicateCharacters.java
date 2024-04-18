package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicateCharacters {
    public static void main(String[] args) {
        String value = "j a va s";
        HashMap<Character,Integer> occurrence = new HashMap<>();
        for (int i=0;i<value.length();i++){
            occurrence.put(value.charAt(i),occurrence.getOrDefault(value.charAt(i),0)+1);
        }
        for (Map.Entry<Character,Integer> entry:occurrence.entrySet()){
            if (entry.getValue()>1){
                System.out.print(entry.getKey());
            }
        }
    }
}
