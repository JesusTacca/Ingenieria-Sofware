/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;
import dominio.Modelo.Proyecto;
import repositorio.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dominio.Modelo.Tesis;
import dominio.Modelo.Usuario;
import java.util.ArrayList;
/**
 *
 * @author Lenovo
 */
public class ModeloTesis extends Conexion{
    public boolean crearTesis(Tesis a, String fecha, String titulo)
    {
        boolean base = false;                       //Nuestro ModeloEscuela nos permite tener las funciones
        PreparedStatement pst = null;               //a ejecutar mediante la BD, de la cual ehreda de nuestra 
        try{                            //clase conexion ya que siempre debe estar enlaza para recibir datos.
            String sql= "call createTesis(?,?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1,a.getCodigo());
            pst.setInt(2,a.getEC());
            pst.setString(3,fecha);
            pst.setString(4,titulo);
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
    public boolean deleteTesis(int codigo){
        
        boolean flag = false;                       //Nuestro deleteEscuela se enlaza con el deleteCurso
        PreparedStatement pst = null;               //de nuestra BD de lo cual es un PROCEDURE, solo
        try {                                       //ponemos un parametro y si se encuentra en la Tabla Escuela
            String sql = "call borrarTesis(?)";     //se borrara dicho registro..
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, codigo);            
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
    public boolean updateTesis(Tesis a){
        
        boolean flag = false;                       //Nuestro deleteEscuela se enlaza con el deleteCurso
        PreparedStatement pst = null;               //de nuestra BD de lo cual es un PROCEDURE, solo
        try {                                       //ponemos un parametro y si se encuentra en la Tabla Escuela
            String sql = "call updateTesis(?,?)";     //se borrara dicho registro..
            pst = getConnection().prepareCall(sql);
            pst.setInt(1,a.getCodigo());
            pst.setInt(2,a.getEC());           
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
    public ArrayList<Proyecto> getAllproy(){
        ArrayList<Proyecto> Proyectos = new ArrayList<Proyecto>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallproy();";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Proyectos.add(new Proyecto(rs.getInt("codigo"),rs.getString("titulo"),rs.getString("fecha")));
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
        
        return Proyectos;
        
    }
    public void puntuarProyecto(Usuario u, Proyecto p, int puntuacion){
        ArrayList<Proyecto> Proyectos = new ArrayList<Proyecto>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call puntuarProyecto(?,?,?)";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            pst.setInt(1, u.getCod());
            pst.setInt(2, p.getCodigo());
            pst.setInt(2, puntuacion);
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
    }
}