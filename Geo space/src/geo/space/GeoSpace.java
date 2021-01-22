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
    Scanner input = new Scanner (System.in);
        boolean mainLoop = true; 
         int option;
           do{
               
      System.out.print("                   UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)\n\n       " );
      System.out.print(" CAREER: Engineering in Geospatial Technologies\n ");
      System.out.print("PROGRAMMING FUNDAMENTALS \n");
      System.out.print("INTEGRANTS:  LUJE CATHERINE,  MARIÑO KERLY , MARTINEZ MATEO, OCHOA ERICK\n");
      System.out.println( " NRC:3285");
      
       System.out.println( "DISTANCE FROM THE MAIN CITIES OF ECUADOR");
       
      System.out.print("1. -> DISTANCE FROM QUITO TO GUAYAQUIL \n");
      System.out.print("2. -> DISTANCE FROM QUITO TO CUENCA \n" );
      System.out.print("3. -> DISTANCE FROM QUITO TO MACHALA \n");
      System.out.print("4. -> DISTANCE FROM MANTA TO QUITO \n");
      System.out.print("5. -> DISTANCE FROM RIOBAMBA TO QUITO \n" );
      System.out.print("6. -> DISTANCE FROM QUITO TO ESMERALDAS \n");
      System.out.print("7. -> DISTANCE FROM IBARRA TO QUITO \n");
      
        System.out.print("8. -> Exit \n");
      
      System.out.print("Enter your menu option --> ");
        option = input.nextInt();
        
      switch (option){
          case 1:
              System.out.println("265 km");
          break;
          case 2:
              System.out.println("300  km");
          break;
          case 3:
              System.out.println("371  km");
          break;
          case 4:
              System.out.println("257 km ");
          break;
          case 5:
              System.out.println("160 km");
          break;
          case 6:
              System.out.println("182 km");
          break;
          case 7:
              System.out.println("78 km");
          break;
          case 8:
              System.out.println(" Exit ");
                    System.exit(0);
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                    
                }
                } while (option != 8);
    }
    
}
