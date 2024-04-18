package org.example;

public class MissingNumber {

    static int returnMissingNumber(int[] numbers){
        int n=numbers.length+1;
        int expectedSum = n*(n+1)/2;
        int actualSum=0;
        for (int number:numbers){
            actualSum+=number;
        }
        return expectedSum-actualSum;
    }
    public static void main(String[] args){
        int[] numbers={1,2,3,4,6};
        System.out.println(returnMissingNumber(numbers));
    }
}
