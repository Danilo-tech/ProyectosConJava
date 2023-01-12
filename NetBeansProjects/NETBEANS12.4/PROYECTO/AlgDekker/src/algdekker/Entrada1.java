package algdekker;


public class Entrada1 extends Thread {
    
    boolean EN1;
    boolean EN2;
    int turn = 1;
    
public Entrada1(boolean EN1, boolean EN2){

    this.EN1 = EN1;
    this.EN2 = EN2;

}
 
public void run (){

    EN1 = true;
    while (EN2){
    
        if (turn ==1){
        EN1 = false;
        while (turn == 1){
            System.out.println("Primera Entrada");
            System.out.println();
            EN1 = true;
            
            System.out.println("Primera Entrada, Estado Critico");
            System.out.println();
            
            System.out.println("Primera Entrada Finalizada");
            System.out.println();
            
            turn = 1;
            EN1 = false;
            turn = 0;
        }
        }
    }

}

}
