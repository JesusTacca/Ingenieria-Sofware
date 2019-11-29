<%@page import="repositorio.cursoDAO"%>
<%@page import="dominio.Modelo.Estudiante"%>
<%@page import="dominio.Servicio.ControlarEC"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Modelo.curso"%>
<%@page import="dominio.Servicio.ControlarCurso"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="inc/header_user.jsp" />
<div class="container">

<c:set var="type" value="${param.tipo}"></c:set>

<c:choose>
  <c:when test="${type=='addest'}">
    
  </c:when>
  
<c:otherwise>
<% 
    ControlarCurso  tr = new ControlarCurso();
    cursoDAO cdao= new cursoDAO();
    String usuario = (String)session.getAttribute("usuario");
       
    ArrayList<curso> tc= new ArrayList<curso>();
    int codz = cdao.obtenerid(usuario);
    
    tc= tr.getCursoforProf(codz);
%>

<h1 class="text-center">Lista de cursos:</h1>
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
        <%if (tc.size() > 0) {
          for (curso listar2 : tc) { %>
        <tr>
          <td><%= listar2.getId()%></td>
          <td><%= listar2.getNom()%></td>
          <td><%= listar2.getSemestre()%></td>
          <td><a href="proyecto.jsp?tipo=mostrar&id=<%= listar2.getId()%>&idprofe=<%=codz%>"><img src="img/homework.png" width="25px" height="25px" alt="Trabajos"/></a></td>
           <td><a href="profesor.jsp?tipo=addest&id=<%= listar2.getId()%>"><img src="img/presentation.png" width="25px" height="25px" alt="estudiantes con trabajos"/></a></td>

        </tr>
          
        <%}
          
        }%> 
      </tbody>
     </table>
</c:otherwise>
</c:choose>
  </div>
<jsp:include page="inc/footer.jsp" />