/*
 * Time Estimate: 2 hours
 * Time:
 */
package emptyjavaproject;

/**
 *
 * @author mercy.daniels
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle r = new Rectangle(53.0, 5.0, "yards");
       Rectangle r2 = new Rectangle(6.0, 58.0, "meters");
       Square squa = new Square(5.0, "inches");
       Square squaw = new Square(6.0, "feet");
       Ellipse e = new Ellipse(7.0, 89.5, "metres");
       Ellipse e2 = new Ellipse(9.0, 456.5, "centimetres");
       Circle c = new Circle(8.0, "kilometres");
       Circle c2 = new Circle(8.0, "feet");
       r.toString();
       r2.toString();
       squa.toString();
       squaw.toString();
    }
    
}
