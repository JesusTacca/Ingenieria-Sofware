<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header_Estudiante.jsp" />
   <div class="row">
     <table border="1">
       <tr>
         <th>Codigo</th>
         <th>Nombre</th>
         <th>Apellido</th>
         <th>Username</th>
         <th>CUI</th>
       </tr>
      <c:forEach var="var" items="${sessionScope.verEstud}">
        <tr>
          <td>${var.cod}</td>
          <td>${var.nombre}</td>
          <td>${var.apellido}</td>
          <td>${var.username}</td>
          <td>${var.cui}</td>
          <td><a href="editEstudiante.jsp?id=${var.cod}">Editar</a></td>
          <td><a href="../../EliminarEstudiante?val=${var.cod}">Eliminar</a></td>
        </tr>
      </c:forEach>
     </table>
   </div>
<jsp:include page="../inc/footer.jsp" />