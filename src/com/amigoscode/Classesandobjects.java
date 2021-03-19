package com.amigoscode;

public class Classesandobjects {
    public static void main(String[] args) {
        //classes and objects

        Lens lensone = new Lens("sony", "85mm", true);
        Lens lenstwo = new Lens("sony", "30mm", true);
        Lens lensThree = new Lens("canon", "30-40", true);

        System.out.println("Lens 1");
        System.out.println(lensone.brand);
        System.out.println(lensone.focalLength);
        System.out.println(lensone.isPrime);
        System.out.println();
        System.out.println("Lens 2");
        System.out.println(lenstwo.brand);
        System.out.println(lenstwo.focalLength);
        System.out.println(lenstwo.isPrime);
        System.out.println();
    }
        static class Lens {
            String brand;
            String focalLength;
            Boolean isPrime;

            Lens(String brand, String focalLength, boolean isPrime) {
                this.brand = brand;
                this.focalLength = focalLength;
                this.isPrime = isPrime;
            }
        }
}
