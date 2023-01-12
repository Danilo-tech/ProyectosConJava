package algdekker;


public class Entrada2 extends Thread {
    
    boolean EN1;
    boolean EN2;
    int turn = 0;
    
public Entrada2(boolean EN1, boolean EN2){

    this.EN1 = EN1;
    this.EN2 = EN2;

}
 
public void run (){

    EN2 = true;
    while (EN1){
    
        if (turn ==0){
        EN2 = false;
        while (turn == 0){
            System.out.println("Segunda Entrada");
            System.out.println();
            EN1 = true;
            
            System.out.println("Segunda Entrada, Estado Critico");
            System.out.println();
            
            System.out.println("Segunda Entrada Finalizada");
            System.out.println();
            
            turn = 0;
            EN2 = false;
            turn = 1;
        }
        }
    }

}

}
