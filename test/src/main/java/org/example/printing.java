package org.example;

public class printing {
    public static void main(String[] args) {
        String string = "java, maven, testng, selenium";
        String[] stringArray = string.split(", ");
        for (String value:stringArray){
            System.out.println(value);
        }
    }
}
