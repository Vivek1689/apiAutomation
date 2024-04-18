package org.example;

public class replaceCharacterPalindrome {
    public static void main(String[] args) {
        String inputString = "?ab??a";
        String inputString1 = "bab??a";
        String inputString2 = "?a?";

        System.out.println(inputString + " Palindrome String " + replaceQuestion(inputString));
        System.out.println(inputString1 + " Palindrome String " + replaceQuestion(inputString1));
        System.out.println(inputString2 + " Palindrome String " + replaceQuestion(inputString2));
    }
    static String replaceQuestion(String inputString) {
        char[] charArray = inputString.toCharArray();
        int size = charArray.length;
        int leftCounter = 0;
        int rightCounter = size - 1;
        while (leftCounter < rightCounter) {
            if (charArray[leftCounter] == '?' && charArray[rightCounter] == '?') {
                charArray[leftCounter] = 'a';
                charArray[rightCounter] = 'a';
            } else if (charArray[leftCounter] != '?' && charArray[rightCounter] == '?') {
                charArray[rightCounter] = charArray[leftCounter];
            } else if (charArray[leftCounter] == '?' && charArray[rightCounter] != '?') {
                charArray[leftCounter] = charArray[rightCounter];
            } else if (charArray[leftCounter] != charArray[rightCounter]) {
                return "No";
            }
            leftCounter++;
            rightCounter--;
        }
        if (size % 2 != 0 && charArray[size / 2] == '?') {
            charArray[size / 2] = 'a';
        }
        return new String(charArray);
    }
}
