package org.example;

public class returnMedian {
    public static void main(String[] args) {
     double[] numberArray = {1,2,3,4,5};
     int index =  numberArray.length/2;
     double median;
     if (numberArray.length%2==0){
        median=(numberArray[index]+numberArray[--index])/2;
     }else {
         median=numberArray[index];
     }
        System.out.println(median);
    }
}
