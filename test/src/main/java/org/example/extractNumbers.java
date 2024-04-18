package org.example;

public class extractNumbers {
    public static void main(String[] args){
        String value = "abd123";
        String onlyNumbers = value.replaceAll("[^0-9]","");
        System.out.println(onlyNumbers);
    }
}
