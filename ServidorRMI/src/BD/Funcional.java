
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Funcional {

     public int InserirLista(String ordem){
        
        String SQL = "INSERT INTO numeros(ordem) " + "VALUES(?)";

        Conexao c = new Conexao();
        
        try (Connection conn = c.conect(); PreparedStatement pstmt = conn.prepareStatement(SQL,Statement.RETURN_GENERATED_KEYS)){
            
            pstmt.setString(1,ordem);
            //pstmt.setString(2,n_ordem);    


            pstmt.executeUpdate();
            
            ResultSet retornoDoID = pstmt.getGeneratedKeys();
            retornoDoID.next();
            Integer id;
            id = retornoDoID.getInt(1);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return 0;
    }
   
}