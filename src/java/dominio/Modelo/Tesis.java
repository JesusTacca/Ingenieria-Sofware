package dominio.Modelo;

public class Tesis extends Proyecto{
    private int codigo;
    private int Estudiante_Codigo;
    public Tesis( int cod, String titulo, String fecha, int EC) {
        super(cod, titulo, fecha);
        this.codigo=cod;
        this.Estudiante_Codigo=EC;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getEC() {
        return Estudiante_Codigo;
    }

    public void setEC(int codigo) {
        this.Estudiante_Codigo = codigo;
    }
}
