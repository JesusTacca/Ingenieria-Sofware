
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
    /**
     * Test of autentificarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testAutentificarProfesor() {
        System.out.println("autentificarProfesor");
        String u = "profe";
        String p = "1234";
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.autentificarProfesor(u, p);
        assertEquals(expResult, result);

    }

    /**
     * Test of crearProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testCrearProfesor() {
        System.out.println("crearProfesor");
        
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.crearProfesor(po);
        assertEquals(expResult, result);

    }

    /**
     * Test of actualizarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testActualizarProfesor() {
        System.out.println("actualizarProfesor");
        Profesor p = new Profesor(13, "TestProfesor", "TestProfesor", "TestProfesor@gmail.com", 123123, "TestProfesor", "TestProfesor", "TestProfesor", "TestProfesor");
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.actualizarProfesor(p);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testEliminarProfesor() {
        System.out.println("eliminarProfesor");
        int p = 300;
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = true;
        boolean result = instance.eliminarProfesor(p);
        assertEquals(expResult, result);

    }
}
