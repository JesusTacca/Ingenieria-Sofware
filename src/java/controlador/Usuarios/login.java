package controlador.Usuarios;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import repositorio.CrudAdmin;
import repositorio.CrudEstudiante;
import repositorio.CrudProfesor;
import repositorio.CrudVisitante;

public class login extends HttpServlet {
    private static final String ACTION_USER = "usuario",ACTION_NIVEL = "nivel";;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        CrudAdmin admin = new CrudAdmin();
        CrudProfesor profesor = new CrudProfesor();
        CrudVisitante visitante = new CrudVisitante();
        CrudEstudiante Estudiante  = new CrudEstudiante();
        
        HttpSession sesion = request.getSession();
        
        sesion.setAttribute(ACTION_USER, user);
        
        if (admin.autentificarAdmin(user, pass)) {
            sesion.setAttribute(ACTION_NIVEL, "Admin");
            response.sendRedirect("adm/index.jsp");

        } else if (profesor.autentificarProfesor(user, pass)) {
            sesion.setAttribute(ACTION_NIVEL, "Profesor");
            response.sendRedirect("profesor.jsp");

        } else if (visitante.autentificarVisitante(user, pass)) {
            sesion.setAttribute(ACTION_NIVEL, "Visitante");
            response.sendRedirect("BuscarProyectos");
            
        }else if (Estudiante.autentificarEstudiante(user, pass)) {
            sesion.setAttribute(ACTION_NIVEL, "Estudiante");
            response.sendRedirect("estud/indexEstudiante.jsp");
            
        } else {
            response.sendRedirect("error.jsp");
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
