
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DAM220
 */
public class gestionMetodos {

   

    public boolean existeUsuario(String usuario, String contrasenia) {

        boolean existe = false;

        Connection c = null;
        c = Conexion.Conectar("root", "root");
        if (c != null) {
            try {

                Statement s = null;
                ResultSet r = null;
                String sql = "SELECT nombre FROM usuarios WHERE usuario='" + usuario + "' AND contraseña='" + contrasenia + "'";
                s = c.createStatement();

                r = s.executeQuery(sql);
                if (r.next()) {
                    existe = true;
                    System.out.println("Conectado");
                    existe = true;
                } else {
                    System.out.println("ERROR: Usuario no existe");
                }

            } catch (SQLException e) {
                System.out.println("AAA");

            }
        }

        return existe;

    }

    public boolean añadirUsuario(Usuario nuevoUsuario) {

        boolean completado = false;

        Connection c = null;

        try {
            c = Conexion.Conectar("root", "root");

            String sql = "INSERT INTO usuarios (usuario,contraseña,nombre,apellidos,fechanac) VALUES (?,?,?,?,?)";
            PreparedStatement prepSt = c.prepareStatement(sql);

            prepSt.setString(1, nuevoUsuario.getUsuario());
            prepSt.setString(2, nuevoUsuario.getContrasenia());
            prepSt.setString(3, nuevoUsuario.getNombre());
            prepSt.setString(4, nuevoUsuario.getApellidos());
            prepSt.setString(5, nuevoUsuario.getFechanac());
            prepSt.executeUpdate();

            completado = true;
            c.close();
        } catch (SQLException e) {

        }

        return completado;

    }

}
