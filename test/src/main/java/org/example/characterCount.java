package org.example;

public class characterCount {
    //Extract only numbers from string
    public static void main(String[] args) {
        String inputString = "C6L9B4M7Y3";
        String onlyNumbers = "";
        for (int i = 0; i < inputString.length();i++){
            if (Character.isDigit(inputString.charAt(i))){
                onlyNumbers += inputString.charAt(i);
            }
        }
        System.out.println(onlyNumbers);
    }
}
