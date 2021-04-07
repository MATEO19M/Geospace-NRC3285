/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.geospace.model;

/**
 *
 * @author Pc
 */
public class GeoSpace1 {

    private double rectangulaCoordinateX;
    private double rectangulaCoordinateY;
    private double result;
    private int numberOfTransform;

    public GeoSpace1(double rectangulaCoordinateX, double rectangulaCoordinateY, double result, int numberOfTransform) {
        this.rectangulaCoordinateX = rectangulaCoordinateX;
        this.rectangulaCoordinateY = rectangulaCoordinateY;
        this.result = result;
        this.numberOfTransform = numberOfTransform;
    }

    /**
     * @return the rectangulaCoordinateX
     */
    public double getRectangulaCoordinateX() {
        return rectangulaCoordinateX;
    }

    /**
     * @param rectangulaCoordinateX the rectangulaCoordinateX to set
     */
    public void setRectangulaCoordinateX(double rectangulaCoordinateX) {
        this.rectangulaCoordinateX = rectangulaCoordinateX;
    }

    /**
     * @return the rectangulaCoordinateY
     */
    public double getRectangulaCoordinateY() {
        return rectangulaCoordinateY;
    }

    /**
     * @param rectangulaCoordinateY the rectangulaCoordinateY to set
     */
    public void setRectangulaCoordinateY(double rectangulaCoordinateY) {
        this.rectangulaCoordinateY = rectangulaCoordinateY;
    }

    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(double result) {
        this.result = result;
    }

    /**
     * @return the numberOfTransform
     */
    public int getNumberOfTransform() {
        return numberOfTransform;
    }

    /**
     * @param numberOfTransform the numberOfTransform to set
     */
    public void setNumberOfTransform(int numberOfTransform) {
        this.numberOfTransform = numberOfTransform;
    }

}
