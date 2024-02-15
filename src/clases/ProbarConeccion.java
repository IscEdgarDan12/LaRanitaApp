
package clases;
import java.sql.*;
/*
 *
 * @author DanKuzo
 */
public class ProbarConeccion {
    public static void main(String[] args) throws ClassNotFoundException {
      ProbarConeccion p = new ProbarConeccion();
      p.coneccion();
    }
    public void coneccion(){
          Connection cc = Connection();
          Connection cn =cc.conexion();
        
        if (cn==null) {
            System.out.println("no conectado");
        }else{
            System.out.println("conectado ");
        }
    }

}