package Controller;
import java.io.IOException;
import java.io.PrintWriter; 
import java.util.ArrayList;
import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Alumno;
import modelo.GestorDB;
@WebServlet (name = "muestraAlumnos" , urlPatterns = {"/muestraAlumnos"})
public class muestraAlumnos extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset = UTF-8");
        PrintWriter out = response.getWriter();
        try{
            ArrayList<Alumno> alumnos = new ArrayList();
            GestorDB gestorDB = new GestorDB();
            alumnos = GestorDB.leerTodos();
            if (alumnos != null)
            {
                request.setAttribute("Alumno", Alumno);
                request.getRequestDispatcher("/listaAlumnos.jsp") .forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("/noHayRegistros.jsp") .forward(request,response);
            }
        }
        finally{
            out.close();
        }  
}
