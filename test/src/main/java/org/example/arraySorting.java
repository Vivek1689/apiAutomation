package org.example;

public class arraySorting {
    public static void main(String[] args) {
        int[] unsortedArray = {5, 3, 8, 3, 1, 7, 2};
        int temp;
        for (int i = 0; i<unsortedArray.length;i++){
            for (int j=i+1;j<unsortedArray.length;j++){
                if (unsortedArray[i]>unsortedArray[j]){
                    temp=unsortedArray[i];
                    unsortedArray[i]=unsortedArray[j];
                    unsortedArray[j]=temp;
                }
            }
        }
        for (int number:unsortedArray){
            System.out.println(number);
        }
    }
}
