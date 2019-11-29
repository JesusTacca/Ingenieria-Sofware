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
public class VisitanteTest {
    
    public VisitanteTest() {
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
     * Test of getNum_bancario method, of class Visitante.
     */
    @Test
    public void testGetNum_bancario() {
        System.out.println("getNum_bancario");
        Visitante instance = null;
        int expResult = 0;
        int result = instance.getNum_bancario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNum_bancario method, of class Visitante.
     */
    @Test
    public void testSetNum_bancario() {
        System.out.println("setNum_bancario");
        int num_bancario = 0;
        Visitante instance = null;
        instance.setNum_bancario(num_bancario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
