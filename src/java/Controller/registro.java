package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.GestorDB;
import modelo.Alumno;

@WebServlet(name = "registro", urlPatterns = {"/registro"})
public class registro extends HttpServlet{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String Nombre = request.getParameter("Nombre");
            String Apellido = request.getParameter("Apellido");
            Double Promedio = Double.parseDouble(request.getParameter("Promedio"));
            GestorDB gestorDB = new GestorDB();
            if (gestorDB.registrar(Nombre, Apellido, Promedio)){
                Alumno al = new Alumno(Nombre, Apellido, Promedio);
                request.setAttribute("atribAlumn", al);
                request.getRequestDispatcher("/muestraDatos.jsp").forward(request, response);
            }
            else{
                request.getRequestDispatcher("/errorEnRegistro.jsp") .forward(request, response);
            }
        }
        finally{
            out.close();
        }
    }
}