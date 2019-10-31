package repositorio;

import dominio.Modelo.TrabajoFinal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CrudProFinal extends  Conexion{
  
  //funcion para obtener un reporte de todos los  proyectos finales
public ArrayList<TrabajoFinal> getAllProyectosFinales(int cod_curso){
        ArrayList<TrabajoFinal> aaa = new ArrayList<TrabajoFinal>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "call getallProyectoFinalesxProfesor(?);";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod_curso);
            rs = pst.executeQuery();
            while (rs.next()) { 
                aaa.add(new TrabajoFinal(rs.getInt("codigo"), rs.getString("titulo"), rs.getString("fecha"), rs.getInt("Curso_codigo"), rs.getString("tipo")));
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
}
