
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
        
        return valueUnit;
  }
}
 