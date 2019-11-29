
package repositorio;

import dominio.Modelo.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CrudEstudianteCurso extends Conexion{
  
  
    public ArrayList<Estudiante> listarEC(int cod) {
        ArrayList<Estudiante>list = new ArrayList<>();
        PreparedStatement pst=null;
        ResultSet rs=null;
        String sql="select usuario.*,estudiante.anioingreso, estudiante.cui from curso inner join estudiante_curso on curso.codigo=estudiante_curso.Curso_codigo\n" +
"inner join estudiante on estudiante.codigo=estudiante_curso.codigo inner join  usuario on usuario.codigo=estudiante.codigo where usuario.codigo=?;";
        try {
 
            pst=getConnection().prepareStatement(sql);
            pst.setInt(1, cod);
            rs=pst.executeQuery();
            while(rs.next()) {
                Estudiante u = new Estudiante();
                 u.setCod(rs.getInt("codigo"));
                 u.setUsername(rs.getString("username"));
                 u.setUsername(rs.getString("username"));
                 u.setUsername(rs.getString("username"));
                 u.setUsername(rs.getString("username"));
                 u.setUsername(rs.getString("username"));
                 

                list.add(u);
            }
        } catch (Exception e) {
        }
        return list;
    }
}
