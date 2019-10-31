package controlador.Proyecto;

import repositorio.sql;
import repositorio.CRUDTesis;
import dominio.Proyecto.Tesis;
import java.io.IOException;
import java.io.InputStream;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import static javax.swing.UIManager.getInt;

@WebServlet(name = "ControllerTesis", urlPatterns = {"/ControllerTesis"})
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB

public class ControladorTesis extends HttpServlet {

    public static final String lIST_STUDENT = "/VerTesis.jsp";
    public static final String INSERT_OR_EDIT = "/IngresoTesis.jsp";

    String estado = null;
    CRUDTesis pdfdao;
    int id_pdf = -1;

    public ControladorTesis() {
        pdfdao = new CRUDTesis();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String forward = "";
        String action = request.getParameter("action");

        if (action.equalsIgnoreCase("delete")) {
            forward = lIST_STUDENT;
            int studentId = Integer.parseInt(request.getParameter("id"));
            pdfdao.Eliminar_PdfVO(studentId);
        }
        if (action.equalsIgnoreCase("edit")) {
            forward = INSERT_OR_EDIT;
            int studentIdM = Integer.parseInt(request.getParameter("id"));
            id_pdf = studentIdM;
            Tesis pdfvo = pdfdao.getPdfVOById(studentIdM);
            request.setAttribute("row", pdfvo);
            boolean boo = false;
            if (pdfvo.getArchivo2() != null) {
                boo = true;
            }
            request.setAttribute("row2", boo);
            estado = "edit";
        } else if (action.equalsIgnoreCase("insert")) {
            forward = INSERT_OR_EDIT;
            estado = "insert";
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Tesis pdfvo = new Tesis();
        sql auto = new sql();
        int nuevoid = auto.auto_increm("SELECT MAX(codigo) FROM proyecto;");
        
        try{
            String name = request.getParameter("txtname1");
            String fecha = request.getParameter("txtname");
            int EC = 1;
            pdfvo.setEC(EC);
            pdfvo.setFecha(fecha);
            pdfvo.setTitulo(name);
        }catch(Exception ex){
            System.out.println("nombre: "+ex.getMessage());
        }

        InputStream inputStream = null;
        try {
            Part filePart = request.getPart("fichero");
            if (filePart.getSize() > 0) {
                System.out.println(filePart.getName());
                System.out.println(filePart.getSize());
                System.out.println(filePart.getContentType());
                inputStream = filePart.getInputStream();
            }
        } catch (Exception ex) {
            System.out.println("fichero: "+ex.getMessage());
        }

        try {
            
            if (estado.equalsIgnoreCase("insert")) {
                pdfvo.setCodigo(nuevoid);
                if (inputStream != null) {
                    pdfvo.setArchivo(inputStream);
                }
                pdfdao.Agregar_PdfVO(pdfvo);
            } else {
                pdfvo.setCodigo(id_pdf);
                if (inputStream != null) {
                    pdfvo.setArchivo(inputStream);
                    pdfdao.Modificar_PdfVO(pdfvo);
                } else {
                    pdfdao.Modificar_PdfVO2(pdfvo);
                }
            }
        } catch (Exception ex) {
            System.out.println("textos: "+ex.getMessage());
        }

        RequestDispatcher view = request.getRequestDispatcher("/VerTesis.jsp");
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
