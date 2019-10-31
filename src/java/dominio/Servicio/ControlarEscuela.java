/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Servicio;
import dominio.Modelo.Escuela;
import java.util.ArrayList;
import repositorio.ModeloEscuela;
/**
 *
 * @author Lenovo
 */
public class ControlarEscuela {
    public boolean crearEscuela(Escuela p){             /* esta clase ControlarEscuela nos ayuda a */
        ModeloEscuela modelop = new ModeloEscuela();    /* manejar las acciones que van a realizarse*/
        return modelop.crearEscuela(p);                 /* al momento de crear, eliminar o modificar nuestra BD*/ 
    }
    public boolean deleteEscuela(int idEscuela){        // creamos nuestras funciones de las cuales cada una
        ModeloEscuela mp = new ModeloEscuela();         // retornamos al crear un nuevo objeto de esa manera
        return mp.deleteEscuela(idEscuela);             // nos facilita la ejecucion de dichas funciones.
    }
    public ArrayList<Escuela> listarEscuelas(){
      ModeloEscuela modelop= new ModeloEscuela();
      return modelop.listar();
    }
}
