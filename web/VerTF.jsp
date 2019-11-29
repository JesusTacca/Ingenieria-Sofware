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
        TrabajoFinal pdfvo = new TrabajoFinal();
        ArrayList<TrabajoFinal> listar = emp.Listar_PdfVO();
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
                        <a href="ControllerTesis?action=insert&id=0"> <img src="Imagen/insert.png" title="Insertar"/></a>-
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
                            <%
                                } else {
                                    out.print("Vacio");
                                }
                            %>
                    </td>
                    <td>
                        <a href="ControllerTesis?action=edit&id=<%=pdfvo.getCodigo()%>"> <img src="Imagen/editar.png" title="Modificar"/></a>-
                        <a href="ControllerTesis?action=delete&id=<%=pdfvo.getCodigo()%>"> <img src="Imagen/delete.png" title="Eliminar"/></a>
                    </td>
                </tr>
                <%}
                    }%>
            </tbody>
        </table>
    </div>
</body>
</html>
