/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.Escuela;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class CrearEscuelaTest {
    
    private static final String WEBSITE_URL = "http://localhost:8080/almacenamiento";

    public CrearEscuelaTest() {
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
     * Test of processRequest method, of class CrearEscuela.
     */
    @Test
    public void testProcessRequest() throws Exception {
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CrearEscuela instance = new CrearEscuela();
        instance.processRequest(request, response);
        // TODO review the generated test code and remove the default call to fail.
        if(response!=request)
        {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of doGet method, of class CrearEscuela.
     */
    @Test
    public void testDoGet() throws Exception {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CrearEscuela instance = new CrearEscuela();
        instance.doGet(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of doPost method, of class CrearEscuela.
     */
    @Test
    public void testDoPost() throws Exception {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        CrearEscuela instance = new CrearEscuela();
        instance.doPost(request, response);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getServletInfo method, of class CrearEscuela.
     */
    @Test
    public void testGetServletInfo() {
        System.out.println("getServletInfo");
        CrearEscuela instance = new CrearEscuela();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
