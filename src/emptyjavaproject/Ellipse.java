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
    double radiusV;
    double radiusH;
    String unit;
    public Ellipse(double radiusVert, double radiusHoriz, String unit){
        this.radiusH = radiusHoriz;
        this.radiusV = radiusVert;
        this.unit = unit;
        System.out.println("New Ellipse: " + radiusHoriz + " by " + radiusVert);
    }
    
    public Measurement getPerimeter(){
        
        double underSqRoot = (Math.pow(radiusV, 2) + Math.pow(radiusH,2)) / 2;
        double squareRoot = Math.sqrt(underSqRoot);
        double p = 2 * Math.PI * squareRoot;
        Measurement m = new Measurement(p, unit);
        return m;
    }
    public Measurement getArea(){
        double a = Math.PI * radiusV * radiusH;
        Measurement m = new Measurement(a, unit);
        return m;
    }
}
