<jsp:include page="header_Estudiante.jsp" />
<form action="../../InsertarEstudiante" method="POST">
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
<jsp:include page="../inc/footer.jsp" />
