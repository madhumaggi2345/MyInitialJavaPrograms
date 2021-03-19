package com.amigoscode;

import com.amigoscode.methodprograms.TestMethods;

public class _Array1 {
    public static void main(String[] args) {
        TestMethods.printHello();

        String elder = TestMethods.printElder("Naveen", "Madhuri");
        System.out.println(elder);

        String Name = TestMethods.getHusbandName("laxmana", "purna");
        System.out.println(Name);

        String Name1 = TestMethods.getHusbandName("nav", "mad");
        System.out.println(Name1);
        TestMethods.getHusbandName("nav", "mad");
        System.out.println(TestMethods.getHusbandName("nav", "mad"));

        System.out.println(TestMethods.getWifeName("Ravi", "Uma"));

        System.out.println("sonu".toUpperCase());
        System.out.println(TestMethods.anyStringToUppercase("Sonu"));

    }

}




