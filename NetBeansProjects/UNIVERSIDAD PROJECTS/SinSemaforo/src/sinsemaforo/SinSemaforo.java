
package sinsemaforo;

public class SinSemaforo {

    
    public static void main(String[] args) {
       
(new Thread(new P1())).start();
(new Thread(new P2())).start();
(new Thread(new P3())).start();
(new Thread(new P4())).start();
        
    }
    
}
