package com.amigoscode;

public class Enhancedforloop {
    public static void main(String[] args) {
        int[] numbers = {2,0,1,4,100,4,90,78,77};

        for (int i=0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        System.out.println("Enhanced for loop");
        for(int number : numbers) {
            System.out.println(number);
        }
    }

}
