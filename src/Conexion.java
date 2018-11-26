
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DAM220
 */
public class Conexion {
    
    private boolean iniciado=false;
    
    public static Connection Conectar(String usuario, String contrasenia){
        
        Connection con = null;
        String password=contrasenia;
        String user=usuario;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con=DriverManager.getConnection("jdbc:mysql://10.0.10.18:3306/preguntastest",user,password);
        
            
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            System.out.println("Codigo ERROR: "+e.getErrorCode());
            System.out.println("Codigo SQLSTATE: "+e.getSQLState());
           
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        
        return con;
        
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }
    
    
    
    
}
