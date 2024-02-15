package clases;
import java.sql.*;

public class Conectar {

    Connection conectar = null;

    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/laranitapp?user=root&password=");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
            System.out.println("Error en la conexion: " + e);

        }

        return conectar;
    }
}
