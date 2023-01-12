import java.rmi.*;
import java.rmi.registry.*;



public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Factorial calculator;
        int number;
        
        try {
            calculator = (Factorial)Naming.lookup("rmi://localhost/TheCalculator");
            number=Integer.parseInt(args[0]);
            
            System.out.println();
            System.out.println(" "+number+"! = "+calculator.compute(number));
            System.out.println();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
}
