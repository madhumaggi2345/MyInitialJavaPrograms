package com.amigoscode;

import java.time.LocalDate;

public class passportClass {
    public static void main(String[] args){
        //classes and objects,here object and print values
        Passport usPassport = new Passport("232456", "Us",LocalDate.of(2026,4,6
        ));
        Passport ukPassport = new Passport("57867", "Uk",LocalDate.of(2038,6,18));
        System.out.println(usPassport.number);
        System.out.println(usPassport.country);
        System.out.println(usPassport.expiryDate);
    }
    //here after closesd brace of psvm,write class nd constructor

    static class Passport{
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country,LocalDate expiryDate){
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;


        }
    }
}
