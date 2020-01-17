package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DistanceConverter metr = new DistanceConverter();
        DistanceConverter mile = new DistanceConverter();
        DistanceConverter centimeter = new DistanceConverter();
        DistanceConverter inch = new DistanceConverter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the mile you want to convert meter");
        int distance1 = scanner.nextInt();
        mile.setMile(distance1);
        mile.convertMilesToMeters();

        System.out.println("Please enter the meter you want to convert miles");
        int distance2 = scanner.nextInt();
        metr.setMeter(distance2);
        metr.convertMetersToMiles();

        System.out.println("Please enter the centimeter you want to convert inch");
        int distance3 = scanner.nextInt();
        centimeter.setCentimeter(distance3);
        centimeter.convertCentimeterToInches();

        System.out.println("Please enter the inch you want to convert centimeters");
        int distance4 = scanner.nextInt();
        inch.setInch(distance4);
        inch.convertInchesToCentimeters();
    }
}
