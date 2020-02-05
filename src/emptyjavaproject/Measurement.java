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
public class Measurement {
    double value = 0.0;
    String unit = "units";
    
    public Measurement(double value, String unit){
        this.value = value;
        this.unit = unit;
    }
    
    @Override
  public String toString(){
      String valueUnit = "" + value + unit;
        System.out.println(valueUnit);
        return valueUnit;
  }
}
 