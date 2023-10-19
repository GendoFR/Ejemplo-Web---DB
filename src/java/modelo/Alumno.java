package modelo;

import java.util.ArrayList;

/**
 *
 * @author ET36
 */
public class Alumno {
    public int legajo;
    public String Nombre;
    public String Apellido;
    public double Promedio;
    private ArrayList<Alumno> listaAlum = new ArrayList<>();

    public void add(Alumno alEncontrado) {
        this.listaAlum.add(alEncontrado);
    }

    public Alumno(String Nombre, String Apellido, Double Promedio) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Promedio = Promedio;
        
    }
}
