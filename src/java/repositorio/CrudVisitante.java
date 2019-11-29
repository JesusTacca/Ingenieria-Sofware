
package repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dominio.Modelo.Visitante;
import java.util.ArrayList;

public class CrudVisitante extends Conexion{
  
  public boolean crearVisitante(Visitante u){
        boolean flag = false;
        PreparedStatement pst=null;
        try{
            String sql= "call insertar_Visitante(?,?,?,?,?,?,?,?);";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getNombre());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            pst.setInt(8, u.getNum_bancario());
            if(pst.executeUpdate()== 1){
                flag=true;
            }
        }catch (Exception e){
            System.err.println(e.getMessage());
        }finally{
            try{
                if(getConnection() !=null) getConnection().close();
                if(pst !=null) pst.close();
            }catch (SQLException e){
            }
        }
        return flag;
    }
  public boolean autentificarVisitante(String user,String pass){

        boolean flag=false;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String sql="call verificar_visitante(?,?);";
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
    public ArrayList<Visitante> getAllVisitantes(){
        ArrayList<Visitante> Visitantes = new ArrayList<Visitante>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallVisi()";
            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Visitantes.add(new Visitante(rs.getInt("codigo"),rs.getString("username"),"password","email",000000000,rs.getString("nombres"),rs.getString("apellidos"),rs.getInt("num_bancario")));
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
        
        return Visitantes;
        
    }
  public boolean eliminarVisitante(int cod){
        
        boolean flag = false;
        PreparedStatement pst = null;        
        try {
            String sql = "call eliminar_Visitante(?);";
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
}
