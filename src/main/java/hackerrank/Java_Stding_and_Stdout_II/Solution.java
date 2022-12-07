package hackerrank.Java_Stding_and_Stdout_II;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d  = scan.nextDouble();

        //domyslnie scanner czyta pierwsze slowo az do whitespace, wiec trzeba sprawdzać za pomocą metody hasNextLine każde kolejne słowo po spacji, bo input jest dzielony przez spacje
        String s = scan.nextLine();

        if (scan.hasNextLine()){
            s=scan.nextLine();
        }


        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
