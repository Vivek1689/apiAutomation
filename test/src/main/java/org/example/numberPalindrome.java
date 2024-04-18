package org.example;

public class numberPalindrome {
    public static void main(String[] args) {
        int number = -1001;
        int modifiedNumber = Math.abs(number);
        int reverseNumber=0;
        while (modifiedNumber > 0) {
            reverseNumber = (reverseNumber*10) + (modifiedNumber%10);
            modifiedNumber = modifiedNumber/10;
        }
        if (Math.abs(number)==reverseNumber){
            System.out.println("number is palindrome");
        }else{
            System.out.println("number is not palindrome");
        }
    }
}
