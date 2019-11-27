package dominio.Servicio;

import dominio.Modelo.Escuela;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class ControlarEscuelaTest {
    Escuela Base;
    
    @Before
    public void setUp() {
        Base = new Escuela(14,"Ciencia de la Computacion");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearEscuela method, of class ControlarEscuela.
     */
    @Test
    public void testCrearEscuela() {
        System.out.println("crearEscuela");
        Escuela p = Base;
        ControlarEscuela instance = new ControlarEscuela();
        boolean expResult = false;
        boolean result = instance.crearEscuela(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteEscuela method, of class ControlarEscuela.
     */
    @Test
    public void testDeleteEscuela() {
        System.out.println("deleteEscuela");
        int idEscuela = 14;
        ControlarEscuela instance = new ControlarEscuela();
        boolean expResult = false;
        boolean result = instance.deleteEscuela(idEscuela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of listarEscuelas method, of class ControlarEscuela.
     */
}
