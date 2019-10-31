package dominio.Proyecto;

import dominio.Proyecto.Proyecto;

public class TrabajoFinal extends Proyecto{
  String tipo;
  int curso_codigo;

  public TrabajoFinal( int codigo, String titulo, String fecha, byte[] archivo, String tipo, int curso_codigo) {
    super(codigo, titulo, fecha,archivo);
    this.tipo = tipo;
    this.curso_codigo = curso_codigo;
  }
  public TrabajoFinal() {
    }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public int getCC() {
    return curso_codigo;
  }

  public void setCC(int curso_codigo) {
    this.curso_codigo = curso_codigo;
  }
}
