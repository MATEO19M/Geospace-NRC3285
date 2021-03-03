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

                    break;    
                case 2:

                    double d;
                    System.out.println("Enter Distance:");
                    d = input.nextInt();
                    System.out.println(" ====== Choose Orientation ======");
                    System.out.println("1. North-East (NE) ");
                    System.out.println("2. North-West (NO) ");
                    System.out.println("3. South-West (SO) ");
                    System.out.println("4. South-East (SE) ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            double x2;
                            double y2;
                            double ann;
                            System.out.println("Enter Angle:");
                            ann = input.nextInt();
                            double annr = Math.toRadians(ann);
                            double annsrx = Math.sin(annr);
                            double annsry = Math.cos(annr);
                            x2 = d * annsrx;
                            y2 = d * annsry;
                            System.out.println("The coordinate is:  X=" + String.format("%.2f", x2) + ", Y=" + String.format("%.2f", y2));
                            break;
                        case 2:
                            double x3;
                            double y3;
                            double ann1;
                            System.out.println("Enter Angle:");
                            ann1 = input.nextInt();
                            double annr1 = Math.toRadians(ann1);
                            double annsrx1 = Math.sin(annr1);
                            double annsry1 = Math.cos(annr1);
                            x3 = d * annsrx1;
                            y3 = d * annsry1;
                            System.out.println("The coordinate is:  X=-" + String.format("%.2f", x3) + ", Y=" + String.format("%.2f", y3));
                            break;
                        case 3:
                            double x4;
                            double y4;
                            double ann2;
                            System.out.println("Enter Angle:");
                            ann2 = input.nextInt();
                            double annr2 = Math.toRadians(ann2);
                            double annsrx2 = Math.sin(annr2);
                            double annsry2 = Math.cos(annr2);
                            x4 = d * annsrx2;
                            y4 = d * annsry2;
                            System.out.println("The coordinate is:  X=-" + String.format("%.2f", x4) + ", Y=-" + String.format("%.2f", y4));
                            break;

                        case 4:
                            double x5;
                            double y5;
                            double ann3;
                            System.out.println("Enter the angle:");
                            ann3 = input.nextInt();
                            double annr3 = Math.toRadians(ann3);
                            double annsrx3 = Math.sin(annr3);
                            double annsry3 = Math.cos(annr3);
                            x5 = d * annsrx3;
                            y5 = d * annsry3;
                            System.out.println("The coordinate is:  X=" + String.format("%.2f", x5) + ", Y=-" + String.format("%.2f", y5));
                            break;
                    }
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
}

    
          
