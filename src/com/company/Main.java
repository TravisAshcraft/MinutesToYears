package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    MinutesToYears minutesToYears = new MinutesToYears();
        System.out.println("Give me a amount of minutes to calculate: ");
        long minutesToCalc = scanner.nextLong();
        minutesToYears.printYearsAndDays(minutesToCalc);
    }
}
