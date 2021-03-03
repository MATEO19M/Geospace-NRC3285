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

            System.out.print("                   UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)\n\n       ");
            System.out.print(" CAREER: Engineering in Geospatial Technologies\n ");
            System.out.print("PROGRAMMING FUNDAMENTALS \n");
            System.out.println(" NRC:3285");

            System.out.println(" ========= Coordinate Transformation =======");
            System.out.println("1.Transformation from Rectangular to Geographic Coordinates ");
            System.out.println("2.Transformation of Geographic Coordinates to Rectangular ");
            System.out.println("0.Exit");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {
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
                    break;
                case 2:
                    double distance = showGeographicCoordinatesMenu(input);
                    option = input.nextInt();

                    System.out.println(" ====== Choose Orientation ======");
                    System.out.println("1. North-East (NE) ");
                    System.out.println("2. North-West (NO) ");
                    System.out.println("3. South-West (SO) ");
                    System.out.println("4. South-East (SE) ");
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
                    break;
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
}
