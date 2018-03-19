package Controlador;


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
 * @author leonardo
 */
public class cls_conexion {
    public Connection conectarBB(){
        Connection conexion = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("DRIVER Java a la Bd cargado!!");

        } catch (ClassNotFoundException ex) {
            System.out.println("Error: no se encuentra el Driver" + ex);
        }
        
        try {
            String urlbd = "jdbc:derby://localhost:1527/bd_agenda ";//url para conectarnos a la base de datos utilizando la sintaxis de JDBC
            conexion = DriverManager.getConnection(urlbd, "root", "root");// se establece la coneccion a la bace de datos
            System.out.println("Conexion establecida  a la BD");
        } catch (SQLException ex) {
            System.out.println("ERROR: No se pudo establecer  conexion a la BD !!" + ex);
        }
        return conexion;
    }
}
