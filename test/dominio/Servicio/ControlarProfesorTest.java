
package dominio.Servicio;

import dominio.Modelo.Estudiante;
import dominio.Modelo.Profesor;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlarProfesorTest {
    
    public ControlarProfesorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of autentificarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testAutentificarProfesor() {
        System.out.println("autentificarProfesor");
        String u = "";
        String p = "";
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = false;
        boolean result = instance.autentificarProfesor(u, p);
        assertEquals(expResult, result);

    }

    /**
     * Test of crearProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testCrearProfesor() {
        System.out.println("crearProfesor");
        Profesor p = null;
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = false;
        boolean result = instance.crearProfesor(p);
        assertEquals(expResult, result);

    }

    /**
     * Test of actualizarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testActualizarProfesor() {
        System.out.println("actualizarProfesor");
        Profesor p = null;
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = false;
        boolean result = instance.actualizarProfesor(p);
        assertEquals(expResult, result);

    }

    /**
     * Test of eliminarProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testEliminarProfesor() {
        System.out.println("eliminarProfesor");
        int p = 0;
        ControlarProfesor instance = new ControlarProfesor();
        boolean expResult = false;
        boolean result = instance.eliminarProfesor(p);
        assertEquals(expResult, result);

    }

    /**
     * Test of getProfesorid method, of class ControlarProfesor.
     */
    @Test
    public void testGetProfesorid() {
        System.out.println("getProfesorid");
        int id = 0;
        ControlarProfesor instance = new ControlarProfesor();
        String expResult = "";
        String result = instance.getProfesorid(id);
        assertEquals(expResult, result);

    }

    /**
     * Test of getAllProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testGetAllProfesor() {
        System.out.println("getAllProfesor");
        ControlarProfesor instance = new ControlarProfesor();
        ArrayList<Profesor> expResult = null;
        ArrayList<Profesor> result = instance.getAllProfesor();
        assertEquals(expResult, result);

    }

    /**
     * Test of getallStuProfesor method, of class ControlarProfesor.
     */
    @Test
    public void testGetallStuProfesor() {
        System.out.println("getallStuProfesor");
        int c = 0;
        ControlarProfesor instance = new ControlarProfesor();
        ArrayList<Estudiante> expResult = null;
        ArrayList<Estudiante> result = instance.getallStuProfesor(c);
        assertEquals(expResult, result);

    }
    
}
