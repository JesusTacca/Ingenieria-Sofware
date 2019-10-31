package dominio.Servicio;

import dominio.Modelo.Admin;
import java.util.ArrayList;
import repositorio.CrudAdmin;

public class ControlarAdmin {
  public boolean crearAdmin(Admin u){
    CrudAdmin ca= new CrudAdmin();
    return ca.crearAdmin(u);
  }
  public boolean autentificarAdmin(String user,String pass){
    CrudAdmin ca= new CrudAdmin();
    return ca.autentificarAdmin(user, pass);
  }
  public ArrayList<Admin> getAllAdmin(){
    CrudAdmin ca= new CrudAdmin();
    return ca.getAllAdmin();
  }
  public String getProfesorid(int id){
    String htmlcode="";
    CrudAdmin tmp= new CrudAdmin();
    Admin pr= tmp.getAdmin(id);
   
   htmlcode+= "<form action='../actualizarprofesor' method=\"POST\">\n" +
"          CODIGO: <input type=\"text\" name=\"codigo\" readonly value='"+pr.getCod()+"'/><br>"+
"          USERNAME: <input type=\"text\" name=\"username\" value='"+pr.getUsername()+"'/><br>\n" +
"          CONTRASEÑA: <input type=\"password\" name=\"password\" value='"+pr.getPassword()+"'/><br>\n" +
"          EMAIL: <input type=\"email\" name=\"email\" value='"+pr.getEmail()+"'/><br>\n" +
"          DNI: <input type=\"text\" name=\"dni\" value='"+pr.getDni()+"'/><br>\n" +
"          NOMBRE: <input type=\"text\" name=\"nombre\" value='"+pr.getNombre()+"'/><br>\n" +
"          APELLIDO<input type=\"text\" name=\"apellido\" value='"+pr.getApellido()+"'/><br>\n" +
"          <input type=\"submit\" value=\"Actualizar Datos\"/>\n" +
"        </form>"; 
    return htmlcode;
    
  }
}
