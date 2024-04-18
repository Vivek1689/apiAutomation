package org.example;

public class numberSearchInMultiDimensional {
    public static void main(String[] args){
    int[][] numbers = {{3,2,1},{4,5,6,},{4,7,8}};
    int targetNumber = 4;
    for(int i =0;i<numbers.length;i++){
        for (int j=0;j<numbers[i].length;j++){
            if (numbers[i][j]==targetNumber){
                System.out.println(targetNumber+" appeared in "+i+" "+j+" index");
            }
        }
    }
        }
}
