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

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    
    public double getArea(){
    double area = (this.width * this.height);
    return area;
}
    
    public double getPerimeter(){
        double perimeter = (2 * this.width + 2*this.height);
        return perimeter;
    }
}
