
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ProcesaServlet", urlPatterns = {"/ProcesaServlet"})
public class ProcesaServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //recibo de datos del formulario
        String nombre = request.getParameter("nombre");
        String telefono = request.getParameter("telefono");
        String correo = request.getParameter("correo");
        
        //instanciar un objeto a partir de la clase persona
        Persona per = new Persona();
        
        //encapsular los datos recibidos en el objeto per 
        per.setNombre(nombre);
        per.setTelefono(telefono);
        per.setCorreo(correo);
        
        //colocar elm objeto per como atributo request
        request.setAttribute("persona", per);
        
        //derivamos el control al output.jsp
        request.getRequestDispatcher("output.jsp").forward(request, response);
    }
    
}
