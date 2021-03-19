package com.amigoscode.methodprograms;

public class TestMethods {// Test Methods is the class name

    public static void printHello() {   // printHello is the method name with zero parameters and void as Returntype (No Return Type)
        System.out.println("Hello");
    }

    public static String printElder(String husband, String wife) { //printElder is the method name and String husband,String wife are parameters and void as Returntype(No Return Type)
        System.out.println("Husband is elder with name" + husband);
        System.out.println("Husband is elder with name" + " husband");

        System.out.println("Husband is elder with name" + " husband");
        System.out.println("Husband is elder with name" + " husband");
        System.out.println("Husband is elder with name" + " husband"); System.out.println("Husband is elder with name" + " husband");
        System.out.println("Husband is elder with name" + " husband");
        System.out.println("Husband is elder with name" + " husband"); System.out.println("Husband is elder with name" + " husband");

        return husband;
    }

    public static String getHusbandName(String husband, String wife) { //getHusbandName is the medthod name and String husband and String wife are parameters and String is Return type
        return husband;
    }

    public static String getWifeName(String husband, String wife) { //getWifeName is the method name and String husband and String wife are parameters and String is Return type
        return wife;
    }
    public static String anyStringToUppercase(String anyString){ // anyStringToUppercase is the method name and String hello is parameter     and String is the Return type)
        return anyString.toUpperCase();
    }
}
