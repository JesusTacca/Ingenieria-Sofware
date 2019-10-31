package controlador.Proyecto;

import repositorio.sql;
import repositorio.CRUDTF;
import dominio.Proyecto.TrabajoFinal;
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

@WebServlet(name = "ControllerTF", urlPatterns = {"/ControllerTF"})
@MultipartConfig(maxFileSize = 16177215)    // upload file's size up to 16MB

public class ControladorTF extends HttpServlet {

    public static final String lIST_STUDENT = "/profesor.jsp";
    public static final String INSERT_OR_EDIT = "/IngresoTF.jsp";

    String estado = null;
    CRUDTF pdfdao;
    int id_pdf = -1;
    int cc = -1;

    public ControladorTF() {
        pdfdao = new CRUDTF();
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
            TrabajoFinal pdfvo = pdfdao.getPdfVOById(studentIdM);
            request.setAttribute("row", pdfvo);
            boolean boo = false;
            if (pdfvo.getArchivo2() != null) {
                boo = true;
            }
            request.setAttribute("row2", boo);
            estado = "edit";
        } else if (action.equalsIgnoreCase("insert")) {
            forward = INSERT_OR_EDIT;
            int studentIdM = Integer.parseInt(request.getParameter("id"));
            cc = studentIdM;
            estado = "insert";
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        TrabajoFinal pdfvo = new TrabajoFinal();
        sql auto = new sql();
        int nuevoid = auto.auto_increm("SELECT MAX(codigo) FROM proyecto;");
        
        try{
            String name = request.getParameter("txtname1");
            String fecha = request.getParameter("txtname");
            String tipo = request.getParameter("txtname2");
            pdfvo.setCC(cc);
            System.out.println("este codd:"+cc);
            pdfvo.setTipo(tipo);
            System.out.println("este codd:"+fecha);
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

        RequestDispatcher view = request.getRequestDispatcher("/profesor.jsp");
        view.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
