<%@page import="dominio.Servicio.ControlarEstudiante"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="inc/header.jsp" />
<div class="container">
  <c:set var="type" value="${param.typee}"></c:set>
  <c:choose>
    
    <c:when test="${type=='new'}">
    <form action="../insertarestudiante" method="POST">
      CODIGO <input type="text" name="codigo"/><br>
      USERNAME: <input type="text" name="username"/><br>
      CONTRASEÑA: <input type="password" name="password"/><br>
      EMAIL: <input type="email" name="email"/><br>
      DNI: <input type="text" name="dni"/><br>
      NOMBRE: <input type="text" name="nombre"/><br>
      APELLIDO<input type="text" name="apellido"/><br>
      CUI: <input type="text" name="cui"/><br>
      AÑO_DE_INGRESO: <input type="text" name="anho"/><br>
      <input type="submit" value="Registrar"/>
    </form>
</c:when>
     <c:when test="${type=='editestu'}">
    <div class="row">
    <div class="col-12">
        <h1>Ingreso de nuevo Profesor</h1> 
        <% ControlarEstudiante crud= new ControlarEstudiante();
           String cod = request.getParameter("id");
        %>
        <%= crud.getEstudianteid(Integer.parseInt(cod))%>
    </div>
  </div>
</c:when>

    <c:otherwise>

      <div class="row">
        <div class="col-12">
          <span class="display-4">Vista Estudiantes</span>
      <a href="Estudiante.jsp?typee=new"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
          <table class="table table-responsive">
            <thead class="thead-dark">
            <tr>
              <th>Codigo</th>
              <th>Nombre</th>
              <th>Apellido</th>
              <th>Username</th>
              <th>CUI</th>
              <th colspan="2">Acciones</th>
            </tr>
           </thead>
           <c:forEach var="var" items="${sessionScope.verEstud}">
             <tr>
               <td>${var.cod}</td>
               <td>${var.nombre}</td>
               <td>${var.apellido}</td>
               <td>${var.username}</td>
               <td>${var.cui}</td>
               <td><a href="Estudiante.jsp?id=${var.cod}&typee=editestu">Editar</a></td>
               <td><a href="../eliminarestudiante?val=${var.cod}">Eliminar</a></td>
             </tr>
           </c:forEach>
          </table>
          </div>
     </div>
      </c:otherwise>
    </c:choose>
   </div>
<jsp:include page="inc/footer.jsp" />

