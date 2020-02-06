/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emptyjavaproject;

/**
 * This is a blueprint for a rectangle
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

    /**
     *
     * @return returns the width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }

    /**
     *
     * @return returns the height of the rectangle
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Uses getHeight and getWidth to calculate the area of the rectangle
     *
     * @return area as a double
     */
    public double getArea() {
        double area = (this.width * this.height);
        return area;
    }

    /**
     * Uses getHeight and getWidth to calculate the perimeter of the rectangle
     *
     * @return perimeter as a double
     */
    public double getPerimeter() {
        double perimeter = (2 * this.width + 2 * this.height);
        return perimeter;
    }

    @Override
    /**
     * Overrides toString to print out the rectangle measurements
     */
    public String toString() {
        Measurement mesHeight = new Measurement(this.height, this.unit);
        Measurement mesWidth = new Measurement(this.width, this.unit);
        String both = "This Rectangle is " + mesHeight + " by " + mesWidth;
        System.out.println(both);
        return both;
    }

    public double getEffiency() {
        double math = getArea() / getPerimeter();
        return math;
    }
}
