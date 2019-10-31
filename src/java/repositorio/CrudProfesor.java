package repositorio;

import dominio.Modelo.Estudiante;
import repositorio.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dominio.Modelo.Profesor;

public class CrudProfesor extends Conexion{
  
  public boolean crearProfesor(Profesor u){
        boolean flag = false;
        PreparedStatement pst=null;
        try{
            String sql= "call insertar_Profesor(?,?,?,?,?,?,?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getUsername());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            pst.setString(8, u.getGrado());
            pst.setString(9, u.getEspecialidad());
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
  public boolean actualizarProfesor(Profesor u){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call actualizar_Profesor(?,?,?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getUsername());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            pst.setString(8, u.getGrado());
            pst.setString(9, u.getEspecialidad());
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
  public boolean autentificarProfesor(String user,String pass){
        boolean flag=false;
        PreparedStatement pst=null;
        ResultSet rs=null;
 
        try{
            String sql="call verificar_prof(?,?);";
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
  public boolean eliminarProfesor(int cod){
        
        boolean flag = false;
        PreparedStatement pst = null;        
        try {
            String sql = "call eliminar_Profesor(?)";
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
  public Profesor getProfesor(int cod){
        Profesor prof = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "select u.*,p.grado,p.especialidad from usuario u,profesor p where u.codigo = ? and p.codigo = ?;";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);
            pst.setInt(2, cod);
            rs = pst.executeQuery();
            while (rs.next()) {                
                prof  = new Profesor(rs.getInt("codigo"), rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getInt("dni"),rs.getString("nombres"),rs.getString("apellidos"),rs.getString("grado"),rs.getString("especialidad"));
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
        
        return prof;
    } 
  
  public ArrayList<Profesor> getAllProfesor(){
        ArrayList<Profesor> aaa = new ArrayList<Profesor>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallProf();";

            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) { 
                aaa.add(new Profesor(rs.getInt("codigo"),rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("dni"), rs.getString("nombres"), rs.getString("apellidos"),rs.getString("grado"),rs.getString("especialidad")));
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
        return aaa; 
    }

  public ArrayList<Estudiante> getallStuProfesor(int cod) {
    
      ArrayList<Estudiante> aaa = new ArrayList<Estudiante>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "select u.*,es.anioingreso,es.cui from estudiante_curso ec INNER JOIN usuario u ON ec.Estudiante_codigo= u.codigo INNER JOIN estudiante es ON ec.codigo = es.codigo INNER JOIN curso c ON ec.Curso_codigo = c.codigo WHERE ec.Curso_codigo=?;";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) { 
              System.out.println("PAse por aqui");
              aaa.add(new Estudiante(rs.getInt("cui"), rs.getString("anioingreso"), rs.getInt("codigo"), rs.getString("username"),rs.getString("password"), rs.getString("email"), rs.getInt("dni"), rs.getString("nombres"), rs.getString("apellidos")));
            }
        } catch (Exception e) {
          System.out.println("Error: "+e);
        }finally{
            try {
                if(getConnection() != null)getConnection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
            }            
        }       
        return aaa;
  }
}
