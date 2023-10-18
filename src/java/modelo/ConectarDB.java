package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarDB {
    private static Connection con;
    private static String bd = "INSTITUTO";
    private static String usuario = "iago";
    private static String passw = "iago";
    private static String url = "jbdc:mysql://localhost/" + bd;
    
    public static Connection abrir() throws SQLException {
        try {
            Class.forName("com.mysql,cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, passw);
        }
        catch (ClassNotFoundException e) {
            System.out.println ("Error: No se pudo cargar el controlado JDBC");
            throw new SQLException ("Error en la conexión", e); 
        }
        return con;
    }
    
    public static void cerrar() {
        try {
            if (con!= null)
                con.close();
        }
        catch (SQLException e) {
            System.out.println("Error, no se logró cerrar la conexión");
        }
    }
}
