package dominio.Proyecto;

import java.io.InputStream;

public class Proyecto {

    /*Todo los atributos*/
    int codigo;
    String titulo;
    String fecha;
    InputStream archivopdf;
    private byte[] archivopdf2;

    public Proyecto(int id, String name, String fecha, byte[] archivo) {
        this.codigo = id;
        this.titulo = name;
        this.fecha=fecha;
        this.archivopdf2 = archivo;
    }

    public Proyecto() {
    }

    /*Todo los codigos get*/
    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getFecha() {
        return fecha;
    }

    public InputStream getArchivo() {
        return archivopdf;
    }


    /*Todo los codigos set*/
    public void setCodigo(int codigopdf) {
        this.codigo = codigopdf;
    }

    public void setTitulo(String nombrepdf) {
        this.titulo = nombrepdf;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setArchivo(InputStream archivopdf) {
        this.archivopdf = archivopdf;
    }

    /**
     * @return the archivopdf2
     */
    public byte[] getArchivo2() {
        return archivopdf2;
    }

    /**
     * @param archivopdf2 the archivopdf2 to set
     */
    public void setArchivo2(byte[] archivopdf2) {
        this.archivopdf2 = archivopdf2;
    }

}
