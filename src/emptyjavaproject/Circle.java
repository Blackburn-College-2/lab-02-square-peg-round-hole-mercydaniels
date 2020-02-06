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
public class Circle extends Ellipse {

    double radius;
    String unit;
    
    public Circle(double radius, String unit) {
        super(radius, radius, unit);
        this.radius = radius;
        this.unit = unit;

        System.out.println("New Circle: " + radius);
    }
    
    @Override
    /**
     * Overrides getArea of ellipse to properly calculate the area of the cirle
     */
    public Measurement getArea(){
        double a = Math.PI * Math.pow(radius,2);
        Measurement m = new Measurement(a, unit);
        return m;
    }
    
    @Override
    /**
     * Overrides getPerimeter in ellipse to calculate the perimeter of circle
     */
    public Measurement getPerimeter(){
        double p = 2 * Math.PI * radius;
        Measurement m = new Measurement(p, unit);
        return m;
    }
}
