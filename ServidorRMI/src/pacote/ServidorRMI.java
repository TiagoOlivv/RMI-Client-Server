package pacote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {

    public static void main(String[] argv) throws RemoteException, AlreadyBoundException, MalformedURLException {

        int port = 10000;
        String hostname = new meu_IP().get();
        
        OBJ function = new OBJ();

        try { 
            
            LocateRegistry.createRegistry(port);
            System.out.println("O Servidor Java RMI INICIADO");
            
        } catch (RemoteException e) {

            System.out.println("O Servidor Java RMI já existe."+ e.getMessage());
        }

        String bindLocation = "//" + hostname + ":" + port + "/OBJ";
        Naming.bind(bindLocation, function); 
        System.err.println("Servidor Iniciado em: " + bindLocation);
        
    }
    
}
