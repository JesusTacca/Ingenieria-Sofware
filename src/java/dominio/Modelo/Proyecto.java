package dominio.Modelo;
public class Proyecto {
    private int codigo;
    private String titulo;
    private String fecha;

    public Proyecto(int cod, String titulo, String fecha) {
        this.codigo = cod;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String username) {
        this.titulo = username;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
