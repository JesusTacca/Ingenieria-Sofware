package repositorio;

import dominio.Proyecto.Tesis;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDTesis {

    /*Metodo listar*/
    public ArrayList<Tesis> Listar_PdfVO() {
        ArrayList<Tesis> list = new ArrayList<Tesis>();
        Conexion conec = new Conexion();
        String sql = "SELECT tesis.codigo,tesis.estudiante_codigo,proyecto.titulo,proyecto.fecha,proyecto.archivopdf FROM tesis inner join proyecto on Tesis.codigo=proyecto.codigo;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Tesis vo = new Tesis();
                vo.setCodigo(rs.getInt(1));
                vo.setEC(rs.getInt(2));
                vo.setTitulo(rs.getString(3));
                vo.setFecha(rs.getString(4));
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
    public void Agregar_PdfVO(Tesis vo) {
        Conexion conec = new Conexion();
        String sql = "call createTesis(?, ?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigo());
            ps.setInt(2, vo.getEC());
            ps.setString(3, vo.getTitulo());
            ps.setString(4, vo.getFecha());
            ps.setBlob(5, vo.getArchivo());
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
    public void Modificar_PdfVO(Tesis vo) {
        Conexion conec = new Conexion();
            String sql = "call updateTesis(?,?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setBlob(3, vo.getArchivo());
            ps.setInt(4, vo.getCodigo());
            ps.setInt(5, vo.getEC());
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
    public void Modificar_PdfVO2(Tesis vo) {
        Conexion conec = new Conexion();
        String sql = "call updateTesis(?,?,?,?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setInt(3, vo.getCodigo());
            ps.setInt(4, vo.getEC());
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
        String sql = "call deleteTesis (?);";
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
    public Tesis getPdfVOById(int studentId) {
        Tesis vo = new Tesis();
        Conexion db = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT tesis.codigo,tesis.estudiante_codigo,proyecto.titulo,proyecto.fecha,proyecto.archivopdf FROM tesis inner join proyecto on Tesis.codigo=proyecto.codigo WHERE tesis.codigo = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigo(rs.getInt(1));
                vo.setEC(rs.getInt(2));
                vo.setTitulo(rs.getString(3));
                vo.setFecha(rs.getString(4));
                vo.setArchivo2(rs.getBytes(5));
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
