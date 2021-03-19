package com.amigoscode;

public class cont {
    public static void main(String[] args) {
        String[]names ={"madhu","nav","sonu","chintu"};
        for(String name:names) {
            if(name.startsWith("n")){
                continue;

            }
            System.out.println(name);
        }

    }
}
