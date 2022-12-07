package hackerrank.Java_Loops_II;

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            System.out.println(getStringWithResult(a,b,n));
        }
        in.close();
    }

    private static String getStringWithResult(int a, int b, int n){
        int[] results = getResults(a,b,n);
        String finalStringResult="";
        if (results.length>0){
            finalStringResult=String.valueOf(results[0]);
        }
        if (results.length>1){
            for (int i = 1; i < results.length ; i++) {
                finalStringResult=finalStringResult.concat(" "+results[i]);
            }
        }
        return finalStringResult;
    }

    private static int[] getResults(int a, int b, int n){
        int[] results = new int[n];
        int lastResult=0;
        for (int i=1;i<=n;i++){
            int tempResult = a+lastResult+(int)Math.pow(2,i-1)*b;
            lastResult = tempResult-a;
            results[i-1] = tempResult;
        }
        return results;
    }
}
