package dominio.Modelo.valueObject;

import dominio.Modelo.Estudiante;
import dominio.Modelo.curso;

public class EstudianteCurso {
    Estudiante estudiante;
    curso curso;

  public EstudianteCurso(Estudiante estudiante, curso curso) {
    this.estudiante = estudiante;
    this.curso = curso;
  }

  public Estudiante getEstudiante() {
    return estudiante;
  }

  public void setEstudiante(Estudiante estudiante) {
    this.estudiante = estudiante;
  }

  public curso getCurso() {
    return curso;
  }

  public void setCurso(curso curso) {
    this.curso = curso;
  }
    
}
