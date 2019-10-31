
package dominio.Servicio;

import dominio.Modelo.curso;
import java.util.ArrayList;
import repositorio.cursoDAO;

public class ControlarCurso {
    public boolean add(int id, int semestre,String nombre,int cod_es) {
        cursoDAO modelop = new cursoDAO();    /* manejar las acciones que van a realizarse*/
        return modelop.add(id,semestre,nombre,cod_es);
    }
    public boolean addprof_curso(int codprof,int codcurso) {
      System.out.println(codprof + " _ "+codcurso);
        cursoDAO modelop = new cursoDAO();    /* manejar las acciones que van a realizarse*/
        return modelop.addprof_curso(codprof,codcurso);
    }
    
    public boolean edit(curso _curso){
        cursoDAO modelop = new cursoDAO();    /* manejar las acciones que van a realizarse*/
        return modelop.edit(_curso);
    }
    public boolean eliminar(int id){
        cursoDAO modelop = new cursoDAO();    /* manejar las acciones que van a realizarse*/
        return modelop.eliminar(id);
    }
    public ArrayList<curso> listaCurso(){
      cursoDAO modelop= new cursoDAO();
      return modelop.listar();
    }
   public ArrayList<curso> getCursoforProf(int cod){
    cursoDAO mp= new cursoDAO();
    ArrayList<curso> ap= mp.getCursoforProf(cod);
    return ap;
  }
   public String getCursoEdit(int id){
    String htmlcode="";
    cursoDAO tmp= new cursoDAO();
    curso pr= tmp.getCurso(id);
   htmlcode+= "<form class=\"contact_form\"  action='../controllercurso' method=\"POST\" >\n" +
           "<ul>"+
           "<li>"+
           "<label for=\"codigo\">CODIGO:</label>"+
"          <input type=\"text\" name=\"txtCod\" readonly value='"+pr.getId()+"'/><br>"+
           "</li>"+
           "<li>"+
           "<label for=\"codigo\">NOMBRE DE CURSO:</label>"+
"          <input type=\"text\" name=\"txtNom\" value='"+pr.getNom()+"'/><br>\n" +
           "</li>"+
           "<li>"+
           "<label for=\"codigo\">SEMESTRE:</label>"+           
           "<input type=\"text\" name=\"txtSemestre\" value='"+pr.getSemestre()+"'/><br>\n" +
           "</li>"+
           "<li>"+
           "<button class=\"submit\" name=\"accion\" type=\"submit\" value=\"Actualizar\"/>Editar</button>" +
           "</li>"+
           "</ul>"+
"        </form>"; 
    return htmlcode;
    
  }
   
}
