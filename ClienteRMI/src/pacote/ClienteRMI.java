package pacote;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class ClienteRMI {

        public Interface init() {

        String remoteHostName = "192.168.43.208";
        int remotePort = 10000;
        Interface function = null;
        
        String connectLocation = "//" + remoteHostName + ":" + remotePort + "/OBJ";
    
        try {
            System.err.println("Conectado: " + connectLocation);
            function = (Interface) Naming.lookup(connectLocation);
        } catch (MalformedURLException | RemoteException | NotBoundException e) {
            System.err.println(" > "+e.getMessage());
        }
        
        return function;
    }
        
}