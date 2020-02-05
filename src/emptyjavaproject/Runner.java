/*
 * Time Estimate: 2 hours
 * Time:
 */
package emptyjavaproject;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangle r = new Rectangle(53.0, 5.0, "yards");
       Rectangle r2 = new Rectangle(6.0, 58.0, "meters");
       Square squa = new Square(5.0, "dollars");
       Square squaw = new Square(6.0, "feet");
        
       r.toString();
       r2.toString();
       squa.toString();
       squaw.toString();
    }
    
}
