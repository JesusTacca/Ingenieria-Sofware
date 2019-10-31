<%@page import="dominio.Servicio.ControlarEscuela"%>
<%@page import="dominio.Modelo.Escuela"%>
<%@page import="dominio.Servicio.ControlarCurso"%>
<%@page import="dominio.Modelo.Profesor"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Servicio.ControlarProfesor"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="inc/header.jsp" />

<div class="container fondo pb-4">
  <div class="row">
    <div class="col-12">
      <img src="assets/img/padmin.jpg" class="img-fluid" alt="Banner profesor">
    </div>
  </div>
  <c:set var="type" value="${param.typee}"></c:set>
  
  <c:choose>
    <c:when test="${type=='newCurso'}">
    <div class="row p-4">
     
      <div class="col-12">
    <%
      String codprofe = request.getParameter("codd");
      
      ControlarEscuela cp0 = new ControlarEscuela();
      ArrayList<Escuela> tmp0 = new ArrayList<Escuela>();
      tmp0 = cp0.listarEscuelas();
      pageContext.setAttribute("tmpc", tmp0);
    %>
        
        <h1>Agregar Curso</h1>
        <form  action="../controllercurso">       
          Cod<br>
          <input class="form-control" type="text" name="txtCod"><br>
          Nombre:<br>
          <input class="form-control" type="text" name="txtNom"><br>
          Semestre:<br>
          <input class="form-control" type="text" name="txtSemestre"><br>
          
          <div class="input-group mb-3">
            <div class="input-group-prepend">
              <label class="input-group-text" for="inputGroupSelect01">ESCUELA PROFESIONAL:</label>
            </div>
            <select class="custom-select" id="codEscuela" name="codEscuela">
              <option value="0"> Seleccione una Escuela</option> 
              <c:forEach items="${pageScope.tmpc}" var="item"> 
                <option value="${item.codigo}"> ${item.nombre}</option> 
              </c:forEach>
            </select>
          </div> 
    
          
          <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
        </form>
      </div>
    </div>
  </c:when>
  <c:when test="${type=='editCurso'}">
    <div class="row">
    <div class="col-12">
        <h1>Edita este  Curso</h1> 
        <% ControlarCurso crud= new ControlarCurso();
           String cod = request.getParameter("id");
        %>
        <%= crud.getCursoEdit(Integer.parseInt(cod))%>
    </div>
  </div>
  </c:when>
    
  <c:otherwise>
  <div class="row pt-4">   
    <div class="col-12">
      <span class="display-4">Vista Cursos</span>
      <a href="Curso.jsp?typee=newCurso"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
      <table class="table table-responsive">
      <thead class="thead-dark">
       <tr>
         <th>#</th>
         <th>Curso</th>
         <th>Semestre</th>
         
         <th colspan="2">Acciones</th>
       </tr>
       </thead>
       <tbody>
        <c:forEach var="var3" items="${sessionScope.cr}">
          <tr>
            <td>${var3.id}</td>
            <td>${var3.nom}</td>
            <td>${var3.semestre}</td>
           
            <td><a href="Curso.jsp?typee=editCurso&id=${var3.id}"><img src="../assets/img/rs/edit.png" width="25px" height="25px" alt="Editar"/></a></td>
        
            <td><a href="../controllercurso?id=${var3.id}&accion=eliminar"><img src="../assets/img/rs/eliminar.png" width="25px" height="25px" alt="Eliminar"/></a></td>
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