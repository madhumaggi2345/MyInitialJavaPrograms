package com.amigoscode;

public class break1 {
    public static void main(String[] args) {
        String[]names ={"madhu","nav","chintu","sonu"};
        for (String name:names){
            if(name.equals("chintu")) {
                break;
            }
            System.out.println(name);
        }

    }
}
