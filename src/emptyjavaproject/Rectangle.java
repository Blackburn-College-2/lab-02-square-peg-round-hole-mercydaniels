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
public class Rectangle {

     private double width;
    private double height;
    private String unit;

    public Rectangle(double width, double height, String unit) {
        this.height = height;
        this.width = width;
        this.unit = unit;
        System.out.println("New Rectangle: " + width + "x" + height);
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getArea() {
        double area = (this.width * this.height);
        return area;
    }

    public double getPerimeter() {
        double perimeter = (2 * this.width + 2 * this.height);
        return perimeter;
    }

    @Override
    public String toString() {
        Measurement mesHeight = new Measurement(this.height, this.unit);
        Measurement mesWidth = new Measurement(this.width, this.unit);
        String both = "This Rectangle is " + mesHeight + " by " + mesWidth;
        System.out.println(both);
        return both;
    }
    
    public double getEffiency(){
        double math = getArea()/getPerimeter();
        return math;
    }
}
