package repositorio;

import dominio.Proyecto.TrabajoFinal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDTF {

    /*Metodo listar*/
    public ArrayList<TrabajoFinal> Listar_PdfVO() {
        ArrayList<TrabajoFinal> list = new ArrayList<TrabajoFinal>();
        Conexion conec = new Conexion();
        String sql = "SELECT trabajofinal.codigo,trabajofinal.curso_codigo,trabajofinal.tipo,proyecto."
                + "titulo,proyecto.fecha,proyecto.archivopdf FROM trabajofinal inner join proyecto on "
                + "trabajofinal.codigo=proyecto.codigo;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TrabajoFinal vo = new TrabajoFinal();
                vo.setCodigo(rs.getInt(1));
                vo.setCC(rs.getInt(2));
                vo.setTipo(rs.getString(3));
                vo.setTitulo(rs.getString(4));
                vo.setFecha(rs.getString(5));
                vo.setArchivo2(rs.getBytes(6));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    //Metodo para devolver lista de proyectos
    public ArrayList<TrabajoFinal> Listar_PdfVObyC(int cod){
        ArrayList<TrabajoFinal> list = new ArrayList<TrabajoFinal>();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Conexion conec = new Conexion();
        String sql = "SELECT trabajofinal.codigo,trabajofinal.tipo,proyecto.titulo,proyecto.fecha,proyecto.archivopdf FROM trabajofinal \n" +
"		inner join proyecto on trabajofinal.codigo=proyecto.codigo\n" +
"        where trabajofinal.curso_codigo=?;";
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            while (rs.next()) {
                TrabajoFinal vo = new TrabajoFinal();
                vo.setCodigo(rs.getInt(1));
                vo.setTipo(rs.getString(2));
                vo.setCC(cod);
                vo.setTitulo(rs.getString(3));
                vo.setFecha(rs.getString(4));
                System.out.println(vo.getTitulo());
                vo.setArchivo2(rs.getBytes(5));
                list.add(vo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                rs.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
        return list;
    }
    
    

    /*Metodo agregar*/
    public void Agregar_PdfVO(TrabajoFinal vo) {
        Conexion conec = new Conexion();
        String sql = "call createTF(?, ?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigo());
            ps.setInt(2, vo.getCC());
            ps.setString(3, vo.getTipo());
            ps.setString(4, vo.getTitulo());
            ps.setString(5, vo.getFecha());
            ps.setBlob(6, vo.getArchivo());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }
    

    /*Metodo Modificar*/
    public void Modificar_PdfVO(TrabajoFinal vo) {
        Conexion conec = new Conexion();
            String sql = "call updateTesis(?,?,?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setString(3, vo.getTipo());
            ps.setBlob(4, vo.getArchivo());
            ps.setInt(5, vo.getCodigo());
            ps.setInt(6, vo.getCC());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Modificar*/
    public void Modificar_PdfVO2(TrabajoFinal vo) {
        Conexion conec = new Conexion();
        String sql = "call updateTesis(?,?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setString(3, vo.getTipo());
            ps.setInt(4, vo.getCodigo());
            ps.setInt(5, vo.getCC());
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }

    /*Metodo Eliminar*/
    public void Eliminar_PdfVO(int id) {
        Conexion conec = new Conexion();
        String sql = "call deleteTF (?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                ps.close();
                conec.desconectar();
            } catch (Exception ex) {
            }
        }
    }


    /*Metodo Consulta id*/
    public TrabajoFinal getPdfVOById(int studentId) {
        TrabajoFinal vo = new TrabajoFinal();
        Conexion db = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT trabajofinal.codigo,trabajofinal.curso_codigo,trabajofinal.tipo,proyecto."
                + "titulo,proyecto.fecha,proyecto.archivopdf FROM trabajofinal inner join proyecto on "
                + "trabajofinal.codigo=proyecto.codigo WHERE trabajofinal.codigo = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigo(rs.getInt(1));
                vo.setCC(rs.getInt(2));
                vo.setTipo(rs.getString(3));
                vo.setTitulo(rs.getString(4));
                vo.setFecha(rs.getString(5));
                vo.setArchivo2(rs.getBytes(6));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                preparedStatement.close();
                db.desconectar();
            } catch (Exception ex) {
            }
        }
        return vo;
    }

}
