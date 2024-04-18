package org.example;

import java.util.Arrays;

public class ascendingDescending {
    public static void main(String[] args){
        int[] numbers = {3,5,2,7,1};
        int temp=0;
        for (int i =0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]>numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Ascending");
        for (int number:numbers){
            System.out.print(" "+number);
        }
        System.out.println("");
        System.out.println("Descending");
        for (int i =0;i<numbers.length;i++){
            for (int j=i+1;j<numbers.length;j++){
                if (numbers[i]<numbers[j]){
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        for (int number:numbers){
            System.out.print(" "+number);
        }
    }
}
