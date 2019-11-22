<%@page import="dominio.Modelo.Estudiante"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dominio.Modelo.curso"%>
<%@page import="dominio.Servicio.ControlarCurso"%>
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
    
  <c:when test="${type=='new'}">
    <div class="row p-4">
     
      <div class="col-12">
          <form class="contact_form" action="../controllerprofesor" method="POST" name="contact_form">
            <ul>
              <li>
                <h2>Nuevo Profesor</h2>
                <span class="required_notification">*Todos los campos son requeridos</span>
             </li>
              <li>
                <label for="codigo">Codigo:</label>
                <input type="text" name="codigo" autofocus required />
              </li>
              <li>
                <label for="username">Usuario:</label>
                <input type="text" name="username" required />
              </li>
              <li>
                <label for="password">Contraseña:</label>
                <input type="password" name="password" required />
              </li>
              <li>
                <label for="email">Email:</label>
                <input type="email" name="email" required />
                <span class="form_hint">Formato apropiado "ejemplo@algo.com"</span>
              </li>
              <li>
                <label for="dni">N° DNI:</label>
                <input type="text" name="dni" placeholder="8 digitos" required />
              </li>
              <li>
                <label for="nombre">Nombres:</label>
                <input type="text" name="nombre" placeholder="Ingrese sus nombres" required />
              </li>
              <li>
                <label for="apellido">Apellidos:</label>
                <input type="text" name="apellido" placeholder="Ingrese sus dos apellidos" required />
              </li>
              <li>
                <label for="grado">Grado:</label>
                <input type="text" name="grado" placeholder="Ingrese su grado correspondiente" required />
              </li>
              <li>
                <label for="especialidad">Especialidad:</label>
                <input type="text" name="especialidad" placeholder="Ingrese su especialidad" required />
              </li>
              <li>
                  <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
              </li>
          </ul>
          </form>
      </div>
    </div>
  </c:when>
    
  
  <c:when test="${type=='edit'}">
    <div class="row">
    <div class="col-12">
        <h1>Editar Profesor</h1> 
        <% ControlarProfesor crud= new ControlarProfesor();
           String cod = request.getParameter("id");
        %>
        <%= crud.getProfesorid(Integer.parseInt(cod))%>
    </div>
  </div>
  </c:when>
    
  <c:when test="${type=='alumnos'}">
    <% 
    String id2 = request.getParameter("idcurso");
    String nomc = request.getParameter("nomc");
    String nomp = request.getParameter("nomp");
    
    ControlarProfesor cp2 = new ControlarProfesor();
    ArrayList<Estudiante> cur2 = new ArrayList<Estudiante>();
    cur2 = cp2.getallStuProfesor(Integer.parseInt(id2));
    pageContext.setAttribute("studecurso", cur2);
    
    %>
    <h1 class="text-center">Reporte de Alumnos</h1>
    <h2>CURSO: <%=nomc%></h2>
    <h2>PROFESOR: <%=nomp%></h2>
    
     <table class="table table-responsive">
      <thead class="thead-dark">
       <tr>
         <th>CUI</th>
         <th>Nombre</th>
         <th>Apellido</th>         
         <th>Username</th>
         <th>Email</th>
         <th>DNI</th>
         <th>Año de ingreso</th>
         <th>Acciones</th>
       </tr>
       </thead>
       <tbody>
         <c:forEach items="${pageScope.studecurso}" var="item"> 
          <tr>
            <td>${item.cui}</td>
            <td>${item.nombre}</td>
            <td>${item.apellido}</td>            
            <td>${item.username}</td>
            <td>${item.email}</td>
            <td>${item.dni}</td>
            <td>${item.ingreso}</td>
            <td><a class="btn btn-primary" href="#">Ver Trabajos</a></td>
          </tr>
         </c:forEach>
      </tbody>
     </table>

  </c:when>

  <c:when test="${type=='viewcurso'}">
    <% 
    String id = request.getParameter("id");
    String np = request.getParameter("npro");
    
    %>
    <div class="row">
    <div class="col-12">
      
        <%
            ControlarCurso cp= new ControlarCurso();
            ArrayList<curso> cur = new ArrayList<curso>();
            cur= cp.getCursoforProf(Integer.parseInt(id));
            pageContext.setAttribute("cursos",cur); 
          %>
          <span>Los cursos del profesor <%=np%> </span>  
          <a href="Profesor.jsp?typee=ncp&codd=<%=id%>"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
      
      <table class="table table-responsive">
      <thead class="thead-dark">
       <tr>
         <th>#</th>
         <th>Nombre de Curso</th>
         <th>Semestre</th>
         <th colspan="3">Acciones</th>
       </tr>
       </thead>
       <tbody>
         <c:forEach items="${pageScope.cursos}" var="item"> 
          <tr>
            <td>${item.id}</td>
            <td>${item.nom}</td>
            <td>${item.semestre}</td>
            <td><a class="btn btn-primary" href="Profesor.jsp?typee=alumnos&idcurso=${item.id}&nomp=<%=np%>&nomc=${item.nom}">Alumnos Registrados </a></td>
          </tr>
         </c:forEach>
      </tbody>
     </table>
    </div>
  </div>
  </c:when>
  <c:when test="${type=='ncp'}">
    <%
      String codprofe = request.getParameter("codd");
      
      ControlarCurso cp0 = new ControlarCurso();
      ArrayList<curso> tmp0 = new ArrayList<curso>();
      tmp0 = cp0.listaCurso();
      pageContext.setAttribute("tmpc", tmp0);
    %>
    <div class="row p-4">
      <div class="col-12">
        <h1>Agregar Curso</h1>
        <form  action="../controllercurso">  
          Codigo de profesor<br>
          <input class="form-control" type="text" name="txtprofesor" value="<%=codprofe%>" readonly><br>         
          <div class="input-group mb-3">
            <div class="input-group-prepend">
              <label class="input-group-text" for="inputGroupSelect01">CURSO:</label>
            </div>
            <select class="custom-select" id="codCurso" name="codCurso">
              <option value="0"> Seleccione un curso</option> 
              <c:forEach items="${pageScope.tmpc}" var="item"> 
                <option value="${item.id}"> ${item.nom}</option> 
              </c:forEach>
            </select>
          </div>   
          
          <input class="btn btn-primary" type="submit" name="accion" value="agregarc">
        </form>
      </div>
    </div>
  </c:when>
  <c:otherwise>
  <div class="row pt-4">
    <div class="col-12">
      <span class="display-4">Vista Profesores</span>
      <a href="Profesor.jsp?typee=new"><img src="../assets/img/rs/anadir.png" width="50px" height="50px" alt="Nuevo"/></a>
      
      <table class="table table-responsive">
      <thead class="thead-dark">
       <tr>
         <th>#</th>
         <th>Usuario</th>
         <th>Contraseña</th>
         <th>Email</th>
         <th>DNI</th>
         <th>Nombres</th>
         <th>Apellidos</th>
         <th>Grado</th>
         <th>Especialidad</th>
         <th colspan="3">Acciones</th>
       </tr>
       </thead>
       <tbody>
        <c:forEach var="var2" items="${sessionScope.pr}">
          <tr>
            <td id='id'>${var2.cod}</td>
            <td>${var2.username}</td>
            <td>${var2.password}</td>
            <td>${var2.email}</td>
            <td>${var2.dni}</td>
            <td>${var2.nombre}</td>
            <td>${var2.apellido}</td>
            <td>${var2.grado}</td>
            <td>${var2.especialidad}</td>
            <td><a class="btn btn-primary" href="Profesor.jsp?typee=viewcurso&id=${var2.cod}&npro=${var2.nombre}">Cursos</a></td>
            <td><a href="Profesor.jsp?typee=edit&id=${var2.cod}"><img src="../assets/img/rs/edit.png" width="25px" height="25px" alt="Editar"/></a></td>
        
            <td><a href="../controllerprofesor?id=${var2.cod}&accion=Eliminar"><img src="../assets/img/rs/eliminar.png" width="25px" height="25px" alt="Eliminar"/></a></td>
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
