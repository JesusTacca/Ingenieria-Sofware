package dominio.Modelo;

public class Articulo extends Proyecto{
    private int codigo;
    public Articulo( int cod, String titulo, String fecha) {
        super(cod, titulo, fecha);
        this.codigo=cod;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
