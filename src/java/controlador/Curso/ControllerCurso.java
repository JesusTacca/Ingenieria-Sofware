
package controlador.Curso;

import dominio.Modelo.curso;
import dominio.Servicio.ControlarCurso;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerCurso extends HttpServlet {
    curso p=new curso();
    ControlarCurso  dao=new ControlarCurso();
    
    int id,codProf,Semestre;
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      
        String action=request.getParameter("accion");
      
        if(action.equalsIgnoreCase("Agregar")){
            id=Integer.parseInt(request.getParameter("txtCod"));
            Semestre=Integer.parseInt(request.getParameter("txtSemestre"));
            String nom=request.getParameter("txtNom");
            int idesc =Integer.parseInt(request.getParameter("codEscuela"));
            
            dao.add(id,Semestre,nom,idesc);
            response.sendRedirect("mostrarcurso");
        }
        else if(action.equalsIgnoreCase("agregarc")){
            int idcurso=Integer.parseInt(request.getParameter("codCurso"));
            int idprof =Integer.parseInt(request.getParameter("txtprofesor"));
 
            
            dao.addprof_curso(idprof,idcurso);
            response.sendRedirect("mostrarprofesor");
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            id=Integer.parseInt(request.getParameter("txtCod"));
            String nom=request.getParameter("txtNom");
            Semestre=Integer.parseInt(request.getParameter("txtSemestre"));
            p.setId(id);
            p.setNom(nom);
            p.setSemestre (Semestre);
            dao.edit(p);
            response.sendRedirect("mostrarcurso");
        }
        else if(action.equalsIgnoreCase("eliminar")){
            id=Integer.parseInt(request.getParameter("id"));
            p.setId(id);
            dao.eliminar(id);
            response.sendRedirect("mostrarcurso");
        }
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

  @Override
  public String getServletInfo() {
    return "Short description";
  }// </editor-fold>

}
