package org.example;

public class MinRotation {
    static int checkRotation(String string){
        int upArrow = 0,downArrow=0,leftArrow=0,rightArrow=0;
        for (char ch:string.toCharArray()) {
            switch (ch){
                case '^':
                    upArrow++;
                    break;
                case 'v':
                    downArrow++;
                    break;
                case '<':
                    leftArrow++;
                    break;
                case '>':
                    rightArrow++;
                    break;
                default:
                    System.out.println("Invalid arrow");
            }
        }
        int maxCount = Math.max(Math.max(upArrow,downArrow),Math.max(leftArrow,rightArrow));
        return string.length()-maxCount;
    }


    public static void main(String[] args){
        System.out.println("Number of arrows needed to rotate "+checkRotation("<<<"));
    }
}
