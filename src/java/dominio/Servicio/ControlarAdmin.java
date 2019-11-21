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
  public String getAdminId(int id){
    String htmlcode="";
    CrudAdmin tmp= new CrudAdmin();
    Admin pr= tmp.getAdmin(id);
   
   htmlcode+= "<form action='../actualizarprofesor' method=\"POST\">\n" +
"          <input placeholder=\"CODIGO\" class=\"form-control\" type=\"text\" name=\"codigo\" readonly value='"+pr.getCod()+"'/><br>"+
"          <input placeholder=\"USERNAME\" class=\"form-control\" type=\"text\" name=\"username\" value='"+pr.getUsername()+"'/><br>\n" +
"          <input placeholder=\"CONTRASEÑA\" class=\"form-control\" type=\"password\" name=\"password\" value='"+pr.getPassword()+"'/><br>\n" +
"          <input placeholder=\"EMAIL\" class=\"form-control\" type=\"email\" name=\"email\" value='"+pr.getEmail()+"'/><br>\n" +
"          <input placeholder=\"DNI\" class=\"form-control\" type=\"text\" name=\"dni\" value='"+pr.getDni()+"'/><br>\n" +
"          <input placeholder=\"NOMBRE\" class=\"form-control\" type=\"text\" name=\"nombre\" value='"+pr.getNombre()+"'/><br>\n" +
"          <input placeholder=\"APELLIDO\" class=\"form-control\" type=\"text\" name=\"apellido\" value='"+pr.getApellido()+"'/><br>\n" +
"          <input class=\"btn btn-primary\" type=\"submit\" name=\"accion\" value=\"Actualizar\">" +
"        </form>"; 
    return htmlcode;
    
  }
}
