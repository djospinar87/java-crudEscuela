/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionSQL {
    
   private static String url = "jdbc:mysql://localhost/escuela";
    private static String usuario = "root";
    private static String contraseña = "";

public static Connection conectar(){
    
    Connection conexion = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion exitosa con la base de datos");
            JOptionPane.showMessageDialog(null, "Conexion exitosa con la base de datos");
                        
        } catch (Exception e) {
        
            System.out.println("Error: " +e);
            
        }
        
        return conexion;
        
    }
    
    public static void main(String[] args) {
        
         try {
            Connection conexion = conectar();
            //String sql = "INSERT INTO datos (nombre,codigo_postal,telefono) VALUES ('Diego',750034,1109265310)";
            //String sql = "INSERT INTO alumnos (nombres,apellidos,materia,calificacion,estatus) VALUES ('Diego jose','ospina rojas','matematicas',7,'aprobado')";
            //PreparedStatement sentencia = conexion.prepareStatement(sql);
            //sentencia.executeUpdate();
            conexion.close();
            
        } catch (Exception e) {
            
            System.out.println("Error:  " +e);
            
        }
           
    }
    
}