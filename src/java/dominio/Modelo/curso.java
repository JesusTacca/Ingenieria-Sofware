// Instanciando la clase curso con sus respectivos getter y setter
package dominio.Modelo;

public class curso {
    int id;
    String nom;
    int Semestre;

    
    public curso(){}
    public curso(int cod, String nom , int semestre) {
        this.id= cod;
        this.nom = nom;
        this.Semestre = semestre;
    }

    public int getSemestre() {
        return Semestre;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
