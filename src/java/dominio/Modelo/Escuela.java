
package dominio.Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import dominio.Modelo.Escuela;

public class Escuela
{
   private int codigo;                              //Creamos nuestra clase Escuela donde tendra 
   private String Nombre;                           //su codigo y Nombre respectivo.
   
   
   public Escuela(){}
   public Escuela(int codigo, String Nombre) {      //crearemos cada funcion que vamos a necesitar
      this.codigo = codigo;                         //y tendremos un puntero hacia nuestros parametros
      this.Nombre = Nombre;                         //tambien crearemos algunos que nos retorne el
   }                                                //dato del codigo y el Nombre.                
   public Escuela(int codigo){
       this.codigo = codigo;
   }
   public Escuela(String Nombre){
       this.Nombre=Nombre;
   }
   public int getId_escuela() {
      return codigo;
   }
   public String getNombre() {
      return Nombre;
   }
   public void setId_escuela(int codigo){
       this.codigo= codigo;
   }
   public void setNombre(String Nombre) {
      this.Nombre = Nombre;
   }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
   
   
}
