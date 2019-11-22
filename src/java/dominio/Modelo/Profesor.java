package dominio.Modelo;

public class Profesor extends Usuario {
    private String grado;
    private String especialidad; 

  public Profesor( int cod, String username, String password, String email, int dni, String nombre, String apellido,String grado, String especialidad) {
    super(cod, username, password, email, dni, nombre, apellido);
    this.grado = grado;
    this.especialidad = especialidad;
  }
  
  public String getGrado() {
    return grado;
  }

  public void setGrado(String grado) {
    this.grado = grado;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }
  
}
