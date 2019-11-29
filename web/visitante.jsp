<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="visitantes/visiHeader.jsp" />
<style>
  
 #form {
  width: 250px;
  margin: 0 auto;
  height: 50px;
}

#form p {
  text-align: center;
}

#form label {
  font-size: 20px;
}

input[type="radio"] {
  display: none;
}

label {
  color: grey;
}

.clasificacion {
  direction: rtl;
  unicode-bidi: bidi-override;
}

label:hover,
label:hover ~ label {
  color: orange;
}

input[type="radio"]:checked ~ label {
  color: orange;
}
</style>
<div class="container">
   <div class="row text-center">
           <h1 class="text-center">Proyectos subidos</h1>
     <table  style="border-collapse: collapse; width: 100%; background: rgba(214,255,92,0);
background: -moz-linear-gradient(left, rgba(214,255,92,0) 0%, rgba(214,255,92,0.24) 23%, rgba(131,255,15,1) 94%, rgba(131,255,15,0) 100%);
background: -webkit-gradient(left top, right top, color-stop(0%, rgba(214,255,92,0)), color-stop(23%, rgba(214,255,92,0.24)), color-stop(94%, rgba(131,255,15,1)), color-stop(100%, rgba(131,255,15,0)));
background: -webkit-linear-gradient(left, rgba(214,255,92,0) 0%, rgba(214,255,92,0.24) 23%, rgba(131,255,15,1) 94%, rgba(131,255,15,0) 100%);
background: -o-linear-gradient(left, rgba(214,255,92,0) 0%, rgba(214,255,92,0.24) 23%, rgba(131,255,15,1) 94%, rgba(131,255,15,0) 100%);
background: -ms-linear-gradient(left, rgba(214,255,92,0) 0%, rgba(214,255,92,0.24) 23%, rgba(131,255,15,1) 94%, rgba(131,255,15,0) 100%);
background: linear-gradient(to right, rgba(214,255,92,0) 0%, rgba(214,255,92,0.24) 23%, rgba(131,255,15,1) 94%, rgba(131,255,15,0) 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#d6ff5c', endColorstr='#83ff0f', GradientType=1 );">
       <tr>
         <th>Titulo</th>
         <th>Fecha</th>
         <th>Votacion</th>
       </tr>
      <c:forEach var="var" items="${sessionScope.buscarP}">
        <tr>
          <td>${var.titulo}</td>
          <td>${var.fecha}</td>
          <td>${var.codigo}</td>
          <td><a href="editVisitante.jsp?id=${var.codigo}">Ver</a></td>
          <td><a href="../../EliminarVisitante?val=${var.codigo}">puntuar</a></td>
          <td><a  href="../puntuarProyecto?id=${var.codigo},?id=${var.codigo},?id=${var.codigo}" > <p class="clasificacion"  >
    <input id="radio1" type="radio" name="estrellas" value="5"><!--
    --><label for="radio1">&#9829</label><!--
    --><input id="radio2" type="radio" name="estrellas" value="4"><!--
    --><label for="radio2" >&#9829</label><!--
    --><input id="radio3" type="radio" name="estrellas" value="3"><!--
    --><label for="radio3">&#9829</label><!--
    --><input id="radio4" type="radio" name="estrellas" value="2"><!--
    --><label for="radio4">&#9829</label><!--
    --><input id="radio5" type="radio" name="estrellas" value="1"><!--
    --><label for="radio5">&#9829</label>
  </p></a></td>
        </tr>
      </c:forEach>
     </table>
   </div>
</div>
<jsp:include page="visitantes/visiFooter.jsp" />