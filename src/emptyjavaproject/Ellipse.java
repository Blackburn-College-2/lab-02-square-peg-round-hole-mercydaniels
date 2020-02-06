/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 *
 * @author mercy.daniels
 */
public class Ellipse {

    private double radiusV;
    private double radiusH;
    String unit;

    public Ellipse(double radiusVert, double radiusHoriz, String unit) {
        this.radiusH = radiusHoriz;
        this.radiusV = radiusVert;
        this.unit = unit;
        System.out.println("New Ellipse: " + radiusHoriz + " by " + radiusVert);
    }

    /**
     *  Calculates the perimeter of the ellipse
     * @returns the perimeter of the ellipse
     */
    public Measurement getPerimeter() {

        double underSqRoot = (Math.pow(radiusV, 2) + Math.pow(radiusH, 2)) / 2;
        double squareRoot = Math.sqrt(underSqRoot);
        double p = 2 * Math.PI * squareRoot;
        Measurement m = new Measurement(p, unit);
        return m;
    }
/**
 * Calculates the area of the ellipse
 * @return 
 */
    public Measurement getArea() {
        double a = Math.PI * radiusV * radiusH;
        Measurement m = new Measurement(a, unit);
        return m;
    }
/**
 * Uses the area and perimeter to calculate the efficiency of the ellipse
 * @return 
 */
    public double getEfficiency() {
        double underSqRoot = (Math.pow(radiusV, 2) + Math.pow(radiusH, 2)) / 2;
        double squareRoot = Math.sqrt(underSqRoot);
        double p = 2 * Math.PI * squareRoot;
        double a = Math.PI * radiusV * radiusH;
        Measurement m = new Measurement(a, unit);
        double yeehaw = a / p;
        return yeehaw;
    }
}
