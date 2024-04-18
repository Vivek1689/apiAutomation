package org.example;

public class SortAlphabets {
    public static void main(String[] args) {
        char[] characterArray = {'c','b','a','u','q'};
        char temp;
        for (int i=0;i<characterArray.length;i++) {
            for (int j = i + 1; j < characterArray.length; j++) {
                if (Character.valueOf(characterArray[i]) > Character.valueOf(characterArray[j])) {
                    temp = characterArray[i];
                    characterArray[i] = characterArray[j];
                    characterArray[j] = temp;
                }
            }
        }
        System.out.println(characterArray);
    }
}
