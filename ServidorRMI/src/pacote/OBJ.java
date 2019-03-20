
package pacote;

import BD.Conexao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import BD.Funcional;
import static pacote.Ordena.converteStr;

public class OBJ extends UnicastRemoteObject implements Interface {

    public OBJ() throws RemoteException { 
        super();
    }
    
    @Override
    public String Entrada(String dados) throws RemoteException {
        
        Funcional obj = new Funcional();
        String Ordem = Retorno(dados);
        Conexao c = new Conexao();
        c.registraDriver();
        obj.InserirLista(Ordem);
        return Ordem;
    }
    
    @Override
    public String Retorno(String dados) throws RemoteException {
        
        int [] array = Ordena.converteInt(dados.split(" "));
  
        java.util.Arrays.sort(array);
        
        Funcional obj = new Funcional();
        Conexao c = new Conexao();
        
        c.registraDriver();
        
        obj.InserirLista(converteStr(array));
        
        return Ordena.converteStr(array);
    }
    
    
}