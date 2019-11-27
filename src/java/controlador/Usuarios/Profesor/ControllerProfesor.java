package controlador.Usuarios.Profesor;

import dominio.Modelo.Profesor;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import repositorio.CrudProfesor;

public class ControllerProfesor extends HttpServlet {
    private static final String ACTION_REFLESH = "mostrarprofesor",ACTION_ERROR="adm/error.jsp";
    String cod,user,pass,em,dni,nom,apel,grad,esp;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("accion");
        
        if(action.equalsIgnoreCase("Eliminar")){

            String delete= request.getParameter("id");
            CrudProfesor crud= new CrudProfesor();
            if(crud.eliminarProfesor(Integer.parseInt(delete))){
              response.sendRedirect(ACTION_REFLESH);
            }
            else{
              response.sendRedirect(ACTION_ERROR);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("accion");
        
        cod = request.getParameter("codigo");
        user = request.getParameter("username");
        pass = request.getParameter("password");
        em = request.getParameter("email");
        dni = request.getParameter("dni");
        nom = request.getParameter("nombre");
        apel = request.getParameter("apellido");
        grad = request.getParameter("grado");
        esp = request.getParameter("especialidad");
        Profesor pro= new Profesor(Integer.parseInt(cod), user, pass, em, Integer.parseInt(dni), nom, apel, grad, esp);
        
        if(action.equalsIgnoreCase("Agregar")){
            
            CrudProfesor cp= new CrudProfesor();
            if(cp.crearProfesor(pro)){
              response.sendRedirect(ACTION_REFLESH);
            }else{
              response.sendRedirect(ACTION_ERROR);
            }
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            CrudProfesor cr= new CrudProfesor();
            if(cr.actualizarProfesor(pro)){
              response.sendRedirect(ACTION_REFLESH);
            }else{
              response.sendRedirect(ACTION_ERROR);
            }
        }
    }
}
