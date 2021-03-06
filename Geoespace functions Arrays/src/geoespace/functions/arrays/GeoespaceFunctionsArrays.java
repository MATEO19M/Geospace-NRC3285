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
        double angleF = 0;
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
                    int totalOf = 0;
                    System.out.print(" Enter the number of times you want to perform menu 1 -> ");
                    totalOf = input.nextInt();
                    x = new double[totalOf];
                    y = new double[totalOf];

                    printRectangularToGeographicCoordinates(totalOf, input, x, y);

                    transformRectangularToGeographicCoordinates(totalOf, x, y, angleF);

                    break;

                case 2:
                    System.out.println("Enter Distance:");
                    distance = input.nextInt();
                    showGeographicCoordinatesMenu();
                    System.out.println("Enter the option");
                    option = input.nextInt();

                    switch (option) {
                        case 1:

                            System.out.println("Enter Angle:");
                            angle = input.nextInt();
                            transformCoordinateNorthToEast(distance, X, Y, angle);
                            break;
                    }
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
        System.out.println("Enter your menu option --> ");
        return 0;

    }

    private static int printRectangularToGeographicCoordinates(int totalOf, Scanner input, double[] x, double[] y) {
        for (int j = 0; j < totalOf; j++) {

            System.out.println("Enter rectangular coordinate x: ");
            x[j] = input.nextInt();
            System.out.println("Enter rectangular coordinate y: ");
            y[j] = input.nextInt();
        }
        return 0;
    }

    private static void transformRectangularToGeographicCoordinates(int totalOf, double[] x, double[] y, double angleF) {

        for (int j = 0; j < totalOf; j++) {

            double p1 = x[j] * x[j];
            double p2 = y[j] * y[j];
            double p3 = p1 + p2;
            double angleC = Math.atan(y[j] / x[j]);
            double angle = Math.toDegrees(angleC);

            if (x[j] > 0 && y[j] > 0) {
                angleF = (90 - angle);
                System.out.println("The coordinate is:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºE");
            } else if (x[j] < 0 && y[j] > 0) {
                angleF = (90 + angle);
                System.out.println("The coordinate is:  " + String.format("%.2f", Math.sqrt(p3)) + ", N" + String.format("%.2f", angleF) + "ºO");
            } else if (x[j] < 0 && y[j] < 0) {
                angleF = (90 - angle);
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºO");
            } else if (x[j] > 0 && y[j] < 0) {
                angleF = (90 + angle);
                System.out.println("The coordinate is :  " + String.format("%.2f", Math.sqrt(p3)) + ", S" + String.format("%.2f", angleF) + "ºE");
                break;
            }
        }
    }

    private static void showGeographicCoordinatesMenu() {

        System.out.println(" ======= Choose Orientation =======");
        System.out.println("1. North-East (NE) ");
        System.out.println("2. North-West (NO) ");
        System.out.println("3. South-West (SO) ");
        System.out.println("4. South-East (SE) ");
    }

    private static void transformCoordinateNorthToEast(double distance, double X, double Y, double angle) {

        double angler = Math.toRadians(angle);
        double anglerx = Math.sin(angler);
        double anglery = Math.cos(angler);
        X = distance * anglerx;
        Y = distance * anglery;
        System.out.println("The coordinate is:  X=" + String.format("%.2f", X) + ", Y=" + String.format("%.2f", Y));
    }
}
