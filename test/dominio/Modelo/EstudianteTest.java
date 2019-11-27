/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fernando
 */
public class EstudianteTest {
    
    public EstudianteTest() {
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
     * Test of getCui method, of class Estudiante.
     */
    @Test
    public void testGetCui() {
        System.out.println("getCui");
        Estudiante instance = new Estudiante();
        int expResult = 0;
        int result = instance.getCui();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCui method, of class Estudiante.
     */
    @Test
    public void testSetCui() {
        System.out.println("setCui");
        int cui = 0;
        Estudiante instance = new Estudiante();
        instance.setCui(cui);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIngreso method, of class Estudiante.
     */
    @Test
    public void testGetIngreso() {
        System.out.println("getIngreso");
        Estudiante instance = new Estudiante();
        String expResult = "";
        String result = instance.getIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIngreso method, of class Estudiante.
     */
    @Test
    public void testSetIngreso() {
        System.out.println("setIngreso");
        String ingreso = "";
        Estudiante instance = new Estudiante();
        instance.setIngreso(ingreso);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
