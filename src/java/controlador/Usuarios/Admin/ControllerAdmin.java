package controlador.Usuarios.Admin;

import dominio.Modelo.Admin;
import dominio.Servicio.ControlarAdmin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositorio.CrudAdmin;

public class ControllerAdmin extends HttpServlet {
    
    private static final String ACTION_REFLESH = "mostraradmin",ACTION_ERROR="adm/error.jsp";
    String cod,user,pass,em,dni,nom,apel,action;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        action = request.getParameter("accion");
        
        if(action.equalsIgnoreCase("Eliminar")){
            int id=Integer.parseInt(request.getParameter("id"));
            CrudAdmin cr= new CrudAdmin();
            if(cr.eliminarAdmin(id)){
              response.sendRedirect(ACTION_REFLESH);
            }else{
              response.sendRedirect(ACTION_ERROR);
            }
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        action = request.getParameter("accion");
        
        cod = request.getParameter("codigo");
        user = request.getParameter("username");
        pass = request.getParameter("password");
        em = request.getParameter("email");
        dni = request.getParameter("dni");
        nom = request.getParameter("nombre");
        apel = request.getParameter("apellido");
        
        if(action.equalsIgnoreCase("Agregar")){
            Admin u= new Admin(Integer.parseInt(cod),user, pass, em,Integer.parseInt(dni), nom, apel);
            ControlarAdmin mu= new ControlarAdmin();
            if(mu.crearAdmin(u)){
                response.sendRedirect(ACTION_REFLESH);
            }else{
                response.sendRedirect(ACTION_ERROR);
            }
        }
        else if(action.equalsIgnoreCase("Actualizar")){            
            Admin pro= new Admin(Integer.parseInt(cod), user, pass, em, Integer.parseInt(dni), nom, apel);
            ControlarAdmin cr= new ControlarAdmin();
            if(cr.actualizarAdmin(pro)){
              response.sendRedirect(ACTION_REFLESH);
            }else{
              response.sendRedirect(ACTION_ERROR);
            }
        }
    }
}
