package com.amigoscode.logicalOperator;


public class logicl {
    public static void main(String[] args) {
        // logical operators &&,||
        boolean madhuIsGood = true;
        boolean naveenIsAngry = true;
        System.out.println(madhuIsGood && naveenIsAngry);
        System.out.println(!madhuIsGood || naveenIsAngry);
        System.out.println(!madhuIsGood || !naveenIsAngry);
        String name = "Madhuri";
        System.out.println(10>5 || 5< 2 && (madhuIsGood) && name.contains("d"));
    }
}