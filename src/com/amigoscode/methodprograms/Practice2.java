package com.amigoscode.methodprograms;

public class Practice2 {
    public static void main(String[] args) {
        String[] peoplenames = {"madhuri", "nav", "sonu", "chintu"};
        System.out.println(Practice2(peoplenames,"madhuri"));



    }

    public static void Practice2(String[] peoplenames){
        for(String x:peoplenames){
            if(x=="Madhuri"){
                System.out.println(x);
            }
        }

    }
}
