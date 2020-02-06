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
public class Square extends Rectangle {

    private double side;
    private String unit;
    
    public Square(double side, String unit) {
        super(side, side, unit);
        this.side = side;
        this.unit = unit;

         System.out.println("New Square:" + side);
    }

    @Override
    /**
     * Overrides toString to print out the square measurements
     */
    public String toString() {
        Measurement mesSide = new Measurement(this.side, this.unit);
        String printMes =  " "+ mesSide;
        System.out.println( "This Square is" + printMes);
        return printMes;
    }
}
