
package dominio.Modelo;

public class Estudiante extends Usuario{
  private int cui;
  private String ingreso;
  
  public Estudiante() {}
  public Estudiante(int cui, String ingreso, int cod, String username, String password, String email, int dni, String nombre, String apellido) {
    super(cod, username, password, email, dni, nombre, apellido);
    this.cui = cui;
    this.ingreso = ingreso;
  }

  

  public int getCui() {
    return cui;
  }

  public void setCui(int cui) {
    this.cui = cui;
  }

  public String getIngreso() {
    return ingreso;
  }

  public void setIngreso(String ingreso) {
    this.ingreso = ingreso;
  }
  
  
}
