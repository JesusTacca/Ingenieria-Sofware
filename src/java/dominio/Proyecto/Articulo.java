package dominio.Proyecto;

import dominio.Proyecto.Proyecto;

public class Articulo extends Proyecto{

  public Articulo( int codigo, String titulo, String fecha, byte[] archivo) {
    super(codigo, titulo, fecha,archivo);
  }
  public Articulo() {
    }
}
