package dominio.Servicio;
import dominio.Modelo.Tesis;
import repositorio.ModeloTesis;

public class ControlarTesis {
    public boolean crearTesis(Tesis p,String a,String b){             /* esta clase ControlarEscuela nos ayuda a */
        ModeloTesis modelop = new ModeloTesis();    /* manejar las acciones que van a realizarse*/
        return modelop.crearTesis(p,a,b);                 /* al momento de crear, eliminar o modificar nuestra BD*/ 
    }
    public boolean deleteTesis(int idEscuela){        // creamos nuestras funciones de las cuales cada una
        ModeloTesis mp = new ModeloTesis();         // retornamos al crear un nuevo objeto de esa manera
        return mp.deleteTesis(idEscuela);             // nos facilita la ejecucion de dichas funciones.
    }
}
