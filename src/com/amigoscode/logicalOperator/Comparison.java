package com.amigoscode.logicalOperator;

public class Comparison {
    public int testVarible = 30;

    public static void main(String[] args) {
        //this allows us to compare values like integers,so on,comparison operator(>,<,==,!=,<=)
        final int pen = 5;
        int pencil = 10;
        System.out.println("Comparision main method");
        System.out.println(pen != pencil);
        int madhuriage = 25;
        int naveenage = 29;
        System.out.println(madhuriage > naveenage);
        boolean ismadhuriAgegreaterThanNav = (madhuriage > naveenage);
        System.out.println(ismadhuriAgegreaterThanNav);
    }
    public void testMethod(){
        System.out .println(testVarible);
    }
}
