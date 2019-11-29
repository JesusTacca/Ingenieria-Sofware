
package dominio.Servicio;

import dominio.Modelo.Profesor;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlarProfesorTest {
    Profesor po;
    @Before
    public void setUp() {
        po= new Profesor(300, "TestProfesor", "TestProfesor", "TestProfesor@gmail.com", 123123, "TestProfesor", "TestProfesor", "TestProfesor", "TestProfesor");
    }
    @Test
    public void testAutentificarProfesor() {
        String u = "profe";
        String p = "1234";
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.autentificarProfesor(u, p);
        assertEquals(expResult, result);
    }
    @Test
    public void testCrearProfesor() {
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.crearProfesor(po);
        assertEquals(expResult, result);
    }
    @Test
    public void testActualizarProfesor() {
        Profesor p = new Profesor(13, "TestProfesor", "TestProfesor"
                , "TestProfesor@gmail.com", 123123, "TestProfesor"
                , "TestProfesor", "TestProfesor", "TestProfesor");
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.actualizarProfesor(p);
        assertEquals(expResult, result);
    }
    @Test
    public void testEliminarProfesor() {
        int p = 300;
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.eliminarProfesor(p);
        assertEquals(expResult, result);

    }
}
