<%@page import="dominio.Servicio.ControlarAdmin"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="inc/header.jsp" />

 <div class="container">
     
  <c:set var="type" value="${param.typee}"></c:set>
  
  <c:choose>
    <c:when test="${type=='newadmin'}">
      <div class="row">
        <div class="col-6">
            <h1>Ingreso de nuevo Administrador</h1>
            <form action="../controlleradmin" method="POST">
               <input class="form-control" type="text" name="codigo" placeholder="CODIGO"/><br>
                <input class="form-control" type="text" name="username" placeholder="USERNAME"/><br>
                <input class="form-control" type="password" name="password" placeholder="CONTRASEÑA"/><br>
                <input class="form-control" type="email" name="email" placeholder="EMAIL"/><br>
                <input class="form-control" type="text" name="dni" placeholder="DNI"/><br>
                <input class="form-control" type="text" name="nombre" placeholder="NOMBRE"/><br>
                <input class="form-control" type="text" name="apellido" placeholder="APELLIDO"/><br>
                
              <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
            </form>
        </div>
      </div>
    </c:when>
    
      <c:when test="${type=='editadmin'}">
        <div class="row">
        <div class="col-6">
            <h1>Editar cuenta de Administrador</h1> 
            <% ControlarAdmin crud= new ControlarAdmin();
               String cod = request.getParameter("id");
            %>
            <%= crud.getAdminId(Integer.parseInt(cod))%>
        </div>
      </div>
      </c:when>
    <c:otherwise>
      <span class="display-4">Vista Administradores</span>
      <a href="Administrador.jsp?typee=newadmin"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
      
      <div class="row">
     <table class="table table-responsive" >
       <thead class="thead-dark">
       <tr>
         <th>Codigo</th>
         <th>Usuario</th>
         <th>Contraseña</th>
         <th>Email</th>
         <th>DNI</th>
         <th>Nombres</th>
         <th>Apellidos</th>
         <th colspan="2">Acciones</th>
       </tr>
       </thead>
      <c:forEach var="var" items="${sessionScope.veradmin}">
        <tr>
          <td>${var.cod}</td>
          <td>${var.username}</td>
          <td>${var.password}</td>
          <td>${var.email}</td>
          <td>${var.dni}</td>
          <td>${var.nombre}</td>
          <td>${var.apellido}</td>
          <td><a href="Administrador.jsp?typee=editadmin&id=${var.cod}"><img src="../assets/img/rs/edit.png" width="25px" height="25px" alt="Editar"/></a></td>
          <td><a href="../controlleradmin?id=${var.cod}&accion=Eliminar"><img src="../assets/img/rs/eliminar.png" width="25px" height="25px" alt="Eliminar"/></a></td>
        </tr>
      </c:forEach>
     </table>
   </div>
    </c:otherwise>
  </c:choose>
  
   
   
   
 </div>
<jsp:include page="inc/footer.jsp" />