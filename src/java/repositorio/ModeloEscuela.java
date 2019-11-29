/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import repositorio.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dominio.Modelo.Escuela;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class ModeloEscuela extends Conexion{
    public boolean crearEscuela(Escuela a)
    {
        boolean base = false;                       //Nuestro ModeloEscuela nos permite tener las funciones
        PreparedStatement pst = null;               //a ejecutar mediante la BD, de la cual ehreda de nuestra 
        try{                            //clase conexion ya que siempre debe estar enlaza para recibir datos.
            String sql= "call createEscuela(?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1,a.getId_escuela());
            pst.setString(2,a.getNombre());
            if(pst.executeUpdate() == 1){           //En el caso de crearEscuela definimos el nombre
                base =true;                         //los parametros que vamos a crear y si no existe dicha
            }                                       //BD nos mandara un error cerrando la conexion de la BD.
        }catch (Exception b){
            System.err.println(b.getMessage());
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
            }catch (SQLException b){
                
            }
        }
        return base;
    }
    public boolean deleteEscuela(int idEscuela){
        
        boolean flag = false;                       //Nuestro deleteEscuela se enlaza con el deleteCurso
        PreparedStatement pst = null;               //de nuestra BD de lo cual es un PROCEDURE, solo
        try {                                       //ponemos un parametro y si se encuentra en la Tabla Escuela
            String sql = "call borrarEscuela(?)";     //se borrara dicho registro..
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, idEscuela);            
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
    public boolean updateEscuela(Escuela a){
        
        boolean flag = false;                       //Nuestro deleteEscuela se enlaza con el deleteCurso
        PreparedStatement pst = null;               //de nuestra BD de lo cual es un PROCEDURE, solo
        try {                                       //ponemos un parametro y si se encuentra en la Tabla Escuela
            String sql = "call updateEscuela(?,?)";     //se borrara dicho registro..
            pst = getConnection().prepareCall(sql);
            pst.setInt(1,a.getId_escuela());
            pst.setString(2,a.getNombre());           
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

  public ArrayList<Escuela> listar() {
    ArrayList<Escuela> list = new ArrayList<>();
    PreparedStatement ps;
    ResultSet rs;
    String sql = "select * from escuela";
    try {

      ps = getConnection().prepareStatement(sql);
      rs = ps.executeQuery();
      while (rs.next()) {
        Escuela es = new Escuela();
        es.setId_escuela(rs.getInt("codigo"));
        es.setNombre(rs.getString("nombre"));
        list.add(es);
      }
    } catch (Exception e) {

    }
    return list;
  }
}