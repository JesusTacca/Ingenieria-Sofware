package controlador.Usuarios.Admin;

import java.io.IOException;

import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dominio.Modelo.Admin;
import dominio.Servicio.ControlarAdmin;



public class MostrarAdmin extends HttpServlet {
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    
    
    ControlarAdmin crud= new ControlarAdmin();
    ArrayList<Admin> veradmin;
    veradmin = crud.getAllAdmin();

    request.getSession().setAttribute("veradmin", veradmin);
    response.sendRedirect("adm/Administrador.jsp");
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }
}
