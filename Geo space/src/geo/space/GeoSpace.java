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
                     
            System.out.print("                   UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)\n\n       " );
            System.out.print(" CAREER: Engineering in Geospatial Technologies\n ");
            System.out.print("PROGRAMMING FUNDAMENTALS \n");
            System.out.println( " NRC:3285");
      
           System.out.println(" ========= Coordinate Transformation =======");
            System.out.println("1.Transformation from Rectangular to Geographic Coordinates ");
            System.out.println("2.Transformation of Geographic Coordinates to Rectangular ");
            System.out.println("0.Exit");
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

           switch (option) { 
               
           }
           case 2:
                    double d;
                    System.out.println("Enter Distance:");
                    d = input.nextInt();
                System.out.println(" ======= Choose Orientation =======");
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
                double annsrx=Math.sin(annr);
                double annsry=Math.cos(annr);
                x2=d*annsrx; 
                y2=d*annsry; 
                System.out.println("The coordinate is:  X=" + String.format("%.2f",x2)+", Y="+String.format("%.2f",y2)); 
                break;