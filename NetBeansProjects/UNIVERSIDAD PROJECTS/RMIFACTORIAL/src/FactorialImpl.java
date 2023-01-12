

import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;

public class FactorialImpl extends UnicastRemoteObject implements Factorial {
    
    FactorialImpl() throws java.rmi.RemoteException{
    
    super();
    
    }
    
    public long compute (long a){
    if (a==0 || a==1){
    
    return 1;
    }else{
    
    return a*compute(a-1);
    
    }
    }
    
    public static void main(String args[])
    {
    
        try {
            FactorialImpl calculator;
            LocateRegistry.createRegistry(1099);
            calculator = new FactorialImpl();
            Naming.bind("TheCalculator", calculator);
            System.out.println("El servidor esta listo\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    
    
    }
    
    
}
