
package dominio.Servicio;

import dominio.Modelo.Estudiante;
import java.util.ArrayList;
import repositorio.CrudEstudiante;
import repositorio.CrudEstudianteCurso;

public class ControlarEstudiante {
  public String getEstudianteid(int id){
    String htmlcode="";
    CrudEstudiante tmp= new CrudEstudiante();
    Estudiante pr= tmp.getEstudiante(id);
   
   htmlcode+= "<form action='../actualizarestudiante' method=\"POST\">\n" +
"          CODIGO: <input type=\"text\" name=\"codigo\" readonly value='"+pr.getCod()+"'/><br>"+
"          USERNAME: <input type=\"text\" name=\"username\" value='"+pr.getUsername()+"'/><br>\n" +
"          CONTRASEÑA: <input type=\"password\" name=\"password\" value='"+pr.getPassword()+"'/><br>\n" +
"          EMAIL: <input type=\"email\" name=\"email\" value='"+pr.getEmail()+"'/><br>\n" +
"          DNI: <input type=\"text\" name=\"dni\" value='"+pr.getDni()+"'/><br>\n" +
"          NOMBRE: <input type=\"text\" name=\"nombre\" value='"+pr.getNombre()+"'/><br>\n" +
"          APELLIDO<input type=\"text\" name=\"apellido\" value='"+pr.getApellido()+"'/><br>\n" +
"          CUI<input type=\"text\" name=\"anho\" value='"+pr.getCui()+"'/><br>\n" +
"          Año de Ingreso<input type=\"text\" name=\"cui\" value='"+pr.getIngreso()+"'/><br>\n" +
"          <input type=\"submit\" value=\"Actualizar Datos\"/>\n" +
"        </form>"; 
    return htmlcode;
    
  }
  public ArrayList<Estudiante> listarEC(int cod) {
    CrudEstudianteCurso cr= new CrudEstudianteCurso();
    return cr.listarEC(cod);
  }
}
