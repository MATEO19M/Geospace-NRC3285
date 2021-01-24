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
