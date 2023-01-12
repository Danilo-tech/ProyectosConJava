package HiloInterface;
/**
 *
 * @author Danilo
 */
public class HiloInterface implements Runnable
    {
    public void run()
    {
    for (int i=0; i<5; i++)
    System.out.println(i+" "+Thread.currentThread().getName());
    System.out.println("Termina Thread"+Thread.currentThread().getName());
    }
    
    public static void main (String[]args)
    {
    new Thread(new HiloInterface(), "Danilo").start();
    new Thread(new HiloInterface(), "A").start();
    System.out.println("Termina Thread main");
    }
}
