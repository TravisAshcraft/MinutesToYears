package com.company;

public class MinutesToYears {

    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        else{
            long hours = minutes / 60;
            int day = (int) hours / 24;
            int years = day / 365;
            day %= 365;

            System.out.println(minutes + " min = "+ years + " y and "+ day + " d");
        }


    }

}
