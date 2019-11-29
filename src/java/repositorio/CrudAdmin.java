package repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dominio.Modelo.Admin;

public class CrudAdmin extends Conexion{
    
  //Metodo para crear un admin
    public boolean crearAdmin(Admin u){
        boolean flag = false;
        PreparedStatement pst=null;
        try{
            String sql= "call insertar_Admin(?,?,?,?,?,?,?)";
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getUsername());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            if(pst.executeUpdate()== 1){
                flag=true;
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } finally {
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }

        }
        return flag;
    }
    //metodo para autentificar  admin con bool
    public boolean autentificarAdmin(String user,String pass){
        boolean flag=false;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String sql="call verificar_admin(?,?);";
            pst = getConnection().prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs=pst.executeQuery();
            if(rs.absolute(1)){
                flag = true;
            }
        }catch(SQLException e){
            System.err.println(e.getMessage());
        } finally {
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }

        }
        return flag;
    }
    
    //metodo para obtener todos los administradores
    public ArrayList<Admin> getAllAdmin(){
        ArrayList<Admin> aaa = new ArrayList<>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallAdmin();";

            pst = getConnection().prepareCall(sql);
            rs = pst.executeQuery();
            while (rs.next()) { 
                aaa.add(new Admin(rs.getInt("codigo"),rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("dni"), rs.getString("nombres"), rs.getString("apellidos")));
            }
        } catch (SQLException e) {
        }finally{
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }          
        }       
        return aaa; 
    }
    
    //Metodo que devuelve un objeto admin segu un codigo de busqueda
    public Admin getAdmin(int cod){
        Admin adm = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from usuario u where u.codigo = ?;";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) {                
                adm  = new Admin(rs.getInt("codigo"),rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getInt("dni"), rs.getString("nombres"), rs.getString("apellidos"));
            }
            
        } catch (SQLException e) {
        }finally{
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                }
            }            
        }       
        
        return adm;
    }
    
    public boolean actualizarAdmin(Admin u){
        PreparedStatement pst = null;
        boolean flag = false;
        try {
            String sql = "call actualizar_Admin(?,?,?,?,?,?,?)";
            pst = getConnection().prepareStatement(sql);
            pst.setInt(1, u.getCod());
            pst.setString(2, u.getUsername());
            pst.setString(3, u.getPassword());
            pst.setString(4, u.getEmail());
            pst.setInt(5, u.getDni());
            pst.setString(6, u.getNombre());
            pst.setString(7, u.getApellido());
            if(pst.executeUpdate() == 1){
                flag = true;//saber si se actualiza
            }
        } catch (SQLException e) {
        }finally{
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }
        }
        return flag;
    }
    
    public boolean eliminarAdmin(int cod){
        
        boolean flag = false;
        PreparedStatement pst = null;        
        try {
            String sql = "call eliminar_Admin(?)";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);            
            if(pst.executeUpdate() == 1){
                flag = true;
            }            
        } catch (SQLException e) {
        }finally{
            if (getConnection() != null) {
                try {
                    getConnection().close();
                } catch (SQLException e) {
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                }
            }       
        } 
        return flag;
    }
}
