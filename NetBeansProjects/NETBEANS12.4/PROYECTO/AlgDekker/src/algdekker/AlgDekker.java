package algdekker;


public class AlgDekker {

    public static void main(String[] args) {
       //creando variables
        boolean EN1= true;
       boolean EN2 = true;
       
       //Instancias para llamar las entradas
       Entrada1 hilo1 = new Entrada1 (EN1,EN2);
       Entrada2 hilo2 = new Entrada2 (EN1, EN2);
               
      //Iniciar entradas
      hilo1.start();
      hilo2.start();
       
    }
    
}
