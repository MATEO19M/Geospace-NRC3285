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
        double[] x;
        double endAngle = 0;
        double[] y;
        double distance = 0;
        double[] x1;
        double[] y1;
        double[] x2;
        double[] y2;
        double azimut = 0;
        double angle;
        double X = 0;
        double Y = 0;

        do {
            option = printConversionMenu();
            option = input.nextInt();

            switch (option) {
                case 1:
                    int totalOfRepetitionTimes = 0;
                    System.out.print(" Enter the number of times you want to perform menu 1 -> ");
                    totalOfRepetitionTimes = input.nextInt();
                    x = new double[totalOfRepetitionTimes];
                    y = new double[totalOfRepetitionTimes];

                    printRectangularToGeographicCoordinates(totalOfRepetitionTimes, input, x, y);

                    transformRectangularToGeographicCoordinates(totalOfRepetitionTimes, x, y, endAngle);

                    break;

                case 2:
                    System.out.print("Enter Distance: ");
                    distance = input.nextInt();
                    readTheGeographicCoordinatesMenu();
                    System.out.print("Enter the option: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:

                            System.out.print("Enter Angle:");
                            angle = input.nextInt();
                            transformCoordinateNorthToEast(distance, X, Y, angle);
                            break;
                        case 2:
                            System.out.print("Enter Angle:");
                            angle = input.nextInt();
                            transformGeographicCoordinatesNorthToWest(distance, X, Y, angle);
                            break;

                        case 3:
                            System.out.print("Enter Angle:");
                            angle = input.nextInt();
                            transformGeographicCoordinatesSouthToWest(distance, X, Y, angle);
                            break;

                        case 4:
                            System.out.print("Enter the angle:");
                            angle = input.nextInt();
                            transformGeographicCoordinatesSouthToEast(distance, X, Y, angle);
                            break;
                    }
                    break;
                case 3:
                    int totalRepetitions = 0;
                    System.out.print(" Enter the number of times you want to perform menu 1 -> ");
                    totalRepetitions = input.nextInt();
                    for (int i = 0; i < totalRepetitions; i++) {
                        x1 = new double[totalRepetitions];
                        y1 = new double[totalRepetitions];
                        x2 = new double[totalRepetitions];
                        y2 = new double[totalRepetitions];
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

                        azimut = transformGeographicCoordinatesToPolar(x1, i, y1, x2, y2, distance);
                        // Transformation from decimals to sexagecimals
                        printDecimalToSexagecimalTransformation(azimut, distance);
                        break;
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

    private static int printConversionMenu() {

        System.out.print("                   UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)\n\n       ");
        System.out.print(" CAREER: Engineering in Geospatial Technologies\n ");
        System.out.print("PROGRAMMING FUNDAMENTALS \n");
        System.out.println(" NRC:3285");
        System.out.println(" ========= Coordinate Transformation =======");
        System.out.println("1.Transformation from Rectangular to Geographic Coordinates ");
        System.out.println("2.Transformation of Geographic Coordinates to Rectangular ");
        System.out.println("3.Transformation of Geographic Coordinates to Rectangular to Polar");
        System.out.println("0.Exit");
        System.out.print("Enter your menu option --> ");
        return 0;

    }

    private static int printRectangularToGeographicCoordinates(int totalOftotalOfRepetitionTime, Scanner input, double[] x, double[] y) {
        for (int j = 0; j < totalOftotalOfRepetitionTime; j++) {

            System.out.print("Enter rectangular coordinate x: ");
            x[j] = input.nextInt();
            System.out.print("Enter rectangular coordinate y: ");
            y[j] = input.nextInt();
        }
        return 0;
    }

    private static void transformRectangularToGeographicCoordinates(int totalOfRepetitionTime, double[] x, double[] y, double endAngle) {

        for (int j = 0; j < totalOfRepetitionTime; j++) {

            double p1 = x[j] * x[j];
            double p2 = y[j] * y[j];
            double p3 = p1 + p2;
            double angleInDegrees = Math.atan(y[j] / x[j]);
            double angle = Math.toDegrees(angleInDegrees);

            if (x[j] > 0 && y[j] > 0) {
                endAngle = (90 - angle);
                System.out.println("The coordinate is:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", endAngle) + "ºE");
            } else if (x[j] < 0 && y[j] > 0) {
                endAngle = (90 + angle);
                System.out.println("The coordinate is:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", endAngle) + "ºO");
            } else if (x[j] < 0 && y[j] < 0) {
                endAngle = (90 - angle);
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", endAngle) + "ºO");
            } else if (x[j] > 0 && y[j] < 0) {
                endAngle = (90 + angle);
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", endAngle) + "ºE");
                break;
            }
        }
    }

    private static void readTheGeographicCoordinatesMenu() {

        System.out.println(" ======= Choose Orientation =======");
        System.out.println("1. North-East (NE) ");
        System.out.println("2. North-West (NO) ");
        System.out.println("3. South-West (SO) ");
        System.out.println("4. South-East (SE) ");
    }

    private static void transformCoordinateNorthToEast(double distance, double X, double Y, double angle) {

        double radianAngle = Math.toRadians(angle);
        double radianAngleX = Math.sin(radianAngle);
        double radianAngleY = Math.cos(radianAngle);
        X = distance * radianAngleX;
        Y = distance * radianAngleY;
        System.out.println("The coordinate is:  X=" + String.format("%.2f", X) + ", Y=" + String.format("%.2f", Y));
    }

    private static void transformGeographicCoordinatesNorthToWest(double distance, double X, double Y, double angle) {

        double radianAngle = Math.toRadians(angle);
        double radianAngleX = Math.sin(radianAngle);
        double radianAngleY = Math.cos(radianAngle);
        X = distance * radianAngleX;
        Y = distance * radianAngleY;
        System.out.println("The coordinate is:  X=-" + String.format("%.2f", X) + ", Y=" + String.format("%.2f", Y));
    }

    private static void transformGeographicCoordinatesSouthToWest(double distance, double X, double Y, double angle) {

        double radianAngle = Math.toRadians(angle);
        double radianAngleX = Math.sin(radianAngle);
        double radianAngleY = Math.cos(radianAngle);
        X = distance * radianAngleX;
        Y = distance * radianAngleY;
        System.out.println("The coordinate is:  X=-" + String.format("%.2f", X) + ", Y=-" + String.format("%.2f", Y));
    }

    private static void transformGeographicCoordinatesSouthToEast(double distance, double X, double Y, double angle) {

        double radianAngle = Math.toRadians(angle);
        double radianAngleX = Math.sin(radianAngle);
        double radianAngleY = Math.cos(radianAngle);
        X = distance * radianAngleX;
        Y = distance * radianAngleY;
        System.out.println("The coordinate is:  X=" + String.format("%.2f", X) + ", Y=-" + String.format("%.2f", Y));

    }

    public static double transformGeographicCoordinatesToPolar(double[] x1, int i, double[] y1, double[] x2, double[] y2, double distance) { //Caty
        double variationX;
        double variationY;
        double azimut;

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

    public static void printDecimalToSexagecimalTransformation(double azimut, double distance) {
        int degrees = (int) azimut;
        double fractionalDegrees = azimut - degrees;
        double minutesWithFraction = 60 * fractionalDegrees;
        int minutes = (int) minutesWithFraction;
        double fractionalMinutes = minutesWithFraction - minutes;
        double secondsWithFraction = 60 * fractionalMinutes;
        int seconds = (int) Math.round(secondsWithFraction);
        System.out.println("The polar coordinate is: " + String.format("%.2f", distance) + ", " + degrees + "°" + minutes + "'" + seconds + "'' ");
    }

}
