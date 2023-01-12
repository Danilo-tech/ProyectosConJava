


package consemaforo;
import java.util.concurrent.Semaphore;

public class ConSemaforo {

  
    protected static Semaphore oFinP1, oFinP3;
    public static void main(String[] args) {
        oFinP1 = new Semaphore(0,true);
        oFinP3 = new Semaphore(0,true);
(new Thread(new P1(oFinP1))).start();
(new Thread(new P2(oFinP1,oFinP3))).start();
(new Thread(new P3(oFinP3))).start();
(new Thread(new P4(oFinP1,oFinP3))).start();
        
    }
    
}
