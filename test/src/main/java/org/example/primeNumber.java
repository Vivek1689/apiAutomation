package org.example;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPrime(number)) System.out.println("is Prime");
        else System.out.println("not prime");
    }
    static boolean isPrime(int number){
        for (int i =2;i<=Math.sqrt(number);i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
