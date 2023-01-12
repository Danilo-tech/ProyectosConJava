
package sinsemaforo;

public class P4 extends Thread{
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
System.out.println("P4");
}
    
    
}
