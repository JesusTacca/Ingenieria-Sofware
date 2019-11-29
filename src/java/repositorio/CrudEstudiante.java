
package repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dominio.Modelo.Estudiante;
import java.util.ArrayList;


public class CrudEstudiante extends Conexion{
  
  //metodo para crear un estudiante con conexion a Base de Datos
  public boolean crearEstudiante(Estudiante u){
        boolean flag = false;
        PreparedStatement pst=null;
        try{
            String sql= "call insertar_Estudiante(?,?,?,?,?,?,?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getNombre());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            pst.setString(8, u.getIngreso());
            pst.setInt(9, u.getCui());
            //
            //
            if(pst.executeUpdate()== 1){
                flag=true;
            }
        }catch (Exception e){
          System.out.println("Errrror: "+ e);
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
            }catch (SQLException e){
            }
        }
        return flag;
    }
  
  //metodo para el update de un estudiante
  public boolean actualizarestudiante(Estudiante u){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call actualizar_Estudiante(?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getUsername());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            pst.setString(8, u.getIngreso());
            pst.setInt(9, u.getCui());
            if(pst.executeUpdate() == 1){
                flag = true;//saber si se actualiza
            }
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection() != null)getConnection().close();
                if(pst != null)pst.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
  
  //metodo para autentificar estudiante atraves de un user y password
  public boolean autentificarEstudiante(String user,String pass){
        boolean flag=false;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String sql="call verificar_Estudiante(?,?);";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs=pst.executeQuery();
            if(rs.absolute(1)){
                flag = true;
            }
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                if(rs != null) rs.close();
            }catch(Exception e){
            }
        }
        return flag;
    }
  public boolean eliminarEstudiante(int cod){
        
        boolean flag = false;
        PreparedStatement pst = null;        
        try {
            String sql = "call eliminar_Estudiante(?)";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);            
            if(pst.executeUpdate() == 1){
                flag = true;
            }            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection() != null)getConnection().close();
                if(pst != null)pst.close();                
            } catch (Exception e) {
            
            }            
        } 
        return flag;
    }
  public ArrayList<Estudiante> getAllEstudiantes(){
        ArrayList<Estudiante> Estudiantes = new ArrayList<Estudiante>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallEstu()";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Estudiantes.add(new Estudiante(rs.getInt("cui"),rs.getString("anioingreso"),rs.getInt("codigo"),rs.getString("username"),"password","email",000000000,rs.getString("nombres"),rs.getString("apellidos")));
            }
            
        }catch(Exception e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
                if(rs != null) rs.close();
            }catch(Exception e){
            }
        }       
        
        return Estudiantes;
        
    }
    public boolean asignarCurso_Estudiante(int cod,int es,int c){
        boolean flag = false;
        PreparedStatement pst=null;
        try{
            String sql= "call asignar_Estudiante(?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, cod);
            pst.setInt(2, es);
            pst.setInt(3, c);
            //
            //
            if(pst.executeUpdate()== 1){
                flag=true;
            }
        }catch (Exception e){
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
            }catch (SQLException e){
            }
        }
        return flag;
    }

  public Estudiante getEstudiante(int id) {
        Estudiante est = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "select u.*,e.anioingreso,e.cui from usuario u,estudiante e where u.codigo = ? and e.codigo = ?;";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, id);
            pst.setInt(2, id);
            rs = pst.executeQuery();
            while (rs.next()) {                
                est  = new Estudiante(rs.getInt("cui"),rs.getString("anioingreso"),rs.getInt("codigo"),rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getInt("dni"),rs.getString("nombres"),rs.getString("apellidos"));
            }
            
        } catch (Exception e) {
        }finally{
            try {
                if(getConnection() != null)getConnection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
            
            }            
        }       
        
        return est;
    } 
  
  
        
}
