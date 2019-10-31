package dominio.Servicio;

import dominio.Modelo.Estudiante;
import java.util.ArrayList;
import repositorio.CrudEstudianteCurso;

public class ControlarEC {
      public ArrayList<Estudiante> listarEC(int cod) {
        CrudEstudianteCurso cec= new CrudEstudianteCurso();
        return cec.listarEC(cod);
      }

}
