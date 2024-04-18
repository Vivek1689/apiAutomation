package org.example;

public class mathematicalExpression {
    public static void main(String[] args){
        String s = "one+two-one-one+two-one";
        int result = evaluateStringExpression(s);
        System.out.println(s+" "+result);
    }

    static int evaluateStringExpression(String s){
        String[] strings = s.split("\\+");
        int result = 0;
        int intermediateResult = 0;
        for (int i =0;i<strings.length;i++){
            if (strings[i].contains("-")){
                String[] subParts = strings[i].split("-");
               intermediateResult += evaluateString(subParts[0]);
               for (int j=1;j<subParts.length;j++){
                   intermediateResult -= evaluateString(subParts[j]);
               }
            }
            else {
                result += evaluateString(strings[i]);
            }
        }
        result=result+intermediateResult;
        return result;
    }
    static int evaluateString(String s){
        if (s.contains("one")) {
            return 1;
        }
        else if (s.contains("two")) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
