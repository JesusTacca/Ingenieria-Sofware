package dominio.Modelo;

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
public class EscuelaTest {
    
    public EscuelaTest() {
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
     * Test of getId_escuela method, of class Escuela.
     */
    @Test
    public void testGetId_escuela() {
        System.out.println("getId_escuela");
        Escuela instance = new Escuela();
        int expResult = 0;
        int result = instance.getId_escuela();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult)
        {
            assertError();
        }
    }

    /**
     * Test of getNombre method, of class Escuela.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Escuela instance = new Escuela();
        instance.setNombre("Junior");
        String expResult = "Junior";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(!result.equals(expResult))
        {
            assertError();
        }
    }
    /**
     * Test of setId_escuela method, of class Escuela.
     */
    @Test
    public void testSetId_escuela() {
        System.out.println("setId_escuela");
        Escuela instance = new Escuela();
        int codigo = 0;
        instance.setId_escuela(codigo);
        assertEquals(codigo,0);
        // TODO review the generated test code and remove the default call to fail.
        if(codigo!=instance.getCodigo())
        {   
            assertError();
        }
    }

    /**
     * Test of setNombre method, of class Escuela.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Escuela instance = new Escuela();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        if(Nombre!=instance.getNombre()){
            assertError();
        }
    }
    /**
     * Test of getCodigo method, of class Escuela.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Escuela instance = new Escuela();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(result!=expResult)
        {
            assertError();
        }
    }

    /**
     * Test of setCodigo method, of class Escuela.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Escuela instance = new Escuela();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        if(codigo!=instance.getCodigo())
        {
            assertError();
        }
    }

    private void assertError() {
        throw new UnsupportedOperationException("Error"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
