
package pacote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote{
    
    public String Entrada(String dados) throws RemoteException;
    public String Retorno(String dados) throws RemoteException;
    
}
