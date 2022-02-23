package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    static final String URL = "jdbc:postgresql://localhost:5432/Comics";
    static final String USUARIO = "postgres";
    static final String CLAVE = "12345";

    public static Connection obtenerConexion()
    {
        Connection conn = null;

        try 
        { 
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(URL, USUARIO, CLAVE);
            System.out.println("Se connecto a la base de datos: ");
        } 
        catch (ClassNotFoundException ex) 
        {
            System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
        }
        catch(SQLException ex)
        {
            System.out.println("Error en url  de PostgreSQL: " + ex);
        }

        return conn;
    }
}

