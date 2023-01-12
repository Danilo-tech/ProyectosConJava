
package consemaforo;

import java.util.concurrent.Semaphore;
public class P3 extends Thread{
    protected Semaphore oFinP3;
public P3(Semaphore oFinP3)
{
this.oFinP3 = oFinP3;
}
public void run()
{
try
{
sleep((int) Math.round(500 * Math.random() - 0.5));
}
catch (InterruptedException e)
    {
e.printStackTrace();
}
System.out.println("P3");
this.oFinP3.release(2);
}
    
}
