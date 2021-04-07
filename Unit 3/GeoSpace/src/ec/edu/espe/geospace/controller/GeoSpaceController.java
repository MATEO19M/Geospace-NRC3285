/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.controller;

import ec.edu.espe.geospace.model.GeoSpace;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author User
 */
public class GeoSpaceController {

    public double transformGeographicCoordinatesToPolar(double x1, double y1, double x2, double y2) { 
        double distance;
        double variationX;
        double variationY;
        double azimut = 0;

        variationX = x2 - x1;
        variationY = y2 - y1;
        distance = Math.sqrt(Math.pow(variationX, 2) + Math.pow(variationY, 2));
        azimut = Math.atan(variationX / variationY);
        azimut = azimut + 360;
        if (variationX > 0 & variationY >= 0) {
        }
        if (variationX > 0 & variationY <= 0) {
        }
        if (variationX < 0 & variationY > 0) {
            azimut = azimut - 180;
        }
        if (variationX < 0 & variationY < 0) {
            azimut = azimut + 180;
        }
        return azimut;

    }

    public void saveRectangularToPolarCoordinates(GeoSpace geoSpace) {
        String Data = geoSpace.getCoordinateName() + "," + geoSpace.getCoordinateX1() + "," + geoSpace.getCoordinateY1() + "," + geoSpace.getCoordinateX2() + "," + geoSpace.getCoordinateY2() + "," + geoSpace.getAzimutResult();
        FileManager.save(Data, "Rectangular to Polar Coordinates");
    }

    public DefaultTableModel readRectangularToPolarCoordinates() throws FileNotFoundException {
        Vector polar = new Vector();
        polar.addElement("Coordinate Name");
        polar.addElement("Coordinate X1");
        polar.addElement("Coordinate Y1");
        polar.addElement("Coordinate X2");
        polar.addElement("Coordinate Y2");
        polar.addElement("Coordinate Polar");

        DefaultTableModel table = new DefaultTableModel(polar, 0);

        try {
            FileReader fr = new FileReader("Rectangular to Polar Coordinates.csv");
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

    public void findRectangularToPolarCoordinates(String name) {
        String coordinateName = name;
        try {
            BufferedReader read = new BufferedReader(new FileReader("Rectangular to Polar Coordinates.csv"));
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
}
