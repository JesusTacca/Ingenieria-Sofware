/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public ControlarEscuelaTest() {
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
     * Test of crearEscuela method, of class ControlarEscuela.
     */
    @Test
    public void testCrearEscuela() {
        System.out.println("crearEscuela");
        Escuela p = null;
        ControlarEscuela instance = new ControlarEscuela();
        boolean expResult = false;
        boolean result = instance.crearEscuela(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEscuela method, of class ControlarEscuela.
     */
    @Test
    public void testDeleteEscuela() {
        System.out.println("deleteEscuela");
        int idEscuela = 0;
        ControlarEscuela instance = new ControlarEscuela();
        boolean expResult = false;
        boolean result = instance.deleteEscuela(idEscuela);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarEscuelas method, of class ControlarEscuela.
     */
    @Test
    public void testListarEscuelas() {
        System.out.println("listarEscuelas");
        ControlarEscuela instance = new ControlarEscuela();
        ArrayList<Escuela> expResult = null;
        ArrayList<Escuela> result = instance.listarEscuelas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
