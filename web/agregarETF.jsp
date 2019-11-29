<%-- 
    Document   : agregarETF
    Created on : 18/07/2019, 09:19:55 AM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <form  action="ControllerETF">       
          Cod<br>
          <input class="form-control" type="text" name="txtCod"><br>     
          <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
          <a href="Controlador?accion=listar">Regresar</a>
        </form>
</html>
