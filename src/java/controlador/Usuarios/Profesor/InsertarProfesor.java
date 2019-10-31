package controlador.Usuarios.Profesor;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositorio.CrudProfesor;
import dominio.Modelo.Profesor;

public class InsertarProfesor extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    String cod= request.getParameter("codigo");
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
    String em = request.getParameter("email");
    String dni = request.getParameter("dni");
    String nom = request.getParameter("nombre");
    String apel = request.getParameter("apellido");
    String grad = request.getParameter("grado");
    String esp = request.getParameter("especialidad");
    Profesor pro= new Profesor(Integer.parseInt(cod), user, pass, em, Integer.parseInt(dni), nom, apel, grad, esp);
    CrudProfesor cp= new CrudProfesor();
    if(cp.crearProfesor(pro)){
      response.sendRedirect("mostrarprofesor");
    }else{
      response.sendRedirect("adm/index.jsp");
    }
    
  }

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
    processRequest(request, response);
  }

  /**
   * Returns a short description of the servlet.
   *
   * @return a String containing servlet description
   */
  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
