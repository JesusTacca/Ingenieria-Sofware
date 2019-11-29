<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="inc/header.jsp" />
<div class="container fondo pb-4">
 
  <c:set var="type" value="${param.typee}"></c:set>
  
  <c:choose>
    <c:when test="${type=='newEscuela'}">
    <div class="row p-4">
     
      <div class="col-12">
    
        
        <h1>Agregar Curso</h1>
        <form  action="../controllercurso">       
          Cod<br>
          <input class="form-control" type="text" name="txtCod"><br>
          Nombre:<br>
          <input class="form-control" type="text" name="txtNom"><br>
          Semestre:<br>
          <input class="form-control" type="text" name="txtSemestre"><br>
          
    
          
          <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
        </form>
      </div>
    </div>
  </c:when>
  <c:when test="${type=='editEscuela'}">
    <h1>Editar escuela</h1>
  </div>
  </c:when>
    
  <c:otherwise>
  <div class="row pt-4">   
    <div class="col-12">
      <span class="display-4">Escuelas Registradas</span>
      <a href="Curso.jsp?typee=newEscuela"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
      <table class="table table-responsive">
      <thead class="thead-dark">
       <tr>
         <th>#</th>
         <th>Nombre</th>         
         <th colspan="2">Acciones</th>
       </tr>
       </thead>
       <tbody>
        <c:forEach var="var4" items="${sessionScope.esc2}">
          <tr>
            <td>${var4.codigo}</td>
            <td>${var4.nombre}</td>
           
            <td><a href="Escuela.jsp?typee=editEscuela&id=${var4.codigo}"><img src="../assets/img/rs/edit.png" width="25px" height="25px" alt="Editar"/></a></td>
        
            <td><a href="../eliminarescuela?idEscuela=${var4.codigo}"><img src="../assets/img/rs/eliminar.png" width="25px" height="25px" alt="Eliminar"/></a></td>
          </tr>
        </c:forEach>
      </tbody>
     </table>
    </div>
    
   </div>
  </c:otherwise>
  </c:choose>
</div>
<jsp:include page="inc/footer.jsp" />