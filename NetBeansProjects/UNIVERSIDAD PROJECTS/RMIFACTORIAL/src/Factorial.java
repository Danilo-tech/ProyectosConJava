
import java.rmi.*;


public interface Factorial extends Remote {
    long compute (long arg) throws RemoteException;
}
