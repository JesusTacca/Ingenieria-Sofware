<jsp:include page="inc/header.jsp" />

<div class="body text-center ">
<form action="insertarvisitante" method="POST"  class="form-signin">
  <h1 class="h3 mb-3 font-weight-normal">Registrate como visitante</h1>
  
  <input type="text" name="codigo" class="form-control" placeholder="Codigo" required autofocus/><br>
  <input type="text" name="username" class="form-control" placeholder="Username" required/><br>
  <input type="password" name="password" class="form-control" placeholder="Contraseña" required/><br>
  <input type="email" name="email" class="form-control" placeholder="Email" required/><br>
  <input type="text" name="dni" class="form-control" placeholder="Numero de DNI" required/><br>
  <input type="text" name="nombre" class="form-control" placeholder="Nombres" required/><br>
  <input type="text" name="apellido" class="form-control" placeholder="Apellido" required/><br>
  <input type="text" name="tarjeta" class="form-control" placeholder=" N° Tarjeta de Credio" required/><br>
  <div class="checkbox mb-3">
    <label>
      <small class="text-danger">Se le aplicara el cargo a su tarjeta despues de registrarse en el Sistema</small>
    </label>
  </div>
  <button class="btn btn-lg bg-success btn-block" type="submit">Registrar</button>
</form>
</div>
<jsp:include page="inc/footer.jsp" />