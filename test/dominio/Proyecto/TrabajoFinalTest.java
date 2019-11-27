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
public class TrabajoFinalTest {
    
    public TrabajoFinalTest() {
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
     * Test of getTipo method, of class TrabajoFinal.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        TrabajoFinal instance = new TrabajoFinal();
        String expResult = null;
        String result = instance.getTipo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipo method, of class TrabajoFinal.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        TrabajoFinal instance = new TrabajoFinal();
        instance.setTipo(tipo);
    }

    /**
     * Test of getCC method, of class TrabajoFinal.
     */
    @Test
    public void testGetCC() {
        System.out.println("getCC");
        TrabajoFinal instance = new TrabajoFinal();
        int expResult = 0;
        int result = instance.getCC();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCC method, of class TrabajoFinal.
     */
    @Test
    public void testSetCC() {
        System.out.println("setCC");
        int curso_codigo = 0;
        TrabajoFinal instance = new TrabajoFinal();
        instance.setCC(curso_codigo);
    }
    
}
