package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    
   public Connection conect(){
        try {
            System.out.println("Banco de dados conectado");
            return DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/rmi", "postgres","admin");
	} catch (SQLException e) {
            System.out.println("Conexão falhada! Verifique o console de saída");
            e.printStackTrace();
            return null;
        }
    }
    
    public void registraDriver(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Onde está o seu driver JDBC do PostgreSQL? " + "Inclua em sua biblioteca");
            e.printStackTrace();
            return;
        }
	System.out.println("\nPostgreSQL JDBC Driver registrado!");
    }

}
    

