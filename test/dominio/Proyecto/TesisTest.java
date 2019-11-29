/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.Proyecto;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class TesisTest {
    
    public TesisTest() {
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
     * Test of getEC method, of class Tesis.
     */
    @Test
    public void testGetEC() {
        System.out.println("getEC");
        Tesis instance = new Tesis();
        int expResult = 0;
        int result = instance.getEC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEC method, of class Tesis.
     */
    @Test
    public void testSetEC() {
        System.out.println("setEC");
        int estudiante_codigo = 0;
        Tesis instance = new Tesis();
        instance.setEC(estudiante_codigo);
    }
    
}
