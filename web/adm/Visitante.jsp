<%@page import="dominio.Servicio.ControlarEstudiante"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="inc/header.jsp" />
<div class="container">

      <div class="row">
        <div class="col-12">
          <span class="display-4">Vista Visitantes</span>
          <table class="table table-responsive" >
            <thead class="thead-dark">
            <tr>
              <th>Codigo</th>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Username</th>
              <th>Targeta</th>
              <th colspan="2">Acciones</th>
            </tr>
            </thead>
           <c:forEach var="var" items="${sessionScope.verVisit}">
             <tr>
               <td>${var.cod}</td>
               <td>${var.nombre}</td>
               <td>${var.apellido}</td>
               <td>${var.username}</td>
               <td>${var.num_bancario}</td>
               <td><a href="editVisitante.jsp?id=${var.cod}">Editar</a></td>
               <td><a href="../eliminarvisitante?val=${var.cod}">Eliminar</a></td>
             </tr>
           </c:forEach>
          </table>
          </div>
     </div>
   </div>
<jsp:include page="inc/footer.jsp" />
