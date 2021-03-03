/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geo.space;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GeoSpace {

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
<<<<<<< HEAD
                
                case 1:
                    double x;
                    double y;
                    double r;
                    double angleF;
                    System.out.println("Enter rectangular coordinate x: ");
                    x = input.nextInt();
                    System.out.println("Enter rectangular coordinate y: ");
                    y = input.nextInt();
                    double p1 = x * x;
                    double p2 = y * y;
                    double p3 = p1 + p2;
                    double angleC = Math.atan(y / x);
                    double angle = Math.toDegrees(angleC);
                    if (x > 0 && y > 0) {
                        angleF = (90 - angle);
                        System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºE");
                    } else if (x < 0 && y > 0) {
                        angleF = (90 + angle);
                        System.out.println("The coordinate is   " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºO");
                    } else if (x < 0 && y < 0) {
                        angleF = (90 - angle);
                        System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºO");
                    } else if (x > 0 && y < 0) {
                        angleF = (90 + angle);
                        System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºE");
                    }
=======
                case 1:
                    int totalOf = 0;
                    System.out.print(" Enter the number of times you want to perform menu 1 -> ");
                    totalOf = input.nextInt();
                    double[] x;
                    double angleF = 0;
                    double[] y;
                    double result;
                    x = new double[totalOf];
                    y = new double[totalOf];

                    System.out.println("please enter");
                    printRectangularToGeographicCoordinates(totalOf, input, x, y, angleF);

                    transformRectangularToGeographicCoordinates(totalOf, input, x, y, angleF);

>>>>>>> cbab622dfcc78b36f325414d27dec4eb7042da31
                    break;
                case 2:
                    double distance = showGeographicCoordinatesMenu(input);
                    option = input.nextInt();
                    switch (option) {
                        case 1:
                            transformCoordinateNorthToEast(input, distance);
                            break;
                        case 2:
                            transformGeographicCoordinatesNorthToWest(input, distance);
                            break;

                        case 3:
                            transformGeographicCoordinatesSouthToWest(input, distance);
                            break;

                        case 4:
                            transformGeographicCoordinatesSouthToEast(input, distance);
                            break;
                    }
<<<<<<< HEAD
                    break;

=======
>>>>>>> cbab622dfcc78b36f325414d27dec4eb7042da31
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
<<<<<<< HEAD

                    break;

=======
                    break;
>>>>>>> cbab622dfcc78b36f325414d27dec4eb7042da31
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

    private static int printRectangularToGeographicCoordinates(int totalOf, Scanner input, double[] x, double[] y, double angleF) {
        for (int j = 0; j < totalOf; j++) {

            System.out.println("Enter rectangular coordinate x: ");
            x[j] = input.nextInt();
            System.out.println("Enter rectangular coordinate y: ");
            y[j] = input.nextInt();
        }
        return 0;
    }

    private static void transformRectangularToGeographicCoordinates(int totalOf, Scanner input, double[] x, double[] y, double angleF) {

        for (int j = 0; j < totalOf; j++) {

            double p1 = x[j] * x[j];
            double p2 = y[j] * y[j];
            double p3 = p1 + p2;
            double angleC = Math.atan(y[j] / x[j]);
            double angle = Math.toDegrees(angleC);

            if (x[j] > 0 && y[j] > 0) {
                angleF = (90 - angle);
                input.nextLine();
                System.out.println("La coordenada es:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºE");
            } else if (x[j] < 0 && y[j] > 0) {
                angleF = (90 + angle);
                input.nextLine();
                System.out.println("La coordenada es:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºO");
            } else if (x[j] < 0 && y[j] < 0) {
                angleF = (90 - angle);
                input.nextLine();
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºO");
            } else if (x[j] > 0 && y[j] < 0) {
                angleF = (90 + angle);
                input.nextLine();
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºE");
                break;
            }
        }
    }
<<<<<<< HEAD
    private static double showGeographicCoordinatesMenu(Scanner input) { 
        double d;
        System.out.println("Enter Distance:");
        d = input.nextInt();
        System.out.println(" ======= Choose Orientation =======");
        System.out.println("1. North-East (NE) ");
        System.out.println("2. North-West (NO) ");
        System.out.println("3. South-West (SO) ");
        System.out.println("4. South-East (SE) ");
        return d;
    }   
=======

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
>>>>>>> cbab622dfcc78b36f325414d27dec4eb7042da31
}
