<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header_Visitante.jsp" />
   <div class="row">
     <table border="1">
       <tr>
         <th>Codigo</th>
         <th>Nombre</th>
         <th>Apellido</th>
         <th>Username</th>
         <th>Targeta</th>
       </tr>
      <c:forEach var="var" items="${sessionScope.verVisit}">
        <tr>
          <td>${var.cod}</td>
          <td>${var.nombre}</td>
          <td>${var.apellido}</td>
          <td>${var.username}</td>
          <td>${var.num_bancario}</td>
          <td><a href="editVisitante.jsp?id=${var.cod}">Editar</a></td>
          <td><a href="../../EliminarVisitante?val=${var.cod}">Eliminar</a></td>
        </tr>
      </c:forEach>
     </table>
   </div>
<jsp:include page="../inc/footer.jsp" />