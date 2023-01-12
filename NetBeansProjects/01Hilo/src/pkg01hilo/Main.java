package pkg01hilo;

/**
 *
 * @author Danilo
 */
public class Main extends Thread

{
    //constructor    
    public Main (String str)
        {
        super (str);
        }
    //Metodo
    public void run()
        {
        for (int i=0; i<10;i++)
        System.out.println(i + " " + getName());
        System.out.println("Termina Thread"+getName());
        }   
    
    public static void main(String[] args)
        {
     
            {
            new Main("Danilo").start();
            new Main("A").start();
            System.out.println("Termina thread");
            }
        
        }
    
}
