/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.controller;

import ec.edu.espe.geospace.model.GeoSpace2;
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
 * @author USER
 */
public class GeoSpaceController2 {
    
    public void saveGeographicCoordinatesToRectangular(GeoSpace2 geoSpace2){
        String Data = geoSpace2.getDistance() + "," + geoSpace2.getOrientation() + "," + geoSpace2.getAngle() + "," + geoSpace2.getX() + "," + geoSpace2.getY();
        FileManager.save(Data, "Geographic Coordinates to Rectangular");
    }
    
    public DefaultTableModel readGeographicCoordinatesToRectangular() throws FileNotFoundException {
        Vector rectangular = new Vector();
        rectangular.addElement("Distance");
        rectangular.addElement("Orientation");
        rectangular.addElement("Angle");
        rectangular.addElement("Coordinate X");
        rectangular.addElement("Coordinate Y");


        DefaultTableModel table = new DefaultTableModel(rectangular, 0);

        try {
            FileReader fr = new FileReader("Geographic Coordinates to Rectangular.csv");
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
    public void findGeographicCoordinatesToRectangular(String name) {
        String coordinateName = name;
        try {
            BufferedReader read = new BufferedReader(new FileReader("Geographic Coordinates to Rectangular.csv"));
            String line = "";
            while ((line = read.readLine()) != null) {

                if (line.indexOf(coordinateName) != -1) {
                    System.out.println("se encontro el registro" + line);
                }
            }
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
    public int findCoordinate2(int[] elements, int x){
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
