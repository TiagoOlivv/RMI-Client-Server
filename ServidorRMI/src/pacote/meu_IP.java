package pacote;

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class meu_IP {
 
    public String get(){
     
        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            return(ipAddr.getHostAddress());
        } catch (UnknownHostException e) {
            
        }
        
        return "127.0.0.1";
    }
}