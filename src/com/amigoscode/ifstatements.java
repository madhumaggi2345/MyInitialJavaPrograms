package com.amigoscode;

public class ifstatements {
    public static void main(String[] args) {
        //If statements
        int age = 17;
        //below,inside we pass a boolean exprsn age
        if (age >= 18){
            System.out.println("Hooray...I am an adult");
        }else if(age >=16 && age < 18){
            System.out.println("I am almost an adult");
        }else{
            System.out.println("I am not an adult");
        }

    }
}
