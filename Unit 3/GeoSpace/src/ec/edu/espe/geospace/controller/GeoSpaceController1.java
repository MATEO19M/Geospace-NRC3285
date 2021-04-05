/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.controller;

import ec.edu.espe.geospace.model.GeoSpace1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Pc
 */
public class GeoSpaceController1 {
   public double transformRectangularToGeographicCoordinates(double x, double y, double c) {

        double p1 = x * x;
        double p2 = y * y;
        double p3 = p1 + p2;
        c = Math.sqrt(p3);
        return c;
    }

    public double calculateAngle1(double x, double y, double angleF1) {

        double angleC = Math.atan(y / x);
        double angle = Math.toDegrees(angleC);
        angleF1 = 90 - angle;
           
        return angleF1;
}
public double calculateAngle2(double x, double y,double angleF2 ){
    
            double angleC = Math.atan(y / x);
            double angle = Math.toDegrees(angleC);
          
            angleF2 = 90 + angle ;
           
            
        return angleF2;
}

    public void saveRectangularToGeographicCoordinates(GeoSpace1 geoSpace) {
        String Data =geoSpace.getNumberOfTransform()+ ","+ geoSpace.getRectangulaCoordinateX()+ "," + geoSpace.getRectangulaCoordinateY()+ "," + geoSpace.getResult();
        FileManager.save(Data, "Rectangular To Geographic Coordinates");
    }

    public DefaultTableModel readRectangularToGeographicCoordinates() throws FileNotFoundException {
        Vector polar = new Vector();
        polar.addElement("Number of transformation");
        polar.addElement("Coordinate X");
        polar.addElement("Coordinate Y");
        polar.addElement("Result");
        
      
        DefaultTableModel table = new DefaultTableModel(polar, 0);

        try {
            FileReader fr = new FileReader("Rectangular To Geographic Coordinates.csv");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d = br.readLine()) != null) {
                StringTokenizer data = new StringTokenizer(d, ",");
                Vector x = new Vector();
                while (data.hasMoreTokens()) {
                    x.addElement(data.nextToken());
                }
                table.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return table;
    }

    public void findRectangularToGeographicCoordinates(String name) {
        String projectsName = name;
        try {
            BufferedReader read = new BufferedReader(new FileReader("Rectangular To Geographic Coordinates.csv"));
            String line = "";
            while ((line = read.readLine()) != null) {

                if (line.indexOf(projectsName) != -1) {
                    System.out.println("se encontro el registro" + line);
                }
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
         public int findCoordinate(int x, int[] elements){
          int i;
        int n = elements.length;
        for (i = 0; i < n; i++){
            if (elements[i] == x){
                return i;
            }
        }
        return -1;
    }
}
    
    

