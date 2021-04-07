/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.model;

/**
 *
 * @author USER
 */
public class GeoSpace2 {

    private double distance;
    private double angle;
    private String orientation;
    private double X;
    private double Y;

    public GeoSpace2(double distance, double angle, String orientation, double X, double Y) {
        this.distance = distance;
        this.angle = angle;
        this.orientation = orientation;
        this.X = X;
        this.Y = Y;
    }

    /**
     * @return the distance
     */
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * @return the angle
     */
    public double getAngle() {
        return angle;
    }

    /**
     * @param angle the angle to set
     */
    public void setAngle(double angle) {
        this.angle = angle;
    }

    /**
     * @return the orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * @param orientation the orientation to set
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * @return the X
     */
    public double getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(double X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public double getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(double Y) {
        this.Y = Y;
    }

}
