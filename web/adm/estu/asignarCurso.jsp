<jsp:include page="header_Estudiante.jsp" />
<form action="../../AsignarEstudiante" method="POST">
  CODIGO <input type="text" name="cod"/><br>
  Estudiante: <input type="text" name="estudiante"/><br>
  Curso: <input type="text" name="curso"/><br>
  <input type="submit" value="Registrar"/>
</form>
<jsp:include page="../inc/footer.jsp" />
