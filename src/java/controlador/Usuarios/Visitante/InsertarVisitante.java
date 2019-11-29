/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Usuarios.Visitante;

import dominio.Modelo.Visitante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositorio.CrudVisitante;

/**
 *
 * @author Efra
 */
public class InsertarVisitante extends HttpServlet {

  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
       String cod= request.getParameter("codigo");
       String user = request.getParameter("username");
       String pass = request.getParameter("password");       
       String em = request.getParameter("email");  
       String dni = request.getParameter("dni");  
       String nom = request.getParameter("nombre");  
       String apel = request.getParameter("apellido");  
       String tarj = request.getParameter("tarjeta");  
       
      Visitante vis= new Visitante(Integer.parseInt(cod), user, pass, em,Integer.parseInt(dni), nom, apel,Integer.parseInt(tarj));
      CrudVisitante cvisitante= new CrudVisitante();
      if(cvisitante.crearVisitante(vis)){
        response.sendRedirect("visitantes/visitante.jsp");
      }else{
        response.sendRedirect("adm/error.jsp");
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
