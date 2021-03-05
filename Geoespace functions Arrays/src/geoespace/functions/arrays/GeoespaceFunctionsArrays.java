/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geoespace.functions.arrays;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class GeoespaceFunctionsArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {

            option = printConversionMenu(input);

            switch (option) {

                case 3:
                    int total = 0;
                    System.out.print(" Enter the number of times you want to perform menu 1 -> ");
                    total = input.nextInt();
                    for (int i = 0; i < total; i++) {
                        double dis;
                        double[] x1;
                        double[] y1;
                        double[] x2;
                        double[] y2;
                        double variationX;
                        double variationY;
                        double azimut = 0;
                        x1 = new double[total];

                        x1 = new double[total];
                        y1 = new double[total];
                        x2 = new double[total];
                        y2 = new double[total];

                        azimut = transformGeographicCoordinatesToPolar(x1, i, input, y1, x2, y2);

                        // Transformation from decimals to sexagecimals
                        printDecimalToSexagecimalTransformation(azimut);
                    }

                    break;

                case 0:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option \n\n\n");
                    break;
            }

        } while (option != 0);
    }

    private static int printConversionMenu(Scanner input) {
        int option;
        System.out.print("                   UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)\n\n       ");
        System.out.print(" CAREER: Engineering in Geospatial Technologies\n ");
        System.out.print("PROGRAMMING FUNDAMENTALS \n");
        System.out.println(" NRC:3285");
        System.out.println(" ========= Coordinate Transformation =======");
        System.out.println("1.Transformation from Rectangular to Geographic Coordinates ");
        System.out.println("2.Transformation of Geographic Coordinates to Rectangular ");
        System.out.println("3.Transformation of Geographic Coordinates to Rectangular to Polar");
        System.out.println("0.Exit");
        System.out.println("Enter your menu option --> ");
        option = input.nextInt();
        return option;
    }

    public static double transformGeographicCoordinatesToPolar(double[] x1, int i, Scanner input, double[] y1, double[] x2, double[] y2) {
        double variationX;
        double variationY;
        double distance;
        double azimut;
        System.out.println("--Coordinate A--");
        System.out.print("Enter rectangular coordinate x: ");
        x1[i] = input.nextDouble();
        System.out.print("Enter rectangular coordinate y: ");
        y1[i] = input.nextDouble();
        System.out.println("--Coordinate B--");
        System.out.print("Enter rectangular coordinate x: ");
        x2[i] = input.nextDouble();
        System.out.print("Enter rectangular coordinate y: ");
        y2[i] = input.nextDouble();
        variationX = x2[i] - x1[i];
        variationY = y2[i] - y1[i];
        distance = Math.sqrt(Math.pow(variationX, 2) + Math.pow(variationY, 2));
        azimut = Math.atan(variationX / variationY);
        azimut = azimut + 360;
        if (variationX > 0 & variationY > 0) {
            System.out.println("The azimuth is: " + String.format("%.2f", azimut));
        }
        if (variationX > 0 & variationY < 0) {
            System.out.println("The azimuth is: " + String.format("%.2f", azimut));
        }
        if (variationX < 0 & variationY > 0) {
            azimut = azimut - 180;
            System.out.println("The azimuth is: " + String.format("%.2f", azimut));
        }
        if (variationX < 0 & variationY < 0) {
            azimut = azimut + 180;
            System.out.println("The azimuth is: " + String.format("%.2f", azimut));
        }
        return azimut;

    }

    public static void printDecimalToSexagecimalTransformation(double azimut) {
        int degrees = (int) azimut;
        double fractionalDegrees = azimut - degrees;
        double minutesWithFraction = 60 * fractionalDegrees;
        int minutes = (int) minutesWithFraction;
        double fractionalMinutes = minutesWithFraction - minutes;
        double secondsWithFraction = 60 * fractionalMinutes;
        int seconds = (int) Math.round(secondsWithFraction);
        System.out.println("The polar coordinate is: " + degrees + "°" + minutes + "'" + seconds + "'' ");
    }
}
