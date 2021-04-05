/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.model;

/**
 *
 * @author User
 */
public class GeoSpace {

    private double Distance;
    private double Angle;
    private String Orientation;
    private int coordinateRectangular;

    public GeoSpace(double Distance, double Angle, String Orientation, int coordinateRectangular) {
        this.Distance = Distance;
        this.Angle = Angle;
        this.Orientation = Orientation;
        this.coordinateRectangular = coordinateRectangular;
    }

    /**
     * @return the Distance
     */
    public double getDistance() {
        return Distance;
    }

    /**
     * @param Distance the Distance to set
     */
    public void setDistance(double Distance) {
        this.Distance = Distance;
    }

    /**
     * @return the Angle
     */
    public double getAngle() {
        return Angle;
    }

    /**
     * @param Angle the Angle to set
     */
    public void setAngle(double Angle) {
        this.Angle = Angle;
    }

    /**
     * @return the Orientation
     */
    public String getOrientation() {
        return Orientation;
    }

    /**
     * @param Orientation the Orientation to set
     */
    public void setOrientation(String Orientation) {
        this.Orientation = Orientation;
    }

    /**
     * @return the coordinateRectangular
     */
    public int getCoordinateRectangular() {
        return coordinateRectangular;
    }

    /**
     * @param coordinateRectangular the coordinateRectangular to set
     */
    public void setCoordinateRectangular(int coordinateRectangular) {
        this.coordinateRectangular = coordinateRectangular;
    }
    
    private String coordinateName;
    private double coordinateX1;
    private double coordinateY1;
    private double coordinateX2;
    private double coordinateY2;
    private double  azimutResult;
    private int coordinatePolar;

    public GeoSpace(String coordinateName, double coordinateX1, double coordinateY1, double coordinateX2, double coordinateY2, double azimutResult, int coordinatePolar) {
        this.coordinateName = coordinateName;
        this.coordinateX1 = coordinateX1;
        this.coordinateY1 = coordinateY1;
        this.coordinateX2 = coordinateX2;
        this.coordinateY2 = coordinateY2;
        this.azimutResult = azimutResult;
        this.coordinatePolar = coordinatePolar;
    }

  
    /**
     * @return the coordinateName
     */
    public String getCoordinateName() {
        return coordinateName;
    }

    /**
     * @param coordinateName the coordinateName to set
     */
    public void setCoordinateName(String coordinateName) {
        this.coordinateName = coordinateName;
    }

    /**
     * @return the coordinateX1
     */
    public double getCoordinateX1() {
        return coordinateX1;
    }

    /**
     * @param coordinateX1 the coordinateX1 to set
     */
    public void setCoordinateX1(double coordinateX1) {
        this.coordinateX1 = coordinateX1;
    }

    /**
     * @return the coordinateY1
     */
    public double getCoordinateY1() {
        return coordinateY1;
    }

    /**
     * @param coordinateY1 the coordinateY1 to set
     */
    public void setCoordinateY1(double coordinateY1) {
        this.coordinateY1 = coordinateY1;
    }

    /**
     * @return the coordinateX2
     */
    public double getCoordinateX2() {
        return coordinateX2;
    }

    /**
     * @param coordinateX2 the coordinateX2 to set
     */
    public void setCoordinateX2(double coordinateX2) {
        this.coordinateX2 = coordinateX2;
    }

    /**
     * @return the coordinateY2
     */
    public double getCoordinateY2() {
        return coordinateY2;
    }

    /**
     * @param coordinateY2 the coordinateY2 to set
     */
    public void setCoordinateY2(double coordinateY2) {
        this.coordinateY2 = coordinateY2;
    }

    /**
     * @return the azimutResult
     */
    public double getAzimutResult() {
        return azimutResult;
    }

    /**
     * @param azimutResult the azimutResult to set
     */
    public void setAzimutResult(double azimutResult) {
        this.azimutResult = azimutResult;
    }

    /**
     * @return the coordinatePolar
     */
    public double getCoordinatePolar() {
        return coordinatePolar;
    }

    /**
     * @param coordinatePolar the coordinatePolar to set
     */
    public void setCoordinatePolar(int coordinatePolar) {
        this.coordinatePolar = coordinatePolar;
    }

}