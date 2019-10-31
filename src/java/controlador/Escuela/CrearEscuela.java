package controlador.Escuela;
import dominio.Modelo.Escuela;
import repositorio.ModeloEscuela;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CrearCurso", urlPatterns = {"/crearcurso"})
public class CrearEscuela extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {                 //Nuestra clase CrearCuros e enlazara
            String id_escuela = request.getParameter("Id_Escuela");    //con nuestro Objeto Escuela para
            String Nombre = request.getParameter("username");          //poder crear dicho Obejto en nuestra
                                                                   //tabla escuela donde tendra como parametros
            Escuela user=new Escuela(Integer.parseInt(id_escuela), Nombre); //el id_Escuela y el Nombre
            ModeloEscuela nuevo = new ModeloEscuela();  //Crearemos un nuevo ModuloEscuela donde se creara el objeto
            if (nuevo.crearEscuela(user)){              //Si se cumple dichos requisitos nos redirecionara
                response.sendRedirect("acep/AceptoInsert.jsp");    //a nuestra pagina prueba.jps
            }else{
                response.getWriter().print("Error de la base de datos");    //Si no es asi nos bota ERROR
            }
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
