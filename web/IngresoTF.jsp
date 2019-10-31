<%-- 
    Document   : Pagina2
    Created on : 19/12/2017, 04:00:50 PM
    Author     : David
--%>

<%@page import="dominio.Proyecto.TrabajoFinal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css" type="text/css" media="screen"/>
        <title>JSP Page</title>
    </head>
    <body>

        <%
            Integer dato = 0;
            try {
                TrabajoFinal pdf = (TrabajoFinal) request.getAttribute("row");
                dato = pdf.getCodigo();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            boolean icono = false;
            try {
                icono = (Boolean) request.getAttribute("row2");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        %>

        <form name="formpdf" action="ControllerTF" method="post" enctype="multipart/form-data">
            <div class="datagrid">
                <table>
                    <thead>
                        <tr>
                            <th>Nombre</th>
                            <th>Campo</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <td colspan="2">
                            </td>
                        </tr>
                    </tfoot>
                    <tbody>
                        <tr>
                            <td>
                                <label for="id">Titulo de la TrabajoFinal </label>
                            </td>  
                            <td>
                                <input type="text" name="txtname1" value="<c:out value="${row.titulo}" />" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="id">Fecha de la TrabajoFinal </label>
                            </td>  
                            <td>
                                <input type="text" name="txtname" value="<c:out value="${row.fecha}" />" />
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <label for="id">Tipo de TrabajoFinal </label>
                            </td>  
                            <td>
                                <input type="text" name="txtname2" value="<c:out value="${row.curso_codigo}" />" />
                            </td>
                        </tr>
                        <tr class="alt">
                            <td>
                                <label for="id">Seleccionar PDF: *</label>
                                <%
                                    if (icono) {
                                %>
                                <a href="pdf?id=<%out.print(dato); %>" target="_blank"> Ver Pdf</a>
                                <%
                                    } else {
                                        out.print("No hay Pdf");
                                    }
                                %>
                            </td>  
                            <td>
                                <input type="file" name="fichero" value="" class="btn"/>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align: center"><input type="submit" value="Enviar Archivo" name="submit" id="btn" class="btn"/></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </form>
    </body>
</html>
