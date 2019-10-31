<%-- 
    Document   : Pagina1
    Created on : 19/12/2017, 03:29:08 PM
    Author     : David
--%>

<%@page import="dominio.Proyecto.TrabajoFinal"%>
<%@page import="repositorio.CRUDTF"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1>Documentos Administrativos</h1>
    </center>

    <%
        CRUDTF emp = new CRUDTF();
        String cod =request.getParameter("id");
        TrabajoFinal pdfvo = new TrabajoFinal();
        ArrayList<TrabajoFinal> listar = emp.Listar_PdfVObyC(Integer.parseInt(cod));
    %>

    <div class="datagrid">
        <table>
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Titulo</th>
                    <th>Fecha</th>
                    <th>Pdf</th>
                    <th>
                        <a href="ControllerTF?action=insert&id=<%=Integer.parseInt(cod)%>"> <img src="Imagen/nuevo.png" title="Insertar"/></a>
                    </th>
                </tr>
            </thead>
            <tfoot>
                <tr>
                    <td colspan="4">
                        <div id="paging"><ul><li><a href="#"><span>Previous</span></a></li><li><a href="#" class="active"><span>1</span></a></li><li><a href="#"><span>2</span></a></li><li><a href="#"><span>3</span></a></li><li><a href="#"><span>4</span></a></li><li><a href="#"><span>5</span></a></li><li><a href="#"><span>Next</span></a></li></ul>
                        </div>
                </tr>
            </tfoot>
            <tbody>
                <%if (listar.size() > 0) {
                        for (TrabajoFinal listar2 : listar) {
                            pdfvo = listar2;
                %>
                <tr>
                    <td><%=pdfvo.getCodigo()%></td>
                    <td><%=pdfvo.getTitulo()%></td>
                    <td><%=pdfvo.getFecha()%></td>
                    <td>
                        <%
                            if (pdfvo.getArchivo2() != null) {
                        %>
                        <a href="pdf?id=<%=pdfvo.getCodigo()%>" target="_blank"><img src="Imagen/mpdf.png" title="pdf"/></a>
                        <a href="agregarETF.jsp?tipo=mostrar&id=<%= pdfvo.getCC()%>"><img src="img/homework.png" width="25px" height="25px" alt="Trabajos"/></a></td>
           
                        <%
                                } else {
                                    out.print("Vacio");
                                }
                            %>
                    </td>
                <%}
                    }%>
            </tbody>
        </table>
    </div>
</body>
</html>
