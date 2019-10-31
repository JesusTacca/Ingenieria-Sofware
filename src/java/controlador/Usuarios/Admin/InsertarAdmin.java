package controlador.Usuarios.Admin;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dominio.Modelo.Admin;
import dominio.Servicio.ControlarAdmin;

public class InsertarAdmin extends HttpServlet {

  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
       String cod= request.getParameter("codigo");
       String user = request.getParameter("username");
       String pass = request.getParameter("password");       
       String em = request.getParameter("email");  
       String dni = request.getParameter("dni");  
       String nom = request.getParameter("nombre");  
       String apel = request.getParameter("apellido");  
       
       Admin u= new Admin(Integer.parseInt(cod),user, pass, em,Integer.parseInt(dni), nom, apel);
       ControlarAdmin mu= new ControlarAdmin();
       if(mu.crearAdmin(u)){
           response.sendRedirect("adm/Administrador.jsp");
       }else{
           response.sendRedirect("mostraradmin");
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
