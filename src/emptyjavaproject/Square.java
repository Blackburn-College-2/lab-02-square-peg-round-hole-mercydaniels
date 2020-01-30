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

    public Square(double side) {
        super(side, side);
        width = side;
        height = side;

        System.out.println("New Square:" + side);

    }
    @Override
    public String toString(){
       String squ = "square of " + height;
       return squ;
    }
}
