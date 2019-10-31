
package repositorio;


import dominio.Modelo.curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class cursoDAO extends Conexion{

    PreparedStatement ps;
    ResultSet rs;
    curso _curso = new curso();

    public ArrayList<curso> listar() {
        ArrayList<curso>list = new ArrayList<>();
        String sql="select * from curso";
        try {
 
            ps=getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()) {
                curso per = new curso();
                per.setId(rs.getInt("codigo"));
                per.setNom(rs.getString("nombre_curso"));
                per.setSemestre (rs.getInt("semestre"));

                list.add(per);
            }
        } catch (Exception e) {
            
        }
        return list;
    }
    public int obtenerid(String usuario) {
        System.out.println("El usuario es "+usuario);
        String sql="select u.codigo  from usuario u where u.username='"+usuario+"'";
        int val=0;
        try {

            ps=getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                val=rs.getInt("codigo");
            }
        } catch (Exception e) {
        }
        System.out.println("El codigo del profe es : "+val);
        return val;
    }

    public curso list(int id) {
        String sql="select * from curso where codigo="+id;
        try {

            ps=getConnection().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                _curso.setId(rs.getInt("codigo"));
                _curso.setSemestre(rs.getInt("semestre"));
                _curso.setNom(rs.getString("nombre_curso"));
   
                
            }
        } catch (Exception e) {
        }
        return _curso;
    }

    public boolean add(int cod, int semestre, String nombre,int cod_es) {
       String sql="call createCurso(?,?,?,?);";
       
       try {
            ps=getConnection().prepareStatement(sql);
            ps.setInt(1, cod);
            ps.setInt(2, semestre);
            ps.setString(3,nombre );
            ps.setInt(4, cod_es);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
       return false;
    }

    public boolean edit(curso _curso){
        System.out.println("Error :efra");
        String sql="update curso set nombre_curso='"+_curso.getNom()+ "',semestre='"+_curso.getSemestre()+ "'where codigo="+_curso.getId();
        try {
            ps=getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
          System.out.println("Error : "+e);
        }
        return false;
    }


    public boolean eliminar(int id) {
        String sql="delete from curso where codigo="+id;
        try {
            ps=getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

  public ArrayList<curso> getCursoforProf(int cod) {
        ArrayList<curso> aaa = new ArrayList<curso>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "SELECT c.* from profesor_curso pc INNER JOIN curso c ON c.codigo=pc.Curso_codigo where pc.Profesor_codigo=?;";

            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) { 
                aaa.add(new curso(rs.getInt("codigo"), rs.getString("nombre_curso"), rs.getInt("semestre")));
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
  
  public curso getCurso(int cod){
        curso cur = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql = "select * from curso where codigo = ?;";
            pst = getConnection().prepareCall(sql);
            pst.setInt(1, cod);
            rs = pst.executeQuery();
            while (rs.next()) {                
                cur  = new curso(rs.getInt("codigo"), rs.getString("nombre_curso"), rs.getInt("semestre"));
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
        
        return cur;
    } 

  public boolean addprof_curso(int codprof, int codcurso) {
    String sql="insert into profesor_curso(Curso_codigo, Profesor_codigo)"
               + "values('"+codcurso+"','"+codprof+"')";
       
       try {
            ps=getConnection().prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
          System.out.println(e);
        }
        
       return false;
  }
    
}
