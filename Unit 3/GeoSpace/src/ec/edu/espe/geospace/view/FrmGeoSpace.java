/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.view;

import ec.edu.espe.geospace.controller.GeoSpaceController;
import ec.edu.espe.geospace.model.GeoSpace;
import static java.awt.PageAttributes.MediaType.C;
import java.io.FileNotFoundException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author User
 */
public class FrmGeoSpace extends javax.swing.JFrame {

    /**
     * Creates new form FrmGeoSpace
     */
    public FrmGeoSpace() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        txtAzimutResult = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cmbResult2 = new javax.swing.JButton();
        btnAzimut = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        txtResult2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCoordinateY2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRectangularCoordinateX = new javax.swing.JTextField();
        txtRectangularCoordinateY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAngle = new javax.swing.JTextField();
        cmbOptions = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtDistance = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtCoordinateX1 = new javax.swing.JTextField();
        txtCoordinateY1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCoordinatex2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblCoordinatesPolar = new javax.swing.JTable();
        btnShowPolar = new javax.swing.JButton();
        btnFindCoordinate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCoordinateName = new javax.swing.JTextField();
        btnCoordinatePolar = new javax.swing.JButton();
        txtCoordinatePolar = new javax.swing.JTextField();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Coordinate B");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Coordinate A");

        cmbResult2.setText("Result ");

        btnAzimut.setText("Azimut");
        btnAzimut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAzimutActionPerformed(evt);
            }
        });

        jButton3.setText("Result ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("1. Rectangular to Geographic Coordinates");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("2.Geographic Coordinates to Rectangular");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("3. Rectangular to Polar coordinates");

        jLabel5.setText("Rectangular coordinate x:");

        jLabel6.setText("Rectangular coordinate y:");

        jLabel7.setText("Distance");

        cmbOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. North-East (NE) ", "2. North-West (NO) ", "3. South-West (SO) ", "4. South-East (SE)" }));

        jLabel8.setText("Angle");

        jLabel9.setText("Rectangular coordinate x:");

        jLabel10.setText("Rectangular coordinate y:");

        jLabel11.setText("Rectangular coordinate x:");

        jLabel12.setText("Rectangular coordinate y:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("                    UNIVERSIDAD DE LAS FUERZAS ARMADAS (ESPE)    ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Engineering in Geospatial Technologies ");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel17.setText("TRANSFORMATION OF COORDINATES");

        tblCoordinatesPolar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Coordinate name", "Coordinate X1", "Coordinate Y1", "Coordinate X2", "Coordinate Y2", "Result"
            }
        ));
        jScrollPane5.setViewportView(tblCoordinatesPolar);
        if (tblCoordinatesPolar.getColumnModel().getColumnCount() > 0) {
            tblCoordinatesPolar.getColumnModel().getColumn(0).setResizable(false);
            tblCoordinatesPolar.getColumnModel().getColumn(1).setResizable(false);
        }

        btnShowPolar.setText("Show ");
        btnShowPolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPolarActionPerformed(evt);
            }
        });

        btnFindCoordinate.setText("Find a coordinate");
        btnFindCoordinate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindCoordinateActionPerformed(evt);
            }
        });

        jLabel1.setText("Coordinate name");

        btnCoordinatePolar.setText("Coordinate Polar");
        btnCoordinatePolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoordinatePolarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(282, 282, 282))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRectangularCoordinateX, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRectangularCoordinateY, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(30, 30, 30)
                                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbResult2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtResult2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(58, 58, 58)
                                            .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoordinatex2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoordinateY2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel10))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCoordinateY1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAzimut)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAzimutResult, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel9))
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCoordinateX1)
                                            .addComponent(txtCoordinateName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCoordinatePolar)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCoordinatePolar)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnShowPolar)
                                        .addGap(58, 58, 58)
                                        .addComponent(btnFindCoordinate)
                                        .addGap(301, 301, 301))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(560, 560, 560)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnShowPolar)
                            .addComponent(btnFindCoordinate))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRectangularCoordinateX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtRectangularCoordinateY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAngle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbResult2)
                            .addComponent(txtResult2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCoordinateName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCoordinateX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCoordinateY1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtCoordinatex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCoordinateY2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAzimut)
                            .addComponent(txtAzimutResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCoordinatePolar)
                            .addComponent(txtCoordinatePolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAzimutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAzimutActionPerformed
        GeoSpace geoSpace;
        String coordinateName;
        double[] integers;
        double azimutResult;
        double azimut = 0;
        double variationX = 0;
        double variationY = 0;
        int coordinatePolar = 0;
        String transformation = "";
        Vector polar = new Vector();
        integers = new double[4];
        

        coordinateName = txtCoordinateName.getText();
        integers[0] = Integer.parseInt(txtCoordinateX1.getText());
        integers[1] = Integer.parseInt(txtCoordinateY1.getText());
        integers[2] = Integer.parseInt(txtCoordinatex2.getText());
        integers[3] = Integer.parseInt(txtCoordinateY2.getText());
        coordinatePolar=Integer.parseInt(txtCoordinatePolar.getText());

        GeoSpaceController geoSpaceController = new GeoSpaceController();

        variationX = integers[2] - integers[0];
        variationY = integers[3] - integers[1];
        azimut = Math.atan(variationX / variationY);
        azimut = azimut + 360;
        azimutResult = geoSpaceController.transformGeographicCoordinatesToPolar(integers[0], integers[1], integers[2], integers[3]);

        if (variationX > 0 & variationY >= 0) {
            transformation = "" + String.format("%.2f", azimutResult);
        }
        if (variationX > 0 & variationY <= 0) {
            transformation = "" + String.format("%.2f", azimutResult);
        }
        if (variationX < 0 & variationY > 0) {
            azimut = azimut - 180;
            transformation = "" + String.format("%.2f", azimutResult);
        }
        if (variationX < 0 & variationY < 0) {
            azimut = azimut + 180;
            transformation = "" + String.format("%.2f", azimutResult);
        }
        txtAzimutResult.setText(transformation);

        geoSpace = new GeoSpace(coordinateName, integers[0], integers[1], integers[2], integers[3], azimutResult, coordinatePolar);
        geoSpaceController.saveRectangularToPolarCoordinates(geoSpace);
        DefaultTableModel table;
        polar.addElement("Coordinate name");
        polar.addElement("Coordinate X1");
        polar.addElement("Coordinate Y1");
        polar.addElement("Coordinate X2");
        polar.addElement("Coordinate Y2");
        polar.addElement("Azimut");
        polar.addElement("Coordinate Polar");


    }//GEN-LAST:event_btnAzimutActionPerformed

    private void btnShowPolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPolarActionPerformed
        try {
            GeoSpaceController geoSpaceController = new GeoSpaceController();
            tblCoordinatesPolar.setModel(geoSpaceController.readRectangularToPolarCoordinates());
        } catch (FileNotFoundException e) {
            Logger.getLogger(FrmGeoSpace.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnShowPolarActionPerformed

    private void btnFindCoordinateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindCoordinateActionPerformed


    }//GEN-LAST:event_btnFindCoordinateActionPerformed

    private void btnCoordinatePolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoordinatePolarActionPerformed
        GeoSpace geoSpace;
        double[] integers;
        double azimutResult;
        int coordinatePolar = 0;
        String transformation = "";
        integers = new double[4];


        integers[0] = Integer.parseInt(txtCoordinateX1.getText());
        integers[1] = Integer.parseInt(txtCoordinateY1.getText());
        integers[2] = Integer.parseInt(txtCoordinatex2.getText());
        integers[3] = Integer.parseInt(txtCoordinateY2.getText());

        GeoSpaceController geoSpaceController = new GeoSpaceController();

        String transformationToSexagesimals;

        azimutResult = geoSpaceController.transformGeographicCoordinatesToPolar(integers[0], integers[1], integers[2], integers[3]);
        int degrees = (int) azimutResult;
        double fractionalDegrees = azimutResult - degrees;
        double minutesWithFraction = 60 * fractionalDegrees;
        int minutes = (int) minutesWithFraction;
        double fractionalMinutes = minutesWithFraction - minutes;
        double secondsWithFraction = 60 * fractionalMinutes;
        int seconds = (int) Math.round(secondsWithFraction);
        transformationToSexagesimals = degrees + "°" + minutes + "'" + seconds + "'' ";
        txtCoordinatePolar.setText(transformationToSexagesimals);

    }//GEN-LAST:event_btnCoordinatePolarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGeoSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGeoSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGeoSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGeoSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGeoSpace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAzimut;
    private javax.swing.JButton btnCoordinatePolar;
    private javax.swing.JButton btnFindCoordinate;
    private javax.swing.JButton btnShowPolar;
    private javax.swing.JComboBox<String> cmbOptions;
    private javax.swing.JButton cmbResult2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable tblCoordinatesPolar;
    private javax.swing.JTextField txtAngle;
    private javax.swing.JTextField txtAzimutResult;
    private javax.swing.JTextField txtCoordinateName;
    private javax.swing.JTextField txtCoordinatePolar;
    private javax.swing.JTextField txtCoordinateX1;
    private javax.swing.JTextField txtCoordinateY1;
    private javax.swing.JTextField txtCoordinateY2;
    private javax.swing.JTextField txtCoordinatex2;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtRectangularCoordinateX;
    private javax.swing.JTextField txtRectangularCoordinateY;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtResult2;
    // End of variables declaration//GEN-END:variables
}