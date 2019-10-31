package dominio.Servicio;

import dominio.Modelo.Estudiante;
import dominio.Modelo.Profesor;
import dominio.Modelo.curso;
import java.util.ArrayList;
import repositorio.CrudProfesor;

public class ControlarProfesor {
  public boolean autentificarProfesor(String u,String p){
    CrudProfesor mp = new CrudProfesor();
    return mp.autentificarProfesor(u, p);
  }
  
  public boolean crearProfesor(Profesor p){            
    CrudProfesor mp = new CrudProfesor();
    return mp.crearProfesor(p);
  }
  public boolean actualizarProfesor(Profesor p){
    CrudProfesor mp= new CrudProfesor();
    return mp.actualizarProfesor(p);
  }
  public boolean eliminarProfesor(int p){
    CrudProfesor mp = new CrudProfesor();
    return mp.eliminarProfesor(p);
  }
  public String getProfesorid(int id){
    String htmlcode="";
    CrudProfesor tmp= new CrudProfesor();
    Profesor pr= tmp.getProfesor(id);
   
   htmlcode+= "<form class=\"contact_form\" action='../actualizarprofesor' method=\"POST\">\n" +
           "<ul>"+
           "<li>"+
           "<label for=\"codigo\">CODIGO:</label>"+           
"          <input type=\"text\" name=\"codigo\" readonly value='"+pr.getCod()+"'/><br>"+
           "</li>"+
           "<li>"+    
           "<label for=\"username\">USERNAME:</label>"+ 
"          <input type=\"text\" name=\"username\" value='"+pr.getUsername()+"'/><br>\n" +
           "</li>"+
           "<li>"+   
           "<label for=\"password\">CONTRASEÑA:</label>"+           
"          <input type=\"password\" name=\"password\" value='"+pr.getPassword()+"'/><br>\n" +
           "</li>"+
           "<li>"+ 
           "<label for=\"email\">EMAIL:</label>"+           
"          <input type=\"email\" name=\"email\" value='"+pr.getEmail()+"'/><br>\n" +
           "</li>"+
           "<li>"+   
           "<label for=\"dni\">DNI:</label>"+            
"          <input type=\"text\" name=\"dni\" value='"+pr.getDni()+"'/><br>\n" +
           "</li>"+
           "<li>"+
           "<label for=\"nombre\">NOMBRE:</label>"+            
"          <input type=\"text\" name=\"nombre\" value='"+pr.getNombre()+"'/><br>\n" +
           "</li>"+
           "<li>"+   
           "<label for=\"apellido\">APELLIDO:</label>"+
"          <input type=\"text\" name=\"apellido\" value='"+pr.getApellido()+"'/><br>\n" +
           "</li>"+
           "<li>"+
           "<label for=\"grado\">GRADO:</label>"+
"          <input type=\"text\" name=\"grado\" value='"+pr.getGrado()+"'/><br>\n" +
           "</li>"+
           "<li>"+ 
           "<label for=\"especialidad\">ESPECIALIDAD:</label>"+
"          <input type=\"text\" name=\"especialidad\" value='"+pr.getEspecialidad()+"'/><br>\n" +
           "</li>"+
           "<li>"+            
"          <button type=\"submit\" value=\"Actualizar Datos\"/>Editar</button>" +
           "</li>"+
           "<ul>"+
"        </form>"; 
    return htmlcode;
    
  }
  public ArrayList<Profesor> getAllProfesor(){
    CrudProfesor mp= new CrudProfesor();
    ArrayList<Profesor> ap= mp.getAllProfesor();
    return ap;
  }
  public ArrayList<Estudiante> getallStuProfesor(int c){
    CrudProfesor mp = new CrudProfesor();
    ArrayList<Estudiante> ap = mp.getallStuProfesor(c);
    return  ap;
  }
}
