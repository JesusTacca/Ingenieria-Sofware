package dominio.Modelo;

public class TrabajoFinal extends Proyecto{
    private int codigo;
    private String tipo;
    private int Curso_Codigo;
    
    public TrabajoFinal( int cod, String titulo, String fecha, int CC,String tipo) {
        super(cod, titulo, fecha);
        this.tipo=tipo;
        this.codigo=cod;
        this.Curso_Codigo=CC;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCC() {
        return Curso_Codigo;
    }

    public void setCC(int codigo) {
        this.Curso_Codigo = codigo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
