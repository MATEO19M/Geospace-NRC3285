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
            case 1:
                    double x;
                    double y;
                    double r;
                    double angleF;
                    System.out.println("Enter rectangular coordinate x: ");
                    x = input.nextInt();
                    System.out.println("Enter rectangular coordinate y: ");
                    y = input.nextInt();
                    double p1 = x*x;
                    double p2 = y*y;
                    double p3 = p1+p2;
                    double angleC = Math.atan(y/x);
                    double angle  = Math.toDegrees(angleC);
                    if (x >0 && y>0){
                    angleF= (90-angle); 
                    System.out.println("The coordinate is :  " + String.format("%.2f",Math.sqrt(p3))+ ", N"+String.format("%.2f",angleF)+ "ºE");
                    }else if(x <0 && y>0){
                    angleF= (90+angle); 
                    System.out.println("The coordinate is   " + String.format("%.2f",Math.sqrt(p3))+ ", N"+String.format("%.2f",angleF)+ "ºO");
                    }else if(x <0 && y<0){
                    angleF= (90-angle); 
                    System.out.println("The coordinate is :  " + String.format("%.2f",Math.sqrt(p3))+ ", S"+String.format("%.2f",angleF)+ "ºO");
                    }else if(x >0 && y<0){
                    angleF= (90+angle); 
                    System.out.println("The coordinate is :  " + String.format("%.2f",Math.sqrt(p3))+ ", S"+String.format("%.2f",angleF)+ "ºE");
                    }
                    break;    
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
                
           case 4:                                                               
                double x5;
                double y5;
                double ann3;
                System.out.println("Ingrese el angulo:");
                ann3 = input.nextInt();
                double annr3 = Math.toRadians(ann3);
                double annsrx3=Math.sin(annr3);
                double annsry3=Math.cos(annr3);
                x5= d *annsrx3; 
                y5=d*annsry3; 
                System.out.println("La coordenada es:  X=" + String.format("%.2f",x5)+", Y=-"+String.format("%.2f",y5));
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
}

          