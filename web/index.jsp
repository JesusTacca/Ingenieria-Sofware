<jsp:include page="inc/header.jsp" />
<div class="body text-center">
        <form action="login" method="POST" class="form-signin">
            <h1 class="h3 mb-3 font-weight-normal">Login</h1>
            <label for="inputUser" class="sr-only">Username</label>
            <input type="text" id="inputUser" name="username" class="form-control" placeholder="Username" required autofocus>
            
            <label for="inputPassword" class="sr-only">Password</label>
            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
            <div class="checkbox mb-3">
              <label>
                <input type="checkbox" value="Recordarme"> Recordarme
              </label>
            </div>
            <button class="btn btn-lg bg-secondary btn-block" type="submit">Ingresar</button>
            <p class="mt-5 mb-3 text-muted">&copy;2019</p>
        </form>
        
 </div>
<jsp:include page="inc/footer.jsp" />
