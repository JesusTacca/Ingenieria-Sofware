package dominio.Modelo;

public class Admin extends Usuario{

  public Admin(int cod, String username, String password, String email, int dni, String nombre, String apellido) {
    super(cod, username, password, email, dni, nombre, apellido);
  }

}
