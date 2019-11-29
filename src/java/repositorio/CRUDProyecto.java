package repositorio;

import dominio.Proyecto.Proyecto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CRUDProyecto {

    /*Metodo listar*/
    public ArrayList<Proyecto> Listar_PdfVO() {
        ArrayList<Proyecto> list = new ArrayList<Proyecto>();
        Conexion conec = new Conexion();
        String sql = "SELECT * FROM proyecto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proyecto vo = new Proyecto();
                vo.setCodigo(rs.getInt(1));
                vo.setTitulo(rs.getString(2));
                vo.setFecha(rs.getString(3));
                vo.setArchivo2(rs.getBytes(4));
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
    public void Agregar_PdfVO(Proyecto vo) {
        Conexion conec = new Conexion();
        String sql = "INSERT INTO proyecto VALUES(?, ?, ?, ?);";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setInt(1, vo.getCodigo());
            ps.setString(2, vo.getTitulo());
            ps.setString(3, vo.getFecha());
            ps.setBlob(4, vo.getArchivo());
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
    public void Modificar_PdfVO(Proyecto vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE proyecto SET titulo = ?, fecha= ?, archivopdf = ? WHERE codigo = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setBlob(3, vo.getArchivo());
            ps.setInt(4, vo.getCodigo());
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
    public void Modificar_PdfVO2(Proyecto vo) {
        Conexion conec = new Conexion();
        String sql = "UPDATE proyecto SET titulo = ?, fecha= ? WHERE codigo = ?;";
        PreparedStatement ps = null;
        try {
            ps = conec.getConnection().prepareStatement(sql);
            ps.setString(1, vo.getTitulo());
            ps.setString(2, vo.getFecha());
            ps.setInt(3, vo.getCodigo());
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
        String sql = "DELETE FROM proyecto WHERE codigo = ?;";
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
    public Proyecto getPdfVOById(int studentId) {
        Proyecto vo = new Proyecto();
        Conexion db = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        String query = "SELECT * FROM proyecto WHERE codigo = ?;";
        try {
            preparedStatement = db.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, studentId);
            rs = preparedStatement.executeQuery();
            while (rs.next()) {
                vo.setCodigo(rs.getInt(1));
                vo.setTitulo(rs.getString(2));
                vo.setArchivo2(rs.getBytes(3));
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
