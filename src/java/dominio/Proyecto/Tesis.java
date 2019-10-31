package dominio.Proyecto;

import dominio.Proyecto.Proyecto;

public class Tesis extends Proyecto{
  int estudiante_codigo;

  public Tesis( int codigo, String titulo, String fecha, byte[] archivo, int estudiante_codigo) {
    super(codigo, titulo, fecha,archivo);
    this.estudiante_codigo = estudiante_codigo;
  }
  public Tesis() {
    }
  public int getEC() {
    return estudiante_codigo;
  }

  public void setEC(int estudiante_codigo) {
    this.estudiante_codigo = estudiante_codigo;
  }
  
}
