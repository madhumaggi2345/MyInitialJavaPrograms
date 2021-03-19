package com.amigoscode;

public class switchstatements {
    public static void main(String[] args) {
        String gender ="dy";
        switch (gender){
            case "FEMALE":
                System.out.println("i am a female");
                break;
            case "MALE":
                System.out.println("i am a male");
                break;
            case "PREFER NOT SAY":
                System.out.println("prefer not say");
                break;
            default:
                System.out.println("Unknown gender");
                break;
        }
    }
}
