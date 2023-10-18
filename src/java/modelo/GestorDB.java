package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorDB {
    Connection conn = null;
    Statement stm = null;
    ResultSet rs;
    int legajo;
    String Nombre;
    String Apellido;
    Double Promedio;
    Alumno alEncontrado;
    
    public boolean registrar (String nombre, String apellido, Double promedio){
        int resultUpdate = 0;
        try{
            conn = ConectarDB.abrir();
            stm = conn.createStatement();
            String sql="INSERT INTO Alumno (nombre, apellido,promedio) values ('" + nombre+ "', '" +apellido + "', "+promedio+")";
            
            resultUpdate = stm.executeUpdate(sql);
            if (resultUpdate != 0) {
                ConectarDB.cerrar();
                return true;
            }
            else {
                ConectarDB.cerrar();
                return false;
            }
        }
        catch (Exception e){
            System.out.println("Error en la base de datos");
            e.printStackTrace();
            return false;
        }
    }
    public Alumno consultar(int legajo){
        try {
            conn = ConectarDB.abrir();
            stm = conn.createStatement();
            String sql = "SELECT * FROM ALUMNO WHERE legajo =" + legajo;
            rs = stm.executeQuery(sql);
            if(!rs.next()){
                System.out.println("No se encontro el registro");
                ConectarDB.cerrar();
                return null;
            }
            else{
                System.out.println("Se encontro el registro");
                this.legajo = rs.getInt("legajo");
                Nombre = rs.getString("nombre");
                Apellido = rs.getString("apellido");
                Promedio = rs.getDouble("promedio");
                alEncontrado = new Alumno(this.legajo,Nombre,Apellido,Promedio);
                alumnos.add(alEncontrado);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(GestorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
