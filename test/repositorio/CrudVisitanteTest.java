/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import dominio.Modelo.Visitante;
import java.util.ArrayList;
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
public class CrudVisitanteTest {
    
    public CrudVisitanteTest() {
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
     * Test of crearVisitante method, of class CrudVisitante.
     */
    @Test
    public void testCrearVisitante() {
        System.out.println("crearVisitante");
        Visitante u = null;
        CrudVisitante instance = new CrudVisitante();
        boolean expResult = false;
        boolean result = instance.crearVisitante(u);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of autentificarVisitante method, of class CrudVisitante.
     */
    @Test
    public void testAutentificarVisitante() {
        System.out.println("autentificarVisitante");
        String user = "";
        String pass = "";
        CrudVisitante instance = new CrudVisitante();
        boolean expResult = false;
        boolean result = instance.autentificarVisitante(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAllVisitantes method, of class CrudVisitante.
     */
    @Test
    public void testGetAllVisitantes() {
        System.out.println("getAllVisitantes");
        CrudVisitante instance = new CrudVisitante();
        ArrayList<Visitante> expResult = null;
        ArrayList<Visitante> result = instance.getAllVisitantes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarVisitante method, of class CrudVisitante.
     */
    @Test
    public void testEliminarVisitante() {
        System.out.println("eliminarVisitante");
        int cod = 0;
        CrudVisitante instance = new CrudVisitante();
        boolean expResult = false;
        boolean result = instance.eliminarVisitante(cod);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
