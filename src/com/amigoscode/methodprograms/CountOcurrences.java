package com.amigoscode.methodprograms;

import com.amigoscode.logicalOperator.Comparison;

public class CountOcurrences {

    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'B', 'C', 'D', 'D', 'D'};
        //countOccurances(letters,'D');
        System.out.println(countOccurances(letters, 'D'));
        System.out.println("debugging");
        nothing();
        String[] myslist = {"Naveen", "Madhuri", "Laxmana Chary", "Purna", "Deleep", "Nandu"};
        printOcuurences(myslist);
        Comparison testComparision = new Comparison();
        testComparision.testVarible= 100;
        testComparision.testMethod();

        Comparison testComparision2 = new Comparison();
        testComparision2.testMethod();
    }
    public static void nothing() {
        System.out.println("Nothing to print here");
    }

    public static int countOccurances(char[] letters, char searchLetter) {
        int count = 0;
        for (char letter : letters) { // this means for each char letter in letters
            if (letter == searchLetter) {
                count++;
            }
            System.out.println("if is false");
        }
        return count;
    }

    public static void printOcuurences(String[] myslist) {
        for (String x : myslist) {
            if (x == "Madhuri") {
                System.out.println(x);
            }
        }
    }
}
